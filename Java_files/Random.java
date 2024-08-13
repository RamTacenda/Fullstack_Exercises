import java.lang.Math;
import java.util.*;
public class Random {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Minimum Number: ");
        int min = scan.nextInt();

        System.out.print("Maximum Number: ");
        int max = scan.nextInt();

        System.out.println("The Random number: "+ (int) (Math.random()*(max-min+1)+min));
    }
    
}
