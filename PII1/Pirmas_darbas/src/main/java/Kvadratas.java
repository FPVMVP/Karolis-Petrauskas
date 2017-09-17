import org.joda.time.DateTime;

public class Kvadratas {

    public int skaiciuojam(){
        int krastine;
        int atsakymas;
        DateTime dt = new DateTime();
        krastine = dt.getDayOfMonth();
        atsakymas = krastine*krastine;
        return atsakymas;
    }

}
