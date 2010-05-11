/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

/**
 *
 * @author Daniel
 */
public class Stock {

    private static Stock instance;

    public static Stock getInstance()
    {
        if (instance == null)
        {
            instance = new Stock();
        }
        return instance;
    }


    ArrayList<Unit> units;

    public Stock()
    {
        units = new ArrayList<Unit>();
    }

}
