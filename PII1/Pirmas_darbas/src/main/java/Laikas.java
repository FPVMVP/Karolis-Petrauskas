import org.joda.time.DateTime;
import org.joda.time.Seconds;

public class Laikas {

    DateTime dt1 = new DateTime();
    DateTime dt2 = new DateTime(2018, 1, 1, 0, 0, 0, 0);
    int seconds= Seconds.secondsBetween(dt1, dt2).getSeconds();

    int noOfDays=seconds/(24*60*60);

    public int getNoOfDays() {
        return noOfDays;
    }
}
