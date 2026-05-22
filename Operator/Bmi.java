import java.util.Scanner;
class Bmi{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a weight in pounds : ");
		double weight=sc.nextDouble();
		System.out.println("Enter a height in inches : ");
		double height=sc.nextDouble();
		weight*=0.45359237;
		height*=0.0254;
		double bmi=weight/(height*height);
		System.out.println(bmi);
		
	}
}