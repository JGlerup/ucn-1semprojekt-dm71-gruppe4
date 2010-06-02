package UI;

/**
 *
 * @author Erik
 */
public class User
{
    /**
     *
     */
    public String userName;
    /**
     *
     */
    public int idNumber;

   /**
    *
    * @param UN
    * @param ID
    */
   public User(String UN, int ID)
   {
       userName = UN;
       idNumber = ID;
    }

   /**
    *
    * @return
    */
   public String getUserName()
    {
        return "Name: " + userName;
    }

   /**
    *
    * @return
    */
   public int getID()
    {
        return idNumber;
    }

}