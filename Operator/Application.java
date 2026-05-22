import java.util.Scanner;
class Application{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a subTotal");
		float subTotal=sc.nextFloat();
		System.out.println("Enter a grautity rate");
		float r=sc.nextFloat();
		
		float tip=subTotal*(r/100);
		float total=tip+subTotal;
		System.out.println(tip+"  and "+total);
	}
}