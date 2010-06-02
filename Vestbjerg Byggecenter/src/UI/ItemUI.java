/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package UI;

import Ctr.ItemCtr;
import Model.Item;
import java.util.Scanner;
/**
 *
 * @author Erik
 */
public class ItemUI
{
    private ItemCtr itemCtr;//DVD UI must know the DVD controller
    private UpdateItemUI updateItemUI;
    private InputUI inputUI;

    /**
     *konstruktør til ItemUI
     */
    public ItemUI()
    {
        itemCtr = new ItemCtr();
        updateItemUI = new UpdateItemUI();
        inputUI = new InputUI();
    }

    /**
     * starter en itemMenu
     */
    public void start()
    {

        itemMenu();
    }

    /**
     *Denne metode gør brugeren kan vælge de forskellige menupunkter fra metoden herunder
     */
    public void itemMenu()
    {
        try
        {
            boolean exit = false;
            while(!exit)
            {
            //show menu and return the user's choice
                int choice =   writeItemMenu();
                switch(choice)
                {
                    case 0:
                        exit = true;
                        break;
                    case 1:
                        getItem();
                        break;
                    case 2:
                        createItem();
                        break;
                    case 3:
                        startUpdateMenuUI();
                        break;
                    case 4:
                        deleteItem();
                        break;
                    case 5:
                        listAllItems();
                        break;

                }
            }
        }
        catch(Exception e)
        {
            start();
        }
    }

    /**
     * Giver et visuelt billede af menuen
     * @return
     */

    private int writeItemMenu()
    {
           // creates an object keyboard to read data from the keyboard
            Scanner keyboard = new Scanner(System.in);
            System.out.println("\f *** Lagerstyring ***");
            System.out.println(" (0) Tilbage");
            System.out.println(" (1) Find vare");
            System.out.println(" (2) Opret vare");
            System.out.println(" (3) Opdater vare");
            System.out.println(" (4) Slet vare");
            System.out.println(" (5) Vis en liste over alle varer");
            System.out.print("\n Vælg et menupunkt: ");

            int choice = keyboard.nextInt();
            return choice;
    }

    //there is need for more methods to read information about DVDs
    //and methods to display the information


    /**
     * finder et bestemt item baseret på et ID
     */
    private void getItem()
    {
        int itemID = inputUI.inputID();
        //is to be changed when the DVD controller is completed
        if(itemCtr.getItem(itemID) != null)
        {
            System.out.println("Varenavn: " + itemCtr.getItem(itemID).getItemName());
            System.out.println("Pris: " + itemCtr.getItem(itemID).getItemPrice());
            System.out.println("Beskrivelse: " + itemCtr.getItem(itemID).getDescription());
            System.out.println("Maksimumsbeholdning: " + itemCtr.getItem(itemID).getMaxInStock());
            System.out.println("Minimumsbeholdning: " + itemCtr.getItem(itemID).getMinInStock());
            System.out.println("Antal: " + itemCtr.getItem(itemID).getItemsInStock());
            System.out.println("Brand: " + itemCtr.getItem(itemID).getBrand());
        }
        else
        {
            System.out.println("ID'et blev ikke fundet");     
        }
        inputUI.pause();
    }

    /**
     * opretter et nyt item
     */
    private void createItem()
    {
        
        String itemName = inputUI.inputItemName();
        double itemPrice = inputUI.inputItemPrice();
        String description = inputUI.inputDescription();        
        int minInStock = inputUI.inputMinInStock();
        int maxInStock = inputUI.inputMaxInStock();
        while(maxInStock <= minInStock)
        {
            System.out.println("Maksmimumsbeholdningen er mindre end eller lig med minimumsbeholdningen");
            maxInStock = inputUI.inputMaxInStock();
        }
        int itemsInStock = inputUI.inputItemsInStock();
//        while(itemCtr.checkSupplyLimit(minInStock, maxInStock, itemsInStock) == true)
//        {
//            System.out.println("Antallet af varer skal være indenfor minimums-/maksiumsbeholdningen");
//            itemsInStock = inputUI.inputItemsInStock();
//        }
        while(itemsInStock > maxInStock || itemsInStock < minInStock)
        {
            System.out.println("Antallet af eksemplarer skal være indenfor minimums-/maksiumsbeholdningen");
            itemsInStock = inputUI.inputItemsInStock();
        }
        boolean isYes = inputUI.UnitYesOrNo();
        String brand = inputUI.inputBrand();
        String place = inputUI.inputPlace();
        int i = itemCtr.createItem(itemName, itemPrice, description, maxInStock, minInStock, itemsInStock, brand, place, isYes);
        System.out.println("Varen er oprettet og har fået ID'et: " + i);
        inputUI.pause();
    }

    /**
     * sletter et item udfra et ID
     */

    private void deleteItem()
    {
        int itemID = inputUI.inputItemID();
        if(itemCtr.getItem(itemID) == null)
        {
            System.out.println("ID'et " + itemID + " findes ikke. Indtast venligst et nyt ID.");
        }
        else
        {
            boolean yesOrNo = inputUI.yesOrNo();
            if(yesOrNo == true)
            {
                itemCtr.deleteItem(itemID);
                System.out.println("Varen med ID'et " + itemID + " blev slettet.");
            }
        }
    }

    /**
     * Laver en liste af Items
     */

    private void listAllItems()
    {
        for(Item i : itemCtr.getItemList())
	{
            System.out.println("Vare-ID: " + i.getItemID() + " Varenavn: " + i.getItemName() + " Pris: " + i.getItemPrice() + " Brand: " + i.getBrand() + " Lokation: " + i.getPlace());
	}
        inputUI.pause();
    }

   
    /**
     *starter update menuen
     */
    public void startUpdateMenuUI()
    {
        updateItemUI.start();
    }
}