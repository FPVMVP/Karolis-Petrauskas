import org.joda.time.LocalDate;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Console;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        //random varda spausdina
        Randomvardas rnd = new Randomvardas();
        String belekas = rnd.getRandomNamee();
        System.out.println("Atsakynmas: " + belekas);

        //prime skaicius spausdina
        PrimeNumb prim = new PrimeNumb();
        String praimas = prim.getNum();
        System.out.println("Atsakynmas: " + praimas);

        //prime skaicius spausdina
        Cdkeygen cdkey = new Cdkeygen();
        String cdkyjus = cdkey.getSaltString();
        for (int i = 1; i <= 5; i++) {
            for (int i2 = 1; i <= 4; i++) {
                System.out.print("" + cdkyjus);
                System.out.print("-");
            }
            System.out.println("" + cdkyjus);
        }
        //Dienos iki nauju metu
        Laikas laikas = new Laikas();
        int ikinauju = laikas.getNoOfDays();
        System.out.println("Liko dienu iki nauju metu = " + ikinauju);

        //ReversedText
        System.out.println("Apverstas tekstas: Java programming is fun");
        StringBuffer a = new StringBuffer("Java programming is fun");
        System.out.println(a.reverse());

        //Kvadratas
        Kvadratas kvadratas = new Kvadratas();
        int kvadraciokas = kvadratas.skaiciuojam();
        System.out.println("x*x plotas kvadrato pagal men diena: " + kvadraciokas);

    }
}
