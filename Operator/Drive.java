import java.util.Scanner;
class Drive{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  Driving Distance : ");
		float dis=sc.nextFloat();
		float mile=sc.nextFloat();
		float price =sc.nextFloat();
		float per=dis/mile;
		float costTotal=per*price;
		System.out.println("The cost of Driving is $ "+costTotal);
	}
}