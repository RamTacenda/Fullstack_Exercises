import java.util.*;


public class MyArrayTwo{
public static void main(String args[]){
int arr[] = new int[5];
int sum = 0;

Scanner sc = new Scanner(System.in);

for(int i=0; i < arr.length; i++){
arr[i] = sc.nextInt();
}

System.out.println("The Elements in the array are: "+ Arrays.toString(arr));


}

}