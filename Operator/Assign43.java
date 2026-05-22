import java.util.Scanner;

class Assign43{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		
		System.out.print("Enter the time in hr: ");
		int hr = sc.nextInt();
		
		System.out.print("Enter the time in min: ");
		long min = sc.nextLong();
		
		long sec = ((hr * 60) + min) *60;
		
		System.out.println("Time in second: "+sec);
		
	}
}