import java.util.Scanner;

class Q58{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Total time required : ");
		int time = sc.nextInt();
		
		System.out.print("Enter Total number of tasks : ");
		short tasks = sc.nextShort();
		
		float avgTime = time/tasks;
		System.out.print("Average Time Required To Complete 1 Task: " +avgTime);
		
	}
}