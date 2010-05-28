public class User
{
   public String userName;
   public int idNumber;

   public User(String UN, int ID)
   {
       userName = UN;
       idNumber = ID;
    }

    public String getUserName()
    {
        return "Name: " + userName;
    }

    public int getID()
    {
        return idNumber;
    }

}