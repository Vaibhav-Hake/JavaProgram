import java.util.Scanner;
class PowDigit{
	public static void main(String[]args){
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		int rem=0;
		int pow=1;
		
		rem=num%10;
		pow=pow*rem;
		num=num/10;
		
		rem=num%10;
		pow=pow*rem;
		num=num/10;
		
		rem=num%10;
		pow=pow*rem;
		num=num/10;
		
		rem=num%10;
		pow=pow*rem;
		num=num/10;
		
		System.out.println(pow);
	}
}