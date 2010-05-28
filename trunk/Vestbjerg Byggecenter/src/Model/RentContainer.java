package Model;
import java.util.ArrayList;

/**
 *
 * @author KL-DELL
 */
public class RentContainer
{
    private ArrayList<Rent> rentList;
    private static RentContainer instance;

    public RentContainer()
    {
        rentList = new ArrayList<Rent>();
    }

    public static RentContainer getInstance()
    {
        if(instance == null)
        {
            instance = new RentContainer();
        }
        return instance;
    }

    private void addRent(Rent r)
    {
        rentList.add(r);
    }

    private int generateID()
    {
        int index = 0;
        int newID = 0;
        if(rentList.size() != 0)
        {
        index = rentList.size() - 1;
        Rent r = rentList.get(index);
        newID = r.getRentID() + 1;
        }
        else
        {
            newID = 1;
        }
        return newID;
    }

    public int createRent(int renterID, int unitSerial)
    {
        int rentID = generateID();
        int loan = 0;
        int serial = unitSerial;
        Rent r = null;
        if(findRent(unitSerial) == serial)
        {
            r = new Rent(rentID, renterID, unitSerial);
            addRent(r);
            rent = 1;
        }
        return rent;

    }

    public Rent findRent(int unitSerial)
    {
        int index = 0;
        Rent r = null;
        Boolean found = false;
        while(index < rentList.size() && !found)
        {
            r = rentList.get(index);
            if(r.getRentUnit() == unitSerial)
            {
                found = true;
            }
            else
            {
                index++;
            }
        }
        if(found == true)
        {
            return rentList.get(index);
        }
        else
        {
            return null;
        }
    }

    private int getIndex(int rentID)
    {
        int index = 0;
        boolean found = false;
        Rent r = null;
        int foundIndex = -1;
        while(index < rentList.size() && !found)
        {
            r = rentList.get(index);
            if(r.getRentID() == rentID)
            {
                found = true;
                foundIndex = index;
            }
            index++;
        }
        return foundIndex;
    }

    public void endRent(int rentID)
    {
        int index = getIndex(rentID);
        if(index != -1)
        {
            rentList.remove(index);
        }
    }

    public String listAllRents()
    {
        String outputString = " ";
        for(Rent r : rentList)
        {
            outputString = outputString + r.getRentID() + " - " + r.getRentDate() + " - " + r.getReturnDate() + "\n";
        }
        return outputString;
    }
}
