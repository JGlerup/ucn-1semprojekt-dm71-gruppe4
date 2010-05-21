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
        boolean succeed = false;
        int itemID = 0;
        while(!succeed)
        {
        // makes an object keyboard to have input from the console
           System.out.println("Angiv vareID:  ");
           try
           {
             itemID = keyboard.nextInt();
             succeed = true;
           }
           catch(Exception e)
           {
             System.out.println("Fejl: Et heltal er påkrævet");
           }
        }//end while
        
        return itemID;
    }

    public String inputDescription()
    {
        // creates an object keyboard to read data from the keyboard
        System.out.println("Indtast beskrivelse:  ");
        String description = keyboard.next();
        return description;
    }

    public double inputItemPrice()
    {
        boolean succeed = false;
        double itemPrice = 0;
        while(!succeed)
        {
            try
            {
                System.out.println("Angiv varepris:  ");
                itemPrice = keyboard.nextDouble();
                succeed = true;
            }
            catch(Exception e)
            {
                System.out.println("Fejl: Et tal er påkrævet");
            }
        }
        return itemPrice;
    }

    public int inputMaxInStock()
    {
        // creates an object keyboard to read data from the keyboard
        boolean succeed = false;
        int maxInStock = 0;
        while(!succeed)
        {
            try
            {
               System.out.println("Indtast maksimumsbeholdning:  ");
               maxInStock = keyboard.nextInt();
               succeed = true;
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
        String type = keyboard.next();
        return type;
    }

    public String inputBrand()
    {
        // creates an object keyboard to read data from the keyboard
        System.out.println("Indtast brand: ");
        String brand = keyboard.next();
        return brand;
    }

    public String inputPlace()
    {
        // creates an object keyboard to read data from the keyboard
        System.out.println("Indtast lokation: ");
        String place = keyboard.next();
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

    public boolean yesOrNo()
    {
        boolean succeed = false;
        while(!succeed)
        {
            System.out.println("Er du sikker? (y/n)");
            String input = keyboard.next();
            if(input.equals("y"))
            {
                succeed = true;

            }
            if(input.equals("n"))
            {
                succeed = true;
            }
        }
        return succeed;
    }

     /***************************************
     * Start - inputUI for Customer
     ***************************************/

     public String inputName()
    {
         // makes an object keyboard to have input from the screen
         System.out.println(" Indtast Name:  ");
         String name = keyboard.nextLine();
         return name;
    }

     public String inputAddress()
    {
         // makes an object keyboard to have input from the screen
         System.out.println(" Indtast Address:  ");
         String address = keyboard.nextLine();
         return address;
    }

     public int inputPhone()
    {
         // makes an object keyboard to have input from the screen
         System.out.println(" Indtast telefon nummer: ");
         int phone = keyboard.nextInt();
         return phone;
    }


     public int inputRegNr()
    {
         // makes an object keyboard to have input from the screen
         System.out.println(" Indtast reg nummeret: ");
         int regNr = keyboard.nextInt();
         return regNr;
    }


      public int inputCardNr()
    {
         // makes an object keyboard to have input from the screen
         System.out.println(" indtast kortnummer: ");
         int cardNr = keyboard.nextInt();
         return cardNr;
    }

}
