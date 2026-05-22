import java.util.Scanner;
class R15{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a price ");
		int p=sc.nextInt();
		System.out.println(p%100==0);
	}
}