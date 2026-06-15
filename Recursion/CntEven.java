import java.util.Scanner;
class CntEven{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Num : ");
		int n=sc.nextInt();
		System.out.println("Cnt of Even "+cE(n));
	}
	public static int cE(int n){
		if(n==0){
			return 0;
		}
		if((n%10)%2==0){
			return 1+cE(n/10);
		}
		return cE(n/10);
	}
}