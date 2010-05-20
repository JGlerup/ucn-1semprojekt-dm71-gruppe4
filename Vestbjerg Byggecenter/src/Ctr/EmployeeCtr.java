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

public EmployeeCtr()
{
    employeeContainer = EmployeeContainer.getInstance();
}



    public int createEmployee(String name, String address, int phone, String password)
    {
        Employee e = new Employee(name, address, phone, password);
        return employeeContainer.addEmployee(e);
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

    // public void updateName(int employeeID, String name)
   // {
   //     Employee c = findEmployee(employeeID);
   //     c.setName(name);
   // }

  //  public void updateAddress(int employeeID, String address)
  //  {
 //       Employee e = getEmployee(employeeID);
  //      e.setAddress(address);
  //  }

  //  public void updateAddress(int employeeID, int phone)
   // {
  //      Employee c = getEmployee(employeeID);
  //      c.setPhone(phone);
  //  }

//    public void updatePassword(int employeeID, String password)
 //   {
 //       Employee c = getEmployee(employeeID);
  //      c.setPassword(password);
  //  }
}