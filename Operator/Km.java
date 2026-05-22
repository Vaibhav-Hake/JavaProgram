import java.util.Scanner;
class Km{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter miles: ");
		double miles = sc.nextDouble();
		double km = miles/1.6;
		
		double hr = ((35.0/60.0)+40.0)/60.0;
		double kmPerHr = km/hr;
		System.out.println(kmPerHr);
		
	}
}