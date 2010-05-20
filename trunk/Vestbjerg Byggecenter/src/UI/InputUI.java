/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package UI;

import java.util.Scanner;
/**
 *
 * @author Erik M. Gravesen
 */
public class InputUI
{
    private Scanner keyboard;

    public InputUI()
    {
        keyboard = new Scanner(System.in);
    }
    /***************************************
     * Start - inputUI for item
     ***************************************/

    public int inputItemID()
    {
        boolean succed = false;
        int itemID = 0;
        while(!succed)
        {
        // makes an object keyboard to have input from the console
           System.out.println("Angiv vareID:  ");
           try
           {
             itemID = keyboard.nextInt();
             succed = true;
           }
           catch(Exception e)
           {
             System.out.println("Fejl: Et heltal er påkrævet");
             pause();
           }
        }//end while
        
        return itemID;
    }

    public String inputDescription()
    {
        // creates an object keyboard to read data from the keyboard
        System.out.println(" Indtast beskrivelse:  ");
        String description = keyboard.nextLine();
        return description;
    }

    public double inputItemPrice()
    {
        boolean succed = false;
        double itemPrice = 0;
        while(!succed)
        {
            try
            {
                System.out.println("Angiv varepris:  ");
                itemPrice = keyboard.nextInt();
            }
            catch(Exception e)
            {
                System.out.println("Fejl: Et tal er påkrævet");
                pause();
            }
        }
        return itemPrice;
    }

    public int inputMaxInStock()
    {
        // creates an object keyboard to read data from the keyboard
        boolean succed = false;
        int maxInStock = 0;
        while(!succed)
        {
            try
            {
               System.out.println("Indtast maksimumsbeholdning:  ");
               maxInStock = keyboard.nextInt();
            }
            catch(Exception e)
            {
                System.out.println("Fejl: Et heltal er påkrævet");
                pause();
            }
        }
        return maxInStock;
    }

    public int inputMinInStock()
    {
        // creates an object keyboard to read data from the keyboard
        System.out.println("Indtast minimumsbeholdning:  ");
        int minInStock = keyboard.nextInt();
        return minInStock;
    }

    public int inputItemsInStock()
    {
        // creates an object keyboard to read data from the keyboard
        System.out.println("Indtast antal: ");
        int itemsInStock = keyboard.nextInt();
        return itemsInStock;
    }

    public String inputType()
    {
        // creates an object keyboard to read data from the keyboard
        System.out.println("Indtast type: ");
        String type = keyboard.nextLine();
        return type;
    }

    public String inputBrand()
    {
        // creates an object keyboard to read data from the keyboard
        System.out.println("Indtast brand: ");
        String brand = keyboard.nextLine();
        return brand;
    }

    public String inputPlace()
    {
        // creates an object keyboard to read data from the keyboard
        System.out.println("Indtast lokation: ");
        String place = keyboard.nextLine();
        return place;
    }

    /***************************************
     * End - inputUI for item
     ***************************************/

    private void pause()
    {
       System.out.println("Tryk retur for at fortsætte");
       keyboard.nextLine();
    }

}
