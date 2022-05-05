import java.util.Random;

public class Zad_8 {
    public static void main(String[] args) {
        Random rand = new Random();
        int a = rand.nextInt(25);
        int b = rand.nextInt(25);
        int c = rand.nextInt(25);
        if(a>b)
            if(a>c)
                if(b>c)
                    System.out.println(a+","+b+","+c);
                else
                    System.out.println(a+","+c+","+b);
            else
                System.out.println(c+","+a+","+b);
        else
            if(b>c)
                if(a>c)
                    System.out.println(b+","+a+","+c);
                else
                    System.out.println(b+","+c+","+a);
            else
                System.out.println(c+","+b+","+a);

                
    }
}