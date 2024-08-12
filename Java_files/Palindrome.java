import java.util.*;
public class Palindrome {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine().toLowerCase();

        String res = "";

        for(int i=str.length()-1; i>=0; i--){
            res = res + str.charAt(i);
        }

        System.out.println("Res "+res);

        if(res.equals(str)){
            System.out.println("Given string "+str+" is a Palindrome");
        }
        else{
            System.out.println("Given string "+str+" is not a Palindrome");
        }

    }
    
}
