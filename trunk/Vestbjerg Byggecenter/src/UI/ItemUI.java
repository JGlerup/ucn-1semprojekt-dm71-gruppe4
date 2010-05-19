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

    public ItemUI()
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
                getItem();
            }
            else
            {
                if(choice == 2)
                {
                   createItem();
                }
                else
                {
                    if(choice == 3)
                    {
                        deleteItem();
                    }
                    else
                    {
                        if(choice == 4)
                        {
                             //updateItem();
                        }
                        else
                        {
                            if(choice == 5)
                            {
                                listAllItems();
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
            System.out.println("\f *** Lagerstyring ***");
            System.out.println(" (1) Find vare");
            System.out.println(" (2) Opret vare");
            System.out.println(" (3) Slet vare");
            System.out.println(" (4) Opdater vare");
            System.out.println(" (5) Vis en liste over alle varer");
            System.out.println(" (6) Return");
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

    //there is need for more methods to read information about DVDs
    //and methods to display the information

    private void getItem()
    {
        int itemID = inputItemID();
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
        double itemPrice = inputItemPrice();
        String description = inputDescription();
        int maxInStock = inputMaxInStock();
        int minInStock = inputMinInStock();
        int itemsInStock = inputItemsInStock();
        String type = inputType();
        String brand = inputBrand();
        String place = inputPlace();
        int i = itemCtr.createItem(itemPrice, description, maxInStock, minInStock, itemsInStock, type, brand, place);
        System.out.println("Varen er oprettet og har fået ID'et: " + i);
    }

    private void deleteItem()
    {
        int itemID = inputItemID();
        if(itemCtr.getItem(itemID) == null)
        {
                System.out.println("En vare med ID'et " + itemID + " findes ikke. Indtast venligst et nyt ID.");
        }
        else
        {
                itemCtr.deleteItem(itemID);
                System.out.println("Varen med ID'et" + itemID + "blev slettet.");
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
       String wait = keyboard.next();
    }
}