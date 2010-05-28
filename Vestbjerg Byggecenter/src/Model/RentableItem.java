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



    public RentableItem(String name)
    {
        this.name = name;
    }

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getIsRented()
     {
         return this.isRented;
     }

     public void setIsRented(boolean isRented)
     {
         this.isRented = isRented;
     }

}



