import java.util.Scanner;
class MinDigit{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num=sc.nextInt();
		int min=9;
		while(num!=0){
			int rem=num%10;
			if(min>rem){
				min=rem;
			}
			num/=10;
		}
		System.out.println(min);
	}
}