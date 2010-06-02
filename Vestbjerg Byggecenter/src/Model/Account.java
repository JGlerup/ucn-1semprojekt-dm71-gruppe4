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


    /**
     *
     * @param type
     * @param regNr
     * @param cardNr
     */
    public Account(String type, int regNr, int cardNr) {
        this.type = type;
        this.regNr = regNr;
        this.cardNr = cardNr;
    }

    /**
     *
     * @return
     */
    public int getCardNr() {
        return cardNr;
    }

    /**
     *
     * @param cardNr
     */
    public void setCardNr(int cardNr) {
        this.cardNr = cardNr;
    }

    /**
     *
     * @return
     */
    public int getRegNr() {
        return regNr;
    }

    /**
     *
     * @param regNr
     */
    public void setRegNr(int regNr) {
        this.regNr = regNr;
    }

    /**
     *
     * @return
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }



}
