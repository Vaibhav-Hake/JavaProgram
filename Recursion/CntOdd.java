import java.util.Scanner;
class CntOdd{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a num ");
		int n=sc.nextInt();
		System.out.println("The cnt of odd is : "+cO(n));
	}
	public static int cO(int n){
		if(n==0){
			return 0;
		}
		if((n%10)%2==0){
			return 1+cO(n/10);
		}
		return cO(n/10);
	}
}