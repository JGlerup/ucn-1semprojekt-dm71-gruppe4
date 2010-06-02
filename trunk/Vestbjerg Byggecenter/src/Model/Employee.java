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
    private double trade;
   



    /**
     *
     * @param name
     * @param address
     * @param phone
     * @param password
     */
    public Employee(String name, String address, String phone, String password)
    {
        super(name, address, phone);
        this.password = password;
    }


    /**
     *
     * @return
     */
    public int getEmployeeID() {
        return employeeID;
    }

    /**
     *
     * @param employeeID
     */
    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    /**
     *
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     *
     * @return
     */
    public double getTrade() {
        return trade;
    }

    /**
     *
     * @param trade
     */
    public void setTrade(double trade) {
        this.trade = trade;
    }
    
    






}
