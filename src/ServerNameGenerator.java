import java.util.Random;

public class ServerNameGenerator {

    public static String[] adjectives = {"funny", "lackadaisical", "prompt", "fastidious", "prickly", "amazing", "incredible", "outdated", "pristine", "comical"};
    public static String[] nouns = {"desk", "guitar", "house", "volkswagen", "lawnmower", "duck", "chair", "poster", "event", "candle"};

    public static void main(String[] args) {

        System.out.println("Your server name is: ");
        System.out.println(getRandomWord(adjectives) + "-" + getRandomWord(nouns));

    }

    public static String getRandomWord(String[] wordArr) {
        Random random = new Random();
        int randomIndex = random.nextInt(wordArr.length);
        return wordArr[randomIndex];
    }
}
