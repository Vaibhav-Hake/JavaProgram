import java.util.Scanner;

class Q55{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter distance travelled at trip 1 : ");
		float dist1 = sc.nextDouble();
		
		System.out.print("Enter distance travelled at trip 2 : ");
		float dist2 = sc.nextDouble();
		
		System.out.print("Enter distance travelled at trip 3 : ");
		float dist3 = sc.nextDouble();
		
		System.out.print("Enter Mileage : ");
		float mileage = sc.nextDouble();
		
		float fuel = (dist1 + dist2 + dist3) / mileage;
		System.out.println("Total Fuel Used : "+fuel);
		
	}
}