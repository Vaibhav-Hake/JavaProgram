import java.util.Scanner;
class MaxDigit{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num=sc.nextInt();
		int max=0;
		while(num!=0){
			int rem=num%10;
			if(max<rem){
				max=rem;
			}
			num/=10;
		}
		System.out.println(max);
	}
}