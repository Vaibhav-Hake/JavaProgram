import java.util.Scanner;
class RevNum{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt(), dup=num;
		int rev=0;
		int rem=0;
		
		rem=num%10;
		rev=rev*10+rem;
		num/=10;
		
		rem=num%10;
		rev=rev*10+rem;
		num/=10;
		
		rem=num%10;
		rev=rev*10+rem;
		num/=10;
		
		rem=num%10;
		rev=rev*10+rem;
		num/=10;
		
		System.out.println(dup+" : "+rev);
	}
}