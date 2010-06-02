package UI;

import Ctr.*;
import java.util.Scanner;

/**
 *
 * @author KL-DELL
 */

public class EmployeeUI {

    private EmployeeCtr employeeCtr;
    private InputUI inputUI;

    /**
     *
     */
    public EmployeeUI()
    {
        employeeCtr = new EmployeeCtr();
    }

    /**
     *starter medarbejder menuen
     */
    public void start()
    {
        employeeMenu();
    }

    /**
     *Denne metode gør brugeren kan vælge de forskellige menupunkter fra metoden herunder
     */
    public void employeeMenu()
    {
        boolean exit = false;
        while(!exit)
        {
            int choise = writeEmployeeMenu();

            if(choise == 1) //CREATE CUSTOMER
            {
                createEmployee();
            }
            else{if(choise == 2)
            {
                deleteEmployee();
            }
            else{if(choise == 3)
            {
                updateEmployee();
            }
            else{if(choise == 4)
            {
                findEmployee();
            }
            else{if(choise == 5)
            {
                listAllEmployees();
            }
            else{exit = true;}
            }
            }
            }
            }

        }
    }

    /**
     * Printer de punkter der kan vælges i ovenstående metode
     * @return
     */

    private int writeEmployeeMenu()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("\f *** Employee menu ***");
        System.out.println(" (1) Create employee");
        System.out.println(" (2) Delete employee");
        System.out.println(" (3) Update employee");
        System.out.println(" (4) Find employee");
        System.out.println(" (5) List all employees");
        System.out.println(" (0) Tilbage ");
        System.out.print("\n Make your choise: ");

        int choise = keyboard.nextInt();
        return choise;
    }

    /**
     * Laver en ny employee
     */
    private void createEmployee()
    {
        int employeeID = employeeCtr.createEmployee(inputUI.inputName(), inputUI.inputAddress(), inputUI.inputPhone(), inputUI.inputPassword());
        System.out.println("Employee successfully created" + "\n" + "Employee ID is: " + employeeID);
        System.out.print("\nPress Enter to return to menu");
        inputUI.pause();
    }

    /**
     * sletter en employee
     */
    private void deleteEmployee()
    {
        int ID = inputUI.inputID();
        System.out.println("Employee found");
        System.out.println("\n" + employeeCtr.findEmployee(ID));
        System.out.println("Do you want to delete this employee? [Y/N]");
        Boolean delete = inputUI.yesOrNo();
        if(delete == true)
        {
            employeeCtr.deleteEmployee(ID);
            System.out.println("Employee deleted!");
            System.out.print("\nPress Enter to return to menu");
            inputUI.pause();
        }
        else
        {
            System.out.println("Delete cancelled");
            System.out.print("\nPress Enter to return to menu");
            inputUI.pause();
        }
        
    }
    
    /**
     *opdatere en employee
     */
    public void updateEmployee()
    {
        int ID = inputUI.inputID();
        System.out.println("Employee found");
        System.out.println("\n" + employeeCtr.findEmployee(ID));
        System.out.println("\n State new information");
        employeeCtr.updateEmployee(inputUI.inputID(), inputUI.inputPassword(), inputUI.inputName(), inputUI.inputAddress(), inputUI.inputPhone());
        System.out.println("Employee successfully updated");
        System.out.print("\nPress Enter to return to menu");
        inputUI.pause();
    }
    
    /**
     *
     */
    public void findEmployee()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("State employee ID: ");
        int employeeID = keyboard.nextInt();
        String outputString = employeeCtr.findEmployee(employeeID);
        System.out.println("\n" + outputString);
        System.out.print("\nPress Enter to return to menu");
        inputUI.pause();
    }
    
    /**
     *
     */
    public void listAllEmployees()
    {
        System.out.println("\n" + employeeCtr.ListAllEmployees());
        System.out.print("\nPress Enter to return to menu");
        inputUI.pause();
    }



   
}
