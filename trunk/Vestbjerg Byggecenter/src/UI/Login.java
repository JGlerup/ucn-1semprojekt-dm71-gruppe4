import java.util.*;
import java.util.ArrayList;
import java.io.*;
/**
 * A Login app for Ms. P's
 *
 * @author (ME!!)
 * @version (1)
 */
public class Login
{
    public static Scanner reader = new Scanner(System.in);
    public static ArrayList<User> users = new ArrayList<User>();

    public static void main(String [] args)
    {

        while(true)
        {
            System.out.println("1) Enter New User");
            System.out.println("2) Save");
            System.out.println("3) Save and Exit");
            System.out.println("4) Exit");
            System.out.print("Your choice: ");
            int x = reader.nextInt();
            reader.nextLine();

            if(x == 4)
            {
                System.exit(0);
            }

            if(x == 3)
            {
                try
                {
                    writeToFile();
                }
                catch(IOException e)
                {
                    e.printStackTrace();
                }
                System.exit(0);
            }

            if(x == 2)
            {
                try
                {
                    writeToFile();
                }
                catch(IOException e)
                {
                    e.printStackTrace();
                }
            }

            if(x == 1)
            {

                System.out.println("Enter employee name: ");
                String name = reader.nextLine();


                System.out.println("Enter employee ID Number: ");
                int id = reader.nextInt();
                reader.nextLine();

                User user = new User(name,id);
            }


        }

    }

    private static void writeToFile() throws IOException
    {
        FileOutputStream fo = new FileOutputStream("users.txt");
        PrintStream ps = new PrintStream(fo);

        for(int i = 0; i < users.size(); i++)
        {
            ps.println(users.get(i).getUserName());
            ps.println(users.get(i).getID());
        }

        fo.close();
        ps.close();
    }

}