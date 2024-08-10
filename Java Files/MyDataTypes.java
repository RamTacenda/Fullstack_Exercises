import java.util.*;
public class MyDataTypes{
	public static void main(String args[]){
	int employeeId;
	String employeeName;
	float employeeSalary;

	Scanner sc = new Scanner(System.in);

	System.out.print("Enter the employee id: ");
	employeeId = sc.nextInt();

	System.out.print("Enter the empoyee name: ");
	employeeName = sc.next();

	System.out.print("Enter employee salary: ");
	employeeSalary = sc.nextFloat();

	System.out.print("Employee Id: "+employeeId);
	System.out.print("Employee Name: "+employeeName);
	System.out.print("Employee Salary: "+employeeSalary);
	}

}