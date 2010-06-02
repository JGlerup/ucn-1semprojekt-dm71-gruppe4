/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 * Klassen repræsenterer et unit-objekt. Informationer om eksemplarer bliver
 * gemt og kan hentes.
 */
public class Unit {

    private int serialNo;

    /**
     * Konstruktør
     * Initialiserer eksemplaret
     * @param serialNo
     */
    public Unit(int serialNo) {
        this.serialNo = serialNo;
    }

    public int getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(int serialNo) {
        this.serialNo = serialNo;
    }
}
