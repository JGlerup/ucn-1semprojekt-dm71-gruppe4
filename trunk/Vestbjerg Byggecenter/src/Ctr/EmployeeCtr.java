/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Ctr;
import Model.Employee;
import Model.EmployeeContainer;

/**
 * Controller-klassen for Employee
 */
public class EmployeeCtr {
   
    private EmployeeContainer employeeContainer;

    /**
     * Konstruktør
     * Initialiserer feltet employeeContainer
     */
    public EmployeeCtr()
{
    employeeContainer = EmployeeContainer.getInstance();
}



    /**
     * En metode, der laver et objekt af klassen Employee
     * @param name
     * @param address
     * @param phone
     * @param password
     * @return Et medarbejder-ID
     */
    public int createEmployee(String name, String address, String phone)
    {
        Employee e = new Employee(name, address, phone);
        return employeeContainer.addEmployee(e);
    }

    /**
     * En metode, der kalder metoden deleteEmployee
     * @param employeeID
     */
    public void deleteEmployee(int employeeID)
    {
        employeeContainer.deleteEmployee(employeeID);
    }

    /**
     * En metode, der kalder metoden getEmployee. Den søger efter et objekt af
     * klassen Employee.
     * @param employeeID
     * @return Et objekt af klassen Employee
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
        String outputString = "ID: " + e.getEmployeeID() + "\n" + "Name: " + e.getName() + "\n" + "Address: " + e.getAddress() + "\n" + "Trade: " + e.getTrade();
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
    public void updateEmployee(int employeeID, String name, String address, String phone)
    {
        employeeContainer.updateEmployee(employeeID, name, address, phone);
    }

    /**
     * @return En ArrayList over objekter af klassen Employee
     */
    public String ListAllEmployees()
    {
        return employeeContainer.listAllEmployees();
    }

    /**
     * En metode, der opdaterer medarbejderens navn
     * @param itemID
     * @param itemName
     */
    // public void updateName(int employeeID, String name)
   // {
   //     Employee c = findEmployee(employeeID);
   //     c.setName(name);
   // }
    /**
     * En metode, der opdaterer medarbejderens adresse
     * @param itemID
     * @param itemName
     */
  //  public void updateAddress(int employeeID, String address)
  //  {
 //       Employee e = getEmployee(employeeID);
  //      e.setAddress(address);
  //  }
    /**
     * En metode, der opdaterer medarbejderens telefonnummer
     * @param itemID
     * @param itemName
     */
  //  public void updatePhone(int employeeID, int phone)
   // {
  //      Employee c = getEmployee(employeeID);
  //      c.setPhone(phone);
  //  }
}