package TestUI;//makes this class a part of the TUILayer package
import UI.RentItemUI;
import UI.RentUI;
import java.util.Scanner;
import TestCtr.*;//The TUILayer needs to know the ControlLayer
/**
 * 
 * User interface - main menu
 * The entry-point for the application:
 * Create an instance of class MainMenuUI and the constructor starts the application
 * 
 * @author (kbh) 
 * @version (2005.03.31)
 * (FEN): 2006.02.24: Comments translated into English
 * (FEN): 2006.03.21: Some changes to the architecture in order to assure layering
 *                    and loose coupling
 *                    
 * (KBH): 2008.10.24: Change af manimenuStart to if
 * (KBH): 2010.04.09: Comments changed
 */
public class MainMenuUI
{
  //the reference to the ControlLayer
  
   private RentItemUI rentItemUI;
   private RentUI rentUI;
 
   
   public MainMenuUI()
   {
  
       mainMenuStart();
   }
   
   public void mainMenuStart()
   {
        boolean exit=false;
        while (!exit) //! means while exit not is true (that is: false)
        {
            int choise = writeMainMenu();
            if(choise == 1)
            {
              //  startAddressBook();
            }
            else{
                    if(choise == 2){ 
                        startRent();
                    }
                    else{
                        if(choise == 3){
                            startRentItem();
                        }
                        else{
                            writeEnd();
                            exit = true;
                        }//end else
                    }// end else
             }//end else
        }//end while
    }//end start
    
   private int writeMainMenu()
    {       
            // creates a keyboard object to read input
            Scanner keyboard = new Scanner(System.in);
            System.out.println("\f *** MainMenu ***");
            System.out.println(" ");
            System.out.println(" (2) Udlejning");
            System.out.println(" (3) Ny vare");
            System.out.println(" (4) Luk");
            System.out.print("\n NUMMER !: ");
            
            int choise = keyboard.nextInt();
            
            return choise;
    }
    
   

    private void startRentItem()
    {
        rentItemUI= new RentItemUI();
        rentItemUI.start();
       
    }
    
    private void startRent()
    {
        rentUI = new RentUI();
        rentUI.start();
    }
    private void writeEnd()
    {
        System.out.println(" The System is shuting down ");
    }
 }
