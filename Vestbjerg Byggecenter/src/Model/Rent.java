
package Model;
import java.util.Date;
import javax.management.timer.Timer;

/**
 *
 * @author KL-DELL
 */
public class Rent
{
    private int rentID;
    private Date rentDate;
    private Date returnDate;
    private int rentUnit;

    public Rent(int rentID, int rentUnit)
    {
        this.rentID = rentID;
        this.rentUnit = rentUnit;
        this.rentDate = new Date();
        this.returnDate = new Date(rentDate.getTime() + 14L * Timer.ONE_DAY);
    }

    public Date getRentDate() {
        return rentDate.toString();
    }

    public void setRentDate(Date rentDate) {
        this.rentDate = new Date();
    }

    public int getRentID() {
        return rentID;
    }

    public void setRentID(int rentID) {
        this.rentID = rentID;
    }

    public int getRentUnit() {
        return rentUnit;
    }

    public void setRentUnit(int rentUnit) {
        this.rentUnit = rentUnit;
    }

    public Date getReturnDate() {
        return returnDate.toString();
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = new Date(rentDate.getTime() + 14L * Timer.ONE_DAY);
    }






}
