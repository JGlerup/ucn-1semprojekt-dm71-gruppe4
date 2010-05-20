/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package UI;

import Ctr.ItemCtr;
import java.util.Scanner;
/**
 *
 * @author Erik
 */
public class UpdateItemUI {

    private ItemCtr itemCtr;//DVD UI must know the DVD controller

    public UpdateItemUI()
    {
        itemCtr = new ItemCtr();
    }

    public void start()
    {

        itemMenu();
    }

    public void itemMenu()
    {
        boolean exit = false;
        while(!exit)
        {
            //show menu and return the user's choice
            int choice =   writeItemMenu();
            if (choice == 1)
            {
                updateItemPrice();
            }
            else
            {
                if(choice == 2)
                {
                   updateDescription();
                }
                else
                {
                    if(choice == 3)
                    {
                        updateMaxInStock();
                    }
                    else
                    {
                        if(choice == 4)
                        {
                             updateMinInStock();
                        }
                        else
                        {
                            if(choice == 5)
                            {
                                updateItemsInStock();
                            }
                            else
                            {
                                if(choice == 6)
                                {
                                    updateType();
                                }
                                else
                                {
                                    if(choice == 7)
                                    {
                                        updateBrand();
                                    }
                                    else
                                    {
                                        if(choice == 8)
                                        {
                                            updatePlace();
                                        }
                                        else
                                        {
                                            if(choice == 9)
                                            System.out.println("Hav en god dag");
                                            exit = true;
                                        }

                                    }
                                }

                            }
                        }
                    }
                }
            }
        }
    }

    private int writeItemMenu()
    {
           // creates an object keyboard to read data from the keyboard
            Scanner keyboard = new Scanner(System.in);
            System.out.println("\f *** Opdater vare ***");
            System.out.println(" (1) Opdater pris");
            System.out.println(" (2) Opdater beskrivelse");
            System.out.println(" (3) Opdater maksimumsbeholdning");
            System.out.println(" (4) Opdater minimumsbeholdning");
            System.out.println(" (5) Opdater antal");
            System.out.println(" (6) Opdater type");
            System.out.println(" (7) Opdater brand");
            System.out.println(" (8) Opdater lokation");
            System.out.println(" (9) Tilbage");
            System.out.print("\n Vælg et menupunkt: ");

            int choice = keyboard.nextInt();
            return choice;
    }

    private int inputItemID()
    {
        // creates an object keyboard to read data from the keyboard
        Scanner keyboard = new Scanner(System.in);
        System.out.println(" Indtast ID'et på en vare:  ");
        int itemID = keyboard.nextInt();
        return itemID;
    }

    private String inputDescription()
    {
        // creates an object keyboard to read data from the keyboard
        Scanner keyboard = new Scanner(System.in);
        System.out.println(" Indtast beskrivelse:  ");
        String description = keyboard.nextLine();
        return description;
    }

    private double inputItemPrice()
    {
        // creates an object keyboard to read data from the keyboard
        Scanner keyboard = new Scanner(System.in);
        System.out.println(" Indtast varepris:  ");
        double itemPrice = keyboard.nextInt();
        return itemPrice;
    }

    private int inputMaxInStock()
    {
        // creates an object keyboard to read data from the keyboard
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Indtast maksimumsbeholdning:  ");
        int maxInStock = keyboard.nextInt();
        return maxInStock;
    }

    private int inputMinInStock()
    {
        // creates an object keyboard to read data from the keyboard
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Indtast minimumsbeholdning:  ");
        int minInStock = keyboard.nextInt();
        return minInStock;
    }

    private int inputItemsInStock()
    {
        // creates an object keyboard to read data from the keyboard
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Indtast antal: ");
        int itemsInStock = keyboard.nextInt();
        return itemsInStock;
    }

    private String inputType()
    {
        // creates an object keyboard to read data from the keyboard
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Indtast type: ");
        String type = keyboard.nextLine();
        return type;
    }

    private String inputBrand()
    {
        // creates an object keyboard to read data from the keyboard
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Indtast brand: ");
        String brand = keyboard.nextLine();
        return brand;
    }

