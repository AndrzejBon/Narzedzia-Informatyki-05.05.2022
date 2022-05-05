import java.util.Random;

public class Zad_4 {
    public static void main(String[] args) {
        Random rand = new Random();
        float L1 = rand.nextInt(25);
        float L2 = rand.nextInt(25);
        float L3 = rand.nextInt(25);
        float srednia = (L1+L2+L3)/3;
        System.out.println("Srednia z liczb L1 ("+L1+"), L2 ("+L2+"), L3 ("+L3+") to: "+srednia);
    }
}