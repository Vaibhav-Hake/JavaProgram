import java.util.Scanner;
class EnergyCal{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the amount of water in kilograms: ");
		float water = sc.nextFloat();
		
		System.out.print("Enter the initial temperation: ");
		float iTemp = sc.nextFloat();
		
		System.out.print("Enter the final temperature: ");
		float fTemp = sc.nextFloat();
		
		float energy = water * (fTemp - iTemp) * 4184;
		
		System.out.println("The average acceleration is : "+energy);
	}
}