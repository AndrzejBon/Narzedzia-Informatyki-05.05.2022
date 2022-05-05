import java.util.Random;

public class Zad_5 {
    public static void main(String[] args){
        Random rand = new Random();
        int L1 = rand.nextInt(10);
        int L2 = rand.nextInt(10);
        if(L1%L2==0)
            System.out.println("L1 ("+L1+") jest podzielne przez L2 ("+L2+")");
        else
            System.out.println("L1 ("+L1+") nie jest podzielne przez L2 ("+L2+")");
        if(L2%L1==0)
            System.out.println("L2 ("+L2+") jest podzielne przez L1 ("+L1+")");
        else
            System.out.println("L2 ("+L2+") nie jest podzielne przez L1 ("+L1+")");
    }
}
