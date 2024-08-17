import java.util.Scanner;
public class Pattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = scan.nextInt();

        scan.close();

        for(int i=0; i<num; i++){
            for(int j=i; j<num; j++){
                System.out.print(" ");
            }
            for(int k=0; k<=i; k++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }

    }
    
}
