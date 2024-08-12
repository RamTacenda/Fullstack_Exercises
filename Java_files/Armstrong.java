import java.util.*;
import java.lang.Math;
public class Armstrong {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Number ");
        int num = scan.nextInt();
        int num2 = num;
        int res = 0;
        int count = Integer.toString(num).length();

        while(num > 0){
            int rem = num % 10;
            res = res + (int) Math.pow(rem, count);
            num = (int) (num / 10);
        }
        
        if(num2 == res){
            System.out.println("The Number "+num2+" is Armstrong");
        }
        else{
            System.out.println("The Number "+num2+" is not an Armstrong");
        }
        
    }
    
}
