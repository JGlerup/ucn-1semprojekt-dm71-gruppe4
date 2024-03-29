/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package UI;

import java.util.Scanner;
import java.util.InputMismatchException;

public class InputUI
{
    private Scanner keyboard;

    /**
     *
     */
    public InputUI()
    {
        keyboard = new Scanner(System.in);
    }


    /**
     *
     * @return
     */
    public int inputEmployeeID()
    {
        boolean succeed = false;
        int itemID = 0;
        while(!succeed)
        {
        // makes an object keyboard to have input from the console
           System.out.println("Indtast medarbejder-ID:  ");
           try
           {
             itemID = keyboard.nextInt();
             keyboard.nextLine();
             if(itemID < 1)
             {
                 throw new IllegalArgumentException("x < 1");
             }
             succeed = true;
           }
           catch(InputMismatchException e)
           {
               System.out.println("Fejl: Et tal er påkrævet");
               keyboard.nextLine();
           }
           catch(IllegalArgumentException e)
           {
               System.out.println("Fejl: Indtast et tal, højere end 0");
               keyboard.nextLine();
           }
        }//end while

        return itemID;
    }

    /**
     *
     * @return
     */
    public int inputCustomerID()
    {
        boolean succeed = false;
        int itemID = 0;
        while(!succeed)
        {
        // makes an object keyboard to have input from the console
           System.out.println("Indtast kunde-ID:  ");
           try
           {
             itemID = keyboard.nextInt();
             keyboard.nextLine();
             if(itemID < 1)
             {
                 throw new IllegalArgumentException("x < 1");
             }
             succeed = true;
           }
           catch(InputMismatchException e)
           {
               System.out.println("Fejl: Et tal er påkrævet");
               keyboard.nextLine();
           }
           catch(IllegalArgumentException e)
           {
               System.out.println("Fejl: Indtast et tal, højere end 0");
               keyboard.nextLine();
           }
        }//end while

        return itemID;
    }

    /**
     *
     * @return
     */
    public int inputItemID()
    {
        boolean succeed = false;
        int itemID = 0;
        while(!succeed)
        {
        // makes an object keyboard to have input from the console
           System.out.println("Indtast vare-ID:  ");
           try
           {
             itemID = keyboard.nextInt();
             keyboard.nextLine();
             if(itemID < 1)
             {
                 throw new IllegalArgumentException("x < 1");
             }
             succeed = true;
           }
           catch(InputMismatchException e)
           {
               System.out.println("Fejl: Et tal er påkrævet");
               keyboard.nextLine();
           }
           catch(IllegalArgumentException e)
           {
               System.out.println("Fejl: Indtast et tal, højere end 0");
               keyboard.nextLine();
           }
        }//end while

        return itemID;
    }


    public int inputItemQuantity()
    {
        boolean succeed = false;
        int quantity = 0;
        while(!succeed)
        {
            try
            {
                System.out.println("Indtast antal varer: ");
                quantity = keyboard.nextInt();
                keyboard.nextLine();
                if(quantity < 0)
                {
                    throw new IllegalArgumentException("x < 0");
                }
                succeed = true;
            }
            catch(IllegalArgumentException e)
            {
                System.out.println("Fejl: Tallet skal være 0 eller mere");
                keyboard.nextLine();
            }
            catch(InputMismatchException e)
            {
                System.out.println("Fejl: Et heltal er påkrævet");
                keyboard.nextLine();
            }
        }
        return quantity;
    }

    /**
     *
     * @return
     */
    public int inputUpdateItemQuantity()
    {
        boolean succeed = false;
        int quantity = 0;
        while(!succeed)
        {
            try
            {
                System.out.println("Indtast antal varer, som skal tilføjes: ");
                quantity = keyboard.nextInt();
                keyboard.nextLine();
                if(quantity < 0)
                {
                    throw new IllegalArgumentException("x < 0");
                }
                succeed = true;
            }
            catch(IllegalArgumentException e)
            {
                System.out.println("Fejl: Tallet skal være 0 eller mere");
                keyboard.nextLine();
            }
            catch(InputMismatchException e)
            {
                System.out.println("Fejl: Et heltal er påkrævet");
                keyboard.nextLine();
            }
        }
        return quantity;
    }



