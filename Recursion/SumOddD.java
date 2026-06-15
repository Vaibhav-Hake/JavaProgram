import java.util.Scanner;
class SumOddD{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter anum : ");
		int n=sc.nextInt();
		System.out.println(cntE(n));
		
	}
	public static int cntE(int n){
		if(n==0)
			return 0;
		if((n%10)%2!=0)
			return n%10+cntE(n/10);
		
		return cntE(n/10);
	}
}