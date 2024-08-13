import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int res = 1;

        for(int i=1; i<=num; i++){
            res = res * i;
        }

        System.out.println("The Factorial of the number "+" num is "+res);
    }
}
