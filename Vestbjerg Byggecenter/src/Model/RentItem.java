package Model;

import java.util.ArrayList;


public class RentItem {

    private int rentID;
    private String itemName;
    private String serial;
    private ArrayList<RentUnit> rentUnitList;

    public RentItem(int rentID, String itemName, String serial)
    {
        this.rentID = rentID;
        this.itemName = itemName;
        this.serial = serial;
        rentUnitList = new ArrayList<RentUnit>();
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getRentID() {
        return rentID;
    }

    public void setRentID(int rentID) {
        this.rentID = rentID;
    }

    public ArrayList<RentUnit> getRentUnitList() {
        return rentUnitList;
    }

    public void setRentUnitList(ArrayList<RentUnit> rentUnitList) {
        this.rentUnitList = rentUnitList;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    
}
