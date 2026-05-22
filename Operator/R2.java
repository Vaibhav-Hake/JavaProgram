import java.util.Scanner;
class R2{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a petrol price ");
		double p=sc.nextDouble();
		System.out.println("Enter a  price per Lit");
		double p1=sc.nextDouble();
		System.out.println((p/p1)>=10);
	}
}