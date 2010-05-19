/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

/**
 *
 * @author Daniel
 */
public class Employee extends Person {

    private int employeeID;
    private String password;



    public Employee(String name, String address, int phone, String password) {
        super(name, address, phone);
        this.password = password;
    }


    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }






}
