package UI;

import Ctr.*;
import java.util.Scanner;

/**
 *
 * @author KL-DELL
 */

public class EmployeeUI {

    private EmployeeCtr employeeCtr;

    public EmployeeUI()
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

    private int writeEmployeeMenu()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("\f *** Employee menu ***");
        System.out.println(" (1) Create employee");
        System.out.println(" (2) Delete employee");
        System.out.println(" (3) Update employee");
        System.out.println(" (4) Find employee");
        System.out.println(" (5) List all employees");
        System.out.print("\n Make your choise: ");

        int choise = keyboard.nextInt();
        return choise;
    }

    private String inputName()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("State employee name: ");
        String name = keyboard.nextLine();
        return name;
    }

    private String inputAddress()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("State employee address: ");
        String address = keyboard.nextLine();
        return address;
    }

    private int inputPhone()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("State employee phone no.: ");
        int phone = keyboard.nextInt();
        return phone;
    }

    private String inputPassword()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Choose a password: ");
        String password = keyboard.nextLine();
        return password;
    }

    private int inputID()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("State employee ID: ");
        int employeeID = keyboard.nextInt();
        return employeeID;
    }

    private boolean inputYesNo()
    {
        Scanner keyboard = new Scanner(System.in);
        String inputYesNo = keyboard.next();
        if(inputYesNo.equalsIgnoreCase("Y"))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    private void createEmployee()
    {
        int employeeID = employeeCtr.createEmployee(inputName(), inputAddress(), inputPhone(), inputPassword());
        System.out.println("Employee successfully created" + "\n" + "Employee ID is: " + employeeID);
        System.out.print("\nPress Enter to return to menu");
        pause();
    }
    
    private void deleteEmployee()
    {
        int ID = inputID();
        System.out.println("Employee found");
        System.out.println("\n" + employeeCtr.findEmployee(ID));
        System.out.println("Do you want to delete this employee? [Y/N]");
        Boolean delete = inputYesNo();
        if(delete == true)
        {
            employeeCtr.deleteEmployee(ID);
            System.out.println("Employee deleted!");
            System.out.print("\nPress Enter to return to menu");
            pause();
        }
        else
        {
            System.out.println("Delete cancelled");
            System.out.print("\nPress Enter to return to menu");
            pause();
        }
        
    }
    
    public void updateEmployee()
    {
        int ID = inputID();
        System.out.println("Employee found");
        System.out.println("\n" + employeeCtr.findEmployee(ID));
        System.out.println("\n State new information");
        employeeCtr.updateEmployee(inputID(), inputPassword(), inputName(), inputAddress(), inputPhone());
        System.out.println("Employee successfully updated");
        System.out.print("\nPress Enter to return to menu");
        pause();
    }
    
    public void findEmployee()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("State employee ID: ");
        int employeeID = keyboard.nextInt();
        String outputString = employeeCtr.findEmployee(employeeID);
        System.out.println("\n" + outputString);
        System.out.print("\nPress Enter to return to menu");
        pause();
    }
    
    public void listAllEmployees()
    {
        System.out.println("\n" + employeeCtr.ListAllEmployees());
        System.out.print("\nPress Enter to return to menu");
        pause();
    }









    private void pause()
    {
        Scanner keyboard = new Scanner(System.in);
        String keyPress = keyboard.nextLine();
    }
}
