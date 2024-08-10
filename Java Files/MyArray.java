import java.util.*;

public class MyArray{
public static void main(String args[]){
int num1, num2;
Scanner sc = new Scanner(System.in);

num1 = sc.nextInt();
num2 = sc.nextInt();

if(num1 > num2){
System.out.println("Greater element: "+num1);
}
else if(num2 > num1){
System.out.println("Greater Element: "+num2);
}

}
}