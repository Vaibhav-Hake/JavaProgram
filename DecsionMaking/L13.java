import java.util.Scanner;
class L13{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a age");
		int age=sc.nextInt();
		System.out.println("Enter a severity");
		int severity=sc.nextInt();
		System.out.println("Enter a insurance (true/false)");
		boolean insurance=sc.nextBoolean();
		
		if(severity>=9){
			System.out.println("Criticle");
		}else if(severity>=7&&age>60){
			System.out.println("High Priority");
		}else if(!insurance&&severity<5){
			System.out.println("Low Priority");
		}
		else{
			System.out.println("Medium Priority");
		}
		
	}
}