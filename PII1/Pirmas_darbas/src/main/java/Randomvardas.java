import org.kohsuke.randname.RandomNameGenerator;

import java.util.Random;

public class Randomvardas {

        String ThisIsrandomName;
        Random random = new Random();

        public String getRandomNamee(){
            int skaicius;
            skaicius = random.nextInt(10);

            RandomNameGenerator randomNameGenerator = new RandomNameGenerator();
            ThisIsrandomName = randomNameGenerator.next();

            return ThisIsrandomName;
        }

}
