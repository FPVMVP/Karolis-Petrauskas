import java.util.Random;

public class Cdkeygen {

    public String getSaltString() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
            while (salt.length() < 5) { // nustatau ilguma salto
                int index = (int) (rnd.nextFloat() * SALTCHARS.length()); //
                salt.append(SALTCHARS.charAt(index)); //append apjungia inta kartu su stringu, bendram atsakymui isvest
            }
        String saltStr = salt.toString();
        return saltStr;

    }
}
