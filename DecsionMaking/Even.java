import java.util.Scanner;
class Even{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");
		int num=sc.nextInt();
		
		if(num%2==0||(num/2)*2==num){
			System.out.println("Even");
		}
		
		if(num%2!=0||(num/2)*2!=num){
			System.out.println("odd");
		}
	}
}