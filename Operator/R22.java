import java.util.Scanner;
class R22{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter m ");
		int m=sc.nextInt();
		System.out.println("Enter a petrol ");
		int p=sc.nextInt();
		
		System.out.println((m/p)>8 && m%p==9);
	}
}