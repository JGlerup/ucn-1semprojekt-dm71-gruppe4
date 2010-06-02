/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

/**
 *
 * @author Daniel
 */
public class RentableItem
{
    private int id;
    private String name;
    private boolean isRented;



    /**
     *
     * @param name
     */
    public RentableItem(String name)
    {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public int getID() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setID(int id) {
        this.id = id;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public boolean getIsRented()
     {
         return this.isRented;
     }

    /**
     *
     * @param isRented
     */
    public void setIsRented(boolean isRented)
     {
         this.isRented = isRented;
     }

}