    private String inputPlace()
    {
        // creates an object keyboard to read data from the keyboard
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Indtast lokation: ");
        String place = keyboard.nextLine();
        return place;
    }

    private void updateItemPrice()
    {
        int itemID = inputItemID();
        if(itemCtr.getItem(itemID) != null)
        {
            double oldItemPrice = itemCtr.getItem(itemID).getItemPrice();
            double itemPrice = inputItemPrice();
            itemCtr.updateItemPrice(itemID, itemPrice);
            System.out.println("Prisen er blevet ændret fra " + oldItemPrice + " til " + itemPrice);

        }
        else
        {
            System.out.println("ID'et findes ikke");
        }
    }

    private void updateDescription()
    {
        int itemID = inputItemID();
        if(itemCtr.getItem(itemID) != null)
        {
            String oldDescription = itemCtr.getItem(itemID).getDescription();
            String description = inputDescription();
            itemCtr.updateDescription(itemID, description);
            System.out.println("Beskrivelsen er blevet ændret fra " + oldDescription + " til " + description);
        }
        else
        {
            System.out.println("ID'et findes ikke");
        }
    }

    private void updateMaxInStock()
    {
        int itemID = inputItemID();
        if(itemCtr.getItem(itemID) != null)
        {
            int oldMaxInStock = itemCtr.getItem(itemID).getMaxInStock();
            int maxInStock = inputMaxInStock();
            itemCtr.updateMaxInStock(itemID, maxInStock);
            System.out.println("Maksimumsbeholdningen er blevet ændret fra " + oldMaxInStock + "til " + maxInStock);
        }
        else
        {
            System.out.println("ID'et findes ikke");
        }

    }

    private void updateMinInStock()
    {
        int itemID = inputItemID();
        if(itemCtr.getItem(itemID) != null)
        {
            int oldMinInStock = itemCtr.getItem(itemID).getMinInStock();
            int minInStock = inputMinInStock();
            itemCtr.updateMinInStock(itemID, minInStock);
            System.out.println("Minimumsbeholdningen er blevet ændret fra " + oldMinInStock + " til " + minInStock);
        }
        else
        {
            System.out.println("ID'et findes ikke");
        }

    }

    private void updateItemsInStock()
    {
        int itemID = inputItemID();
        if(itemCtr.getItem(itemID) != null)
        {
            int oldItemsInStock = itemCtr.getItem(itemID).getItemsInStock();
            int itemsInStock = inputItemsInStock();
            itemCtr.updateMaxInStock(itemID, itemsInStock);
            System.out.println("Antallet er blevet ændret fra " + oldItemsInStock + " til " + itemsInStock);
        }
        else
        {
            System.out.println("ID'et findes ikke");
        }

    }

    private void updateType()
    {
        int itemID = inputItemID();
        if(itemCtr.getItem(itemID) != null)
        {
            String oldType = itemCtr.getItem(itemID).getType();
            String type = inputType();
            itemCtr.updateType(itemID, type);
            System.out.println("Typen er blevet ændret fra " + oldType + "til " + type);
        }
        else
        {
            System.out.println("ID'et findes ikke");
        }

    }

    private void updateBrand()
    {
        int itemID = inputItemID();
        if(itemCtr.getItem(itemID) != null)
        {
            String oldBrand = itemCtr.getItem(itemID).getBrand();
            String brand = inputBrand();
            itemCtr.updateBrand(itemID, brand);
            System.out.println("Maksimumsbeholdningen er blevet ændret fra " + oldBrand + " til " + brand);
        }
        else
        {
            System.out.println("ID'et findes ikke");
        }
    }

    private void updatePlace()
    {
        int itemID = inputItemID();
        if(itemCtr.getItem(itemID) != null)
        {
            String oldPlace = itemCtr.getItem(itemID).getPlace();
            String place = inputPlace();
            itemCtr.updatePlace(itemID, place);
            System.out.println("Maksimumsbeholdningen er blevet ændret fra " + oldPlace + " til " + place);
        }
        else
        {
            System.out.println("ID'et findes ikke");
        }
    }
}
