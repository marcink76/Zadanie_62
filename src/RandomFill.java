import java.util.Random;

public class RandomFill {

    public static int randomFill() {
        Random random = new Random();
        int randNumber = random.nextInt(99);
        return randNumber;
    }
}
