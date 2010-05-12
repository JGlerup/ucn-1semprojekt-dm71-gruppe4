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

    private int employeeId;
    private String password;




    public Employee(String name, String address,int phone,int employeeId, String password) {

        super (name, address, phone);
        this.employeeId = employeeId;
        this.password = password;
    }






}
