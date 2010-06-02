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
   
    private EmployeeContainer employeeContainer;

    /**
     *
     */
    public EmployeeCtr()
{
    employeeContainer = EmployeeContainer.getInstance();
}



    /**
     *
     * @param name
     * @param address
     * @param phone
     * @param password
     * @return
     */
    public int createEmployee(String name, String address, String phone, String password)
    {
        Employee e = new Employee(name, address, phone, password);
        return employeeContainer.addEmployee(e);
    }

    /**
     *
     * @param employeeID
     */
    public void deleteEmployee(int employeeID)
    {
        employeeContainer.deleteEmployee(employeeID);
    }

    /**
     *
     * @param employeeID
     * @return
     */
    public Employee getEmployee(int employeeID)
    {
        return employeeContainer.getEmployee(employeeID);
    }

    /**
     *
     * @param employeeID
     * @return
     */
    public String findEmployee(int employeeID)
    {
        Employee e = employeeContainer.findEmployee(employeeID);
        String outputString = "ID: " + e.getEmployeeID() + "\n" + "Name: " + e.getName() + "\n" + "Address: " + e.getAddress();
        return outputString;
    }

    /**
     *
     * @param employeeID
     * @param password
     * @param name
     * @param address
     * @param phone
     */
    public void updateEmployee(int employeeID, String password, String name, String address, String phone)
    {
        employeeContainer.updateEmployee(employeeID, password, name, address, phone);
    }

    /**
     *
     * @return
     */
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