/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Ctr;
import Model.Employee;
import Model.EmployeeContainer;

/**
 *
 * @author KL-DELL
 */
public class EmployeeCtr {
    private Employee employee;
    private EmployeeContainer employeeContainer;





    public void createEmployee(String name, String address, int phone, String password)
    {
            int employeeID = employeeContainer.generateID();
            Employee e = new Employee(employeeID, name, address, phone, password);
            employeeContainer.addEmployee(e);
    }

    public void deleteEmployee(int employeeID)
    {
        employeeContainer.deleteEmployee(employeeID);
    }

    public String findEmployee(int employeeID)
    {
        Employee e = employeeContainer.findEmployee(employeeID);
        String outputString = "ID: " + e.getEmployeeID() + "\n" + "Name: " + e.getName() + "\n" + "Address: " + e.getAddress();
        return outputString;
    }

    public void updateEmployee(int employeeID, String password, String name, String address, int phone)
    {
        employeeContainer.updateEmployee(employeeID, password, name, address, phone);
    }

    public String ListAllEmployees()
    {
        return employeeContainer.listAllEmployees();
    }
}