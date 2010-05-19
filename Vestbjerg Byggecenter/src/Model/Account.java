/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

/**
 *
 * @author Daniel
 */
public class Account {

    private String type;
    private int regNr;
    private int cardNr;


    public Account(String type, int regNr, int cardNr) {
        this.type = type;
        this.regNr = regNr;
        this.cardNr = cardNr;
    }

    public int getCardNr() {
        return cardNr;
    }

    public void setCardNr(int cardNr) {
        this.cardNr = cardNr;
    }

    public int getRegNr() {
        return regNr;
    }

    public void setRegNr(int regNr) {
        this.regNr = regNr;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }



}
