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
public class ItemUI
{
    private ItemCtr itemCtr;//DVD UI must know the DVD controller
    private UpdateItemUI updateItemUI;
    private InputUI inputUI;

    public ItemUI()
    {
        itemCtr = new ItemCtr();
        updateItemUI = new UpdateItemUI();
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
            //show menu and return the user's choice
                int choice =   writeItemMenu();
                switch(choice)
                {
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
                        assignSerialNo();
                        break;
                    case 5:
                        deleteItem();
                        break;
                    case 6:
                        listAllItems();
                        break;
                    case 7:
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
            System.out.println("\f *** Lagerstyring ***");
            System.out.println(" (1) Find vare");
            System.out.println(" (2) Opret vare");
            System.out.println(" (3) Opdater vare");
            System.out.println(" (4) Tildel serienummer");
            System.out.println(" (5) Slet vare");
            System.out.println(" (6) Vis en liste over alle varer");
            System.out.println(" (7) Return");
            System.out.print("\n Vælg et menupunkt: ");

            int choice = keyboard.nextInt();
            return choice;
    }

    //there is need for more methods to read information about DVDs
    //and methods to display the information

    private void getItem()
    {
        int itemID = inputUI.inputItemID();
        //is to be changed when the DVD controller is completed
        if(itemCtr.getItem(itemID) != null)
        {
            System.out.println("Pris: " + itemCtr.getItem(itemID).getItemPrice());
            System.out.println("Beskrivelse: " + itemCtr.getItem(itemID).getDescription());
            System.out.println("Maksimumsbeholdning: " + itemCtr.getItem(itemID).getMaxInStock());
            System.out.println("Minimumsbeholdning: " + itemCtr.getItem(itemID).getMinInStock());
            System.out.println("Antal: " + itemCtr.getItem(itemID).getItemsInStock());
            System.out.println("Type: " + itemCtr.getItem(itemID).getType());
            System.out.println("Brand: " + itemCtr.getItem(itemID).getBrand());
        }
        else
        {
            System.out.println("ID'et blev ikke fundet");
        }
        pause();
    }
    private void createItem()
    {
        double itemPrice = inputUI.inputItemPrice();
        String description = inputUI.inputDescription();        
        int minInStock = inputUI.inputMinInStock();
        int maxInStock = inputUI.inputMaxInStock();
        while(maxInStock < minInStock)
        {
            System.out.println("Maksmimumsbeholdningen er mindre end minimumsbeholdningen");
            maxInStock = inputUI.inputMaxInStock();
        }
        int itemsInStock = inputUI.inputItemsInStock();
        while(itemCtr.checkSupplyLimit(minInStock, maxInStock, itemsInStock) == true)
        {
            System.out.println("Antallet af varer skal være indenfor minimums-/maksiumsbeholdningen");
            itemsInStock = inputUI.inputItemsInStock();
        }
        String type = inputUI.inputType();
        String brand = inputUI.inputBrand();
        String place = inputUI.inputPlace();
        int i = itemCtr.createItem(itemPrice, description, maxInStock, minInStock, itemsInStock, type, brand, place);
        System.out.println("Varen er oprettet og har fået ID'et: " + i);
        pause();
    }

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

    private void listAllItems()
    {
        itemCtr.listAllItems();
        pause();
    }

//    private void updateItem()
//    {
//        long id = inputDVDID();
//        itemCtr = new ItemCtr();
//        if(itemCtr.getItem(id) != null)
//        {
//            System.out.println("Enter the following new information");
//            String title = inputTitle();
//            String artist = inputArtist();
//            String releaseDate = inputReleaseDate();
//            itemCtr.updateItem(id, title, artist, releaseDate);
//            System.out.println("title: " + title);
//            System.out.println("artist: " + artist);
//            System.out.println("release date: " + releaseDate);
//        }
//        else
//        {
//            System.out.println("ID not found");
//        }
//        pause();
//    }

    private void pause()
    {
       Scanner keyboard = new Scanner(System.in);
       System.out.println("Tryk retur for at fortsætte");
       keyboard.nextLine();
    }



    // WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW

       private int inputSerialNo()
    {
        // creates an object keyboard to read data from the keyboard
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Indtast serienummeret: ");
        int serialNo = keyboard.nextInt();
        return serialNo;
    }

    public void assignSerialNo()
    {
         int itemID = inputUI.inputItemID();
         if(itemCtr.getItem(itemID) != null)
         {
              int u = itemCtr.assignUnit(itemID);
              System.out.println("Et eksemplar med serienummeret " + u + " blev oprettet");
              pause();
         }
         else
         {
              System.out.println("ID'et blev ikke fundet");
              pause();
         }
    }

    public void startUpdateMenuUI()
    {
        updateItemUI.start();
    }
}