import java.util.Scanner;
class R18{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a data ");
		float d=sc.nextFloat();
		System.out.println("Enter a days");
		int day=sc.nextInt();
		System.out.println(d*day>40);
	}
}