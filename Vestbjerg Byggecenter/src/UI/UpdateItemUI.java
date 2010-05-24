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
        selectItem();
        if(itemID != 0)
        {
            itemMenu();
        }
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
                    case 0:
                        exit = true;
                        break;
                    case 1:
                        updateItemName();
                        break;
                    case 2:
                        updateItemPrice();
                        break;
                    case 3:
                        updateDescription();
                        break;
                    case 4:
                        updateMaxInStock();
                        break;
                    case 5:
                        updateMinInStock();
                        break;
                    case 6:
                        updateItemsInStock();
                        break;
                    case 7:
                        updateBrand();
                        break;
                    case 8:
                        updateLocation();
                        break;
                    case 9:
                        selectItem();
                        break;
                }
            }
        }
        catch(Exception e)
        {
            System.out.println("test");
            itemMenu();
        }
    }

    private int writeItemMenu()
    {
           // creates an object keyboard to read data from the keyboard
            Scanner keyboard = new Scanner(System.in);
            System.out.println("\f *** Opdater vare ***");
            System.out.println(" Vare: " + itemCtr.getItem(itemID).getItemID());
            System.out.println(" (0) Tilbage");
            System.out.println(" (1) Opdater navn");
            System.out.println(" (2) Opdater pris");
            System.out.println(" (3) Opdater beskrivelse");
            System.out.println(" (4) Opdater maksimumsbeholdning");
            System.out.println(" (5) Opdater minimumsbeholdning");
            System.out.println(" (6) Opdater antal");
            System.out.println(" (7) Opdater brand");
            System.out.println(" (8) Opdater lokation");
            System.out.println(" (9) Vælg vare");
            System.out.print("\n Vælg et menupunkt: ");

            int choice = keyboard.nextInt();
            return choice;
    }

    private void updateItemName()
    {
        if(itemCtr.getItem(itemID) != null)
        {
            String oldItemName = itemCtr.getItem(itemID).getItemName();
            String itemName = inputUI.inputItemName();
            itemCtr.updateItemName(itemID, itemName);
            System.out.println("Varenavnet er blevet ændret " + oldItemName + " til " + itemName);
        }
    }

    private void updateItemPrice()
    {
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

    private void updateBrand()
    {
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

    private void selectItem()
    {
        itemID = inputUI.inputID();
        if(itemCtr.getItem(itemID) == null)
        {
            System.out.println("ID'et blev ikke fundet");
            itemID = 0;
            inputUI.pause();
        }
    }
}