    /**
     *
     * @return
     */
    public int inputID()
    {
        boolean succeed = false;
        int itemID = 0;
        while(!succeed)
        {
        // makes an object keyboard to have input from the console
           System.out.println("Indtast ID:  ");
           try
           {
             itemID = keyboard.nextInt();
             keyboard.nextLine();
             if(itemID < 1)
             {
                 throw new IllegalArgumentException("x < 1");
             }
             succeed = true;
           }
           catch(InputMismatchException e)
           {
               System.out.println("Fejl: Et tal er påkrævet");
               keyboard.nextLine();
           }
           catch(IllegalArgumentException e)
           {
               System.out.println("Fejl: Indtast et tal, højere end 0");
               keyboard.nextLine();
           }
        }//end while
        
        return itemID;
    }

    /**
     *
     * @return
     */
    public String inputItemName()
    {
        System.out.println("Indtast navn: ");
        String itemName = keyboard.nextLine();
        return itemName;
    }

    /**
     *
     * @return
     */
    public int inputSerialNo()
    {
        // creates an object keyboard to read data from the keyboard;
        System.out.println("Indtast serienummer: ");
        int serialNo = keyboard.nextInt();
        keyboard.nextLine();
        return serialNo;
    }

    /**
     *
     * @return
     */
    public double inputDiscount()
    {
        // creates an object keyboard to read data from the keyboard;
        System.out.println("Indtast Discount: ");
        double discount = keyboard.nextDouble();
        return discount;
    }

    /**
     *
     * @return
     */
    public String inputDescription()
    {
        // creates an object keyboard to read data from the keyboard
        System.out.println("Indtast beskrivelse:  ");
        String description = keyboard.nextLine();
        return description;
    }

