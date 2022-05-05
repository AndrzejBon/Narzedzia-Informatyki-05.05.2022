import java.util.Random;

public class Zad_2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int liczba = rand.nextInt(25);

        if (liczba < 5 && liczba > 3)
            System.out.println("Liczba: "+liczba+" zawiera sie w przedziale (3,5)");
        else
            System.out.println("Liczba: "+liczba+" nie zawiera sie w przedziale (3,5)");
    }

}
