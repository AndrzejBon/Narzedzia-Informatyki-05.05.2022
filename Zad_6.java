import java.util.Random;

public class Zad_6 {
    public static void main(String[] args){
        Random rand = new Random();
        int L1 = rand.nextInt(10), 
            L2 = rand.nextInt(10), 
            L3 = rand.nextInt(10), 
            L4 = rand.nextInt(10), 
            L5 = rand.nextInt(10);
        int suma = L1 + L2 + L3 + L4 + L5;
        if(suma%2==0)
            System.out.println("Suma ("+suma+") tych liczb jest parzysta");
        else   
            System.out.println("Suma ("+suma+") tych liczb jest nieparzysta");
    }
}