    /**
     *
     * @return
     */
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
                keyboard.nextLine();
                if(itemPrice <= 0)
                {
                    throw new IllegalArgumentException("x <= 0");
                }
                succeed = true;
            }
            catch(InputMismatchException e)
            {
                System.out.println("Fejl: Et tal er påkrævet");
                keyboard.nextLine();
            }
            catch(IllegalArgumentException e)
            {
                System.out.println("Fejl: Prisen skal være over 0");
            }

        }
        return itemPrice;
    }

    /**
     *
     * @return
     */
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
                keyboard.nextLine();
                if(maxInStock < 1)
                {
                    throw new IllegalArgumentException("x < 1");
                }
                succeed = true;
            }
            catch(InputMismatchException e)
            {
                System.out.println("Fejl: Et heltal er påkrævet");
                keyboard.nextLine();
            }
            catch(IllegalArgumentException e)
            {
                System.out.println("Fejl: Tallet skal mindst være 1");
                keyboard.nextLine();
            }
        }
        return maxInStock;
    }

    /**
     *
     * @return
     */
    public int inputMinInStock()
    {
        // creates an object keyboard to read data from the keyboard
        boolean succeed = false;
        int minInStock = 0;
        while(!succeed)
        {
            try
            {
                System.out.println("Indtast minimumsbeholdning:  ");
                minInStock = keyboard.nextInt();
                keyboard.nextLine();
                if(minInStock < 0)
                {
                    throw new IllegalArgumentException("x < 0");
                }
                succeed = true;
            }
            catch(InputMismatchException e)
            {
                System.out.println("Fejl: Et heltal er påkrævet");
                keyboard.nextLine();
            }
            catch(IllegalArgumentException e)
            {
                System.out.println("Fejl: Tallet skal mindst være 0");
                keyboard.nextLine();
            }
        }

        return minInStock;
    }

    /**
     *
     * @return
     */
    public int inputItemsInStock()
    {
        // creates an object keyboard to read data from the keyboard
        boolean succeed = false;
        int itemsInStock = 0;
        while(!succeed)
        {
            try
            {
                System.out.println("Indtast antal: ");
                itemsInStock = keyboard.nextInt();
                keyboard.nextLine();
                if(itemsInStock < 0)
                {
                    throw new IllegalArgumentException("x < 0");
                }
                succeed = true;
            }
            catch(IllegalArgumentException e)
            {
                System.out.println("Fejl: Tallet skal være over 0");
                keyboard.nextLine();
            }
            catch(InputMismatchException e)
            {
                System.out.println("Fejl: Et heltal er påkrævet");
                keyboard.nextLine();
            }
        }
        return itemsInStock;
    }

    /**
     *
     * @return
     */
    public String inputType()
    {
        // creates an object keyboard to read data from the keyboard
        System.out.println("Indtast type: ");
        String type = keyboard.nextLine();
        return type;
    }

    /**
     *
     * @return
     */
    public String inputBrand()
    {
        // creates an object keyboard to read data from the keyboard
        System.out.println("Indtast brand: ");
        String brand = keyboard.nextLine();
        return brand;
    }

    /**
     *
     * @return
     */
    public String inputPlace()
    {
        // creates an object keyboard to read data from the keyboard
        System.out.println("Indtast lokation: ");
        String place = keyboard.nextLine();
        return place;
    }


    public void pause()
    {
       System.out.println("Tryk retur for at fortsætte");
       keyboard.nextLine();
//       keyboard.nextLine(); //Tilføjet, da den forrige nogle gange springes over
    }

    /**
     *
     * @return
     */
    public boolean yesOrNo()
    {
        boolean isYes = false;
        boolean succeed = false;
        while(!succeed)
        {
            System.out.println("Er du sikker? (y/n)");
            String input = keyboard.nextLine();
            if(input.equals("y"))
            {
                isYes = true;
                succeed = true;

            }
            if(input.equals("n"))
            {
                isYes = false;
                succeed = true;
            }
        }
        return isYes;
    }

    /**
     *
     * @return
     */
    public boolean UnitYesOrNo()
    {
        boolean isYes = false;
        boolean succeed = false;
        while(!succeed)
        {
            System.out.println("Er det med serienummer? (y/n)");
            String input = keyboard.nextLine();
            if(input.equals("y"))
            {
                isYes = true;
                succeed = true;

            }
            if(input.equals("n"))
            {
                isYes = false;
                succeed = true;
            }
        }
        return isYes;
    }



    public String inputName()
    {
        boolean succeed = false;
        String name = "";
        while(!succeed)
        {
             try
             {

                System.out.println(" Indtast Name:  ");
                name = keyboard.nextLine();

                if(name.matches("[^a-zA-Z_]+"))
                {
                    throw new IllegalArgumentException();
                    
                }
                else
                {
                    succeed = true;
                }
                

             }
             catch(IllegalArgumentException e)
             {
                 System.out.println("Navnet må kun indeholde bogstaver");
             }
        }
        return name;
    }

    /**
     *
     * @return
     */
    public String inputAddress()
    {
         // makes an object keyboard to have input from the screen
         System.out.println(" Indtast Address:  ");
         String address = keyboard.nextLine();
         return address;
    }

    /**
     *
     * @return
     */
    public String inputPhone()
    {
         // makes an object keyboard to have input from the screen
         System.out.println(" Indtast telefon nummer: ");
         String phone = keyboard.nextLine();
         return phone;
    }


     /**
      *
      * @return
      */
     public int inputRegNr()
    {
         // makes an object keyboard to have input from the screen
         System.out.println(" Indtast reg nummeret: ");
         int regNr = keyboard.nextInt();
         keyboard.nextLine();
         return regNr;
    }


     /**
      *
      * @return
      */
     public int inputCardNr()
    {
         // makes an object keyboard to have input from the screen
         System.out.println(" indtast kortnummer: ");
         int cardNr = keyboard.nextInt();
         keyboard.nextLine();
         return cardNr;
    }

     /**
      *
      * @return
      */
     public String inputSaleDate()
    {
        System.out.println("Indtast dato: ");
        String saleDate = keyboard.nextLine();
        return saleDate;
    }

    /**
     *
     * @return
     */
    public String inputDate()
    {
        System.out.println(" Indtast dato: ");
        String Date = keyboard.nextLine();
        return Date;
    }

    /**
     *
     * @return
     */
    public String inputStatus()
    {
        System.out.println(" Indtast Status: ");
        String Date = keyboard.nextLine();
        return Date;
    }
}