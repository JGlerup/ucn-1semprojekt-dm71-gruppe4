/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 * Klassen repræsenterer et employee-objekt, som arver fra klassen Person
 * Informationer om medarbejderen bliver gemt og kan hentes.
 */
public class Employee extends Person {

    private int employeeID;
    private double trade;

    /**
     * Konstruktør
     * Initialiserer medarbejderen
     * @param name
     * @param address
     * @param phone
     * @param password
     */
    public Employee(String name, String address, String phone) {
        super(name, address, phone);
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public double getTrade() {
        return trade;
    }

    public void setTrade(double trade) {
        this.trade = trade;
    }
}
