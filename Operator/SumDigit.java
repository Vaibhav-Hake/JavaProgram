import java.util.Scanner;
class SumDigit{
	public static void main(String[]args){
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		int rem=0;
		int sum=0;
		
		rem=num%10;
		sum=sum+rem;
		num=num/10;
		
		rem=num%10;
		sum=sum+rem;
		num=num/10;
		
		rem=num%10;
		sum=sum+rem;
		num=num/10;
		
		rem=num%10;
		sum=sum+rem;
		num=num/10;
		
		System.out.println(sum);
	}
}