package TestUI;
import java.util.Scanner;
import TestCtr.RentableItemCtr;


/**
 * Write a description of class RentUI here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RentItemUI
{
   private RentableItemCtr  rentableItemCtr;
   
   public RentItemUI()
   {
       rentableItemCtr = new RentableItemCtr();
   }
   
   public void start()
   {
       rentableItemMenu();
   }
   
   public void rentableItemMenu()
   {
        boolean exit = false;
        while(!exit)//that is: while exit is false
        {
            int choice = writeRentableItemMenu();
            if (choice == 1)
            {
               newRentableItem();
               
            }
            else{if(choice == 2) {
              //  deliverItem();
            }
                else{
                    exit = true;
                    }
                    
                }
}
}
  
  private int writeRentableItemMenu()
    {       
            // creates a keyboard object to read input
            Scanner keyboard = new Scanner(System.in);
            System.out.println("\f *** MainMenu ***");
            System.out.println(" (1)nyt item ");
            System.out.println(" (2) intet");
            System.out.println(" (3) intet");
            System.out.println(" (4) Luk");
            System.out.print("\n NUMMER !: ");
            
            int choise = keyboard.nextInt();
            
            return choise;
    }


  public String inputName()
    {
         // makes an object keyboard to have input from the screen
         Scanner keyboard = new Scanner(System.in);  
         System.out.println(" Write date:  ");
         String name = keyboard.nextLine();
         return name;
    } 
  
   
         private int writeRentMenu()
            {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("\f *** Rent Menu ***");
            System.out.println(" (1) Udlej Item");
            System.out.println(" (2) Aflever Item");
            System.out.println(" (3) Tilbage");
            System.out.print("\n Tryk et nummer: ");
            
            int choice = keyboard.nextInt();
            return choice;
        }
        
       private void newRentableItem()
       {
           int id = rentableItemCtr.createItem(inputName());
           
           System.out.println("\nDvd has been created with the ID: " + id);
           pause();
       }
       
        public void pause()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("\nPress return to continue");
        String address = keyboard.nextLine();
    }

   
}
