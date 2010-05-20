/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package UI;

import Ctr.EmployeeCtr;
import java.util.Scanner;


/**
 *
 * @author Daniel
 */
public class UpdateEmployeeUI {

    private EmployeeCtr employeeCtr;

    public UpdateEmployeeUI()
    {
        employeeCtr = new EmployeeCtr();
    }

     public void start()
    {
        employeeMenu();
    }

    public void employeeMenu()
    {
        boolean exit = false;
        while (!exit)
        {
            int choise = writeUpdateEmployeeMenu();

            if(choise == 1)
            {
                //update name
            }
            else
            {
                if (choise == 2)
                {
                    //update address
                }
                else
                {
                    if (choise == 3)
                    {
                        //update phone
                    }
                    else
                    {
                        exit = true;
                    }
                }//end else
            }//end else
        }//end while
    }

    public int writeUpdateEmployeeMenu()
    {
       Scanner keyboard = new Scanner(System.in);
       System.out.println("\f *** Medarbejder Menu ***");
       System.out.println("(1) Opdater Navn");
       System.out.println("(2) Opdater Addresse");
       System.out.println("(3) Opdater Telefon nummer");
       // INDSÆT RESTEN

       System.out.println("(6) Tilbage");
       System.out.print("\n Indtast nummer: ");

       int choise = keyboard.nextInt();
       return choise;
    }

    private int inputCustomerID()
    {
        boolean succed = false;
        int id = 0;
        while(!succed)
        {
        // makes an object keyboard to have input from the console
           Scanner keyboard = new Scanner(System.in);
           System.out.println(" Angiv kundeID:  ");
           try{
             id = keyboard.nextInt();
             succed = true;
           }
           catch (Exception e)
            {
             System.out.println("Fejl. Pr�v igen");
             String input = keyboard.nextLine();
           }
        }//end while
        return id;
     }

     private String inputName()
    {
         // makes an object keyboard to have input from the screen
         Scanner keyboard = new Scanner(System.in);
         System.out.println(" Indtast Name:  ");
         String name = keyboard.nextLine();
         return name;
    }

     private String inputAddress()
    {
         // makes an object keyboard to have input from the screen
         Scanner keyboard = new Scanner(System.in);
         System.out.println(" Indtast Address:  ");
         String address = keyboard.nextLine();
         return address;
    }

     private int inputPhone()
    {
         // makes an object keyboard to have input from the screen
         Scanner keyboard = new Scanner(System.in);
         System.out.println(" Indtast telefon nummer: ");
         int phone = keyboard.nextInt();
         return phone;
    }

     private void pause()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("\n Tryk enter for at forts�tte");
        String pause = keyboard.nextLine();
    }

}



