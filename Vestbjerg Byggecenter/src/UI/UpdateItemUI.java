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
    private InputUI inputUI;
    private int itemID;

    public UpdateItemUI()
    {
        itemCtr = new ItemCtr();
        inputUI = new InputUI();
    }

    public void start()
    {
        itemMenu();
    }

    public void itemMenu()
    {
        try
        {
            boolean exit = false;
            while(!exit)
            {
                int choice =   writeItemMenu();
                switch(choice)
                {
                    case 1:
                        updateItemPrice();
                        break;
                    case 2:
                        updateDescription();
                        break;
                    case 3:
                        updateMaxInStock();
                        break;
                    case 4:
                        updateMinInStock();
                        break;
                    case 5:
                        updateItemsInStock();
                        break;
                    case 6:
                        updateType();
                        break;
                    case 7:
                        updateBrand();
                        break;
                    case 8:
                        updateLocation();
                        break;
                    case 9:
                        exit = true;
                        break;
                }
            }
        }
        catch(Exception e)
        {
            start();
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

    private void updateItemPrice()
    {
        int itemID = inputUI.inputItemID();
        if(itemCtr.getItem(itemID) != null)
        {
            double oldItemPrice = itemCtr.getItem(itemID).getItemPrice();
            double itemPrice = inputUI.inputItemPrice();
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
        int itemID = inputUI.inputItemID();
        if(itemCtr.getItem(itemID) != null)
        {
            String oldDescription = itemCtr.getItem(itemID).getDescription();
            String description = inputUI.inputDescription();
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
        int itemID = inputUI.inputItemID();
        if(itemCtr.getItem(itemID) != null)
        {
            int oldMaxInStock = itemCtr.getItem(itemID).getMaxInStock();
            int maxInStock = inputUI.inputMaxInStock();
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
        int itemID = inputUI.inputItemID();
        if(itemCtr.getItem(itemID) != null)
        {
            int oldMinInStock = itemCtr.getItem(itemID).getMinInStock();
            int minInStock = inputUI.inputMinInStock();
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
        int itemID = inputUI.inputItemID();
        if(itemCtr.getItem(itemID) != null)
        {
            int oldItemsInStock = itemCtr.getItem(itemID).getItemsInStock();
            int itemsInStock = inputUI.inputItemsInStock();
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
        int itemID = inputUI.inputItemID();
        if(itemCtr.getItem(itemID) != null)
        {
            String oldType = itemCtr.getItem(itemID).getType();
            String type = inputUI.inputType();
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
        int itemID = inputUI.inputItemID();
        if(itemCtr.getItem(itemID) != null)
        {
            String oldBrand = itemCtr.getItem(itemID).getBrand();
            String brand = inputUI.inputBrand();
            itemCtr.updateBrand(itemID, brand);
            System.out.println("Maksimumsbeholdningen er blevet ændret fra " + oldBrand + " til " + brand);
        }
        else
        {
            System.out.println("ID'et findes ikke");
        }
    }

    private void updateLocation()
    {
        int itemID = inputUI.inputItemID();
        if(itemCtr.getItem(itemID) != null)
        {
            String oldPlace = itemCtr.getItem(itemID).getPlace();
            String place = inputUI.inputPlace();
            itemCtr.updatePlace(itemID, place);
            System.out.println("Maksimumsbeholdningen er blevet ændret fra " + oldPlace + " til " + place);
        }
        else
        {
            System.out.println("ID'et findes ikke");
        }
    }
}
