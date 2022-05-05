import java.util.Random;

public class Zad_3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int L1 = rand.nextInt(25);
        int L2 = rand.nextInt(25);
        if(L2>L1)
            System.out.println("L2 ("+L2+") jest wieksze od L1 ("+L1+")");
        else   
            System.out.println("L1 ("+L1+") jest wieksze od L2 ("+L2+")");
    }
}