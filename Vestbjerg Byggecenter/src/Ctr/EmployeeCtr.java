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





    public void createEmployee(int employeeID, String password, String name, String address, int phone)
    {
            employeeID = employeeContainer.generateID();
            Employee e = new Employee(employeeID, password, name, address, phone);
            employeeContainer.addEmployee(e);
    }


}