import java.util.Scanner;
class PnToKm{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value for pound: ");
		double pound = sc.nextDouble();
		
		double result = pound*0.454;
		System.out.println(pound+" pounds is "+result+ " kg");
	}
}