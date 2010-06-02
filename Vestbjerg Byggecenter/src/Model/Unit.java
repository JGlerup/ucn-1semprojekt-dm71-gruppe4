/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

/**
 *
 * @author Daniel
 */
public class Unit {

    private int serialNo;

    /**
     *
     * @param serialNo
     */
    public Unit(int serialNo)
    {
        this.serialNo = serialNo;
    }

    /**
     *
     * @return
     */
    public int getSerialNo() {
        return serialNo;
    }

    /**
     *
     * @param serialNo
     */
    public void setSerialNo(int serialNo) {
        this.serialNo = serialNo;
    }

}
