package UI;
import java.util.Scanner;
import Ctr.RentableItemCtr;


/**
 * Write a description of class RentUI here.
 * 
 * @author (Daniel)
 */
public class RentItemUI
{
   private RentableItemCtr  rentableItemCtr;
   private InputUI inputUI;
   
   public RentItemUI()
   {
       rentableItemCtr = new RentableItemCtr();
       inputUI = new InputUI();
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
               removeItem();
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
            System.out.println(" (1) Nyt item ");
            System.out.println(" (2) Fjern Item");
            System.out.println(" (3) Luk");
            System.out.print("\n vaelg et nummer: ");
            
            int choise = keyboard.nextInt();
            
            return choise;
    }
    private void newRentableItem()
    {
        String name = inputUI.inputName();
        int id = rentableItemCtr.createItem(name);
        System.out.println("/n " + name + " er blevet oprettet med id:" + id);
                
                
    }
 
       private void removeItem()
       {
         int id =  inputUI.inputID();
         rentableItemCtr.deleteRentableItem(id);
       }
       
        public void pause()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("\nPress return to continue");
        String address = keyboard.nextLine();
    }

   
}
