/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 * Klassen repræsenterer et employee-objekt. Informationer om medarbejderen
 * bliver gemt og kan hentes.
 */
public class Employee extends Person {

    private int employeeID;
    private String password;
    private double trade;

    /**
     * Konstruktør
     * Initialiserer medarbejderen
     * @param name
     * @param address
     * @param phone
     * @param password
     */
    public Employee(String name, String address, String phone, String password) {
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

    public double getTrade() {
        return trade;
    }

    public void setTrade(double trade) {
        this.trade = trade;
    }
}
