import java.util.Scanner;
public class Ascii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        String str = sc.nextLine();
        int res = (int) str.charAt(0);
        System.out.println("The Ascii value of "+res);
    }
    
}
