import java.util.Scanner;
class R19{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a price ");
		float p=sc.nextFloat();
		System.out.println("Enter a dis");
		float dis=sc.nextFloat();
		
		System.out.println((p-dis)>800&&p%10==0);
	}
}