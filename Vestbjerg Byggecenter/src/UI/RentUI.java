package UI;

import Ctr.CustomerCtr;
import java.util.Scanner;
import Ctr.RentCtr;

/**
 * Write a description of class RentUI here.
 * 
 * @author (Daniel)
 */
public class RentUI {

    private RentCtr rentCtr;
    private InputUI inputUI;
    private CustomerCtr customerCtr;

    /**
     *
     */
    public RentUI() {
        rentCtr = new RentCtr();
        inputUI = new InputUI();
        customerCtr = new CustomerCtr();
    }

    /**
     *
     */
    public void start() {
        rentMenu();
    }

    /**
     *
     */
    public void rentMenu() {
        try {
            boolean exit = false;
            while (!exit) {
                //show menu and return the user's choice
                int choice = writeRentMenu();
                switch (choice) {
                    case 0:
                        exit = true;
                        break;
                    case 1:
                        rentItem();
                        break;
                    case 2:
                        deliverItem();
                        break;

                }
            }
        } catch (Exception e) {
            //System.out.println(e.getMessage());
            //e.getCause();
            start();
        }
    }

    private int writeRentMenu() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("\f *** Rent Menu ***");
        System.out.println(" (0) Tilbage");
        System.out.println(" (1) Udlej Item");
        System.out.println(" (2) Aflever Item");
        System.out.print("\n Tryk et nummer: ");

        int choice = keyboard.nextInt();
        return choice;
    }

    private void rentItem() {
        int customerID = inputUI.inputCustomerID();
        if (customerCtr.getCustomer(customerID) != null) {
            String date = inputUI.inputDate();
            String status = inputUI.inputStatus();
            int itemID = inputUI.inputItemID();
            int returnID = rentCtr.rentItem(itemID, date, status, customerID);

            System.out.println("Udlejning oprettet med ID: " + returnID);
        }
        System.out.println("ID'et findes ikke");
        inputUI.pause();
    }

    private void deliverItem() {
        int itemID = inputUI.inputID();
        rentCtr.deliverItem(itemID);
    }
}
