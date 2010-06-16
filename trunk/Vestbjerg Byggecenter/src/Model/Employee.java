/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.text.DecimalFormat;

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
//        return trade;
//        DecimalFormat twoDForm = new DecimalFormat("#.##");
//        return Double.valueOf(twoDForm.format(trade));
//                double x = trade;
//        x = (Math.rint(x*100.0)) / 100.0;
        return Math.rint(trade*100.0) / 100.0;
    }

    public void setTrade(double trade) {
        this.trade = trade;
    }
}
