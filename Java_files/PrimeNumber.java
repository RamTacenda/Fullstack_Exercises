import java.util.*;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int flag = 1;
        for(int i=2; i<num;i++){
            if(num%i == 0){
                flag = 0;
            }
        }
        if(flag == 1){
            System.out.println(num+" is Prime number");
        }
        else{
            System.out.println(num +" is not a Prime number");
        }
    }
}
