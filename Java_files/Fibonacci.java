import java.util.*;
public class Fibonacci{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        int num1 = 0;
        int num2 = 1;
        int i = 0;

        while(i <= num){
            System.out.print(num1 + " ");

            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;

            i++;
        }
    }
}