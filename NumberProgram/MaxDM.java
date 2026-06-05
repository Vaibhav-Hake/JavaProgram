import java.util.Scanner;
class MaxDM{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(maxD(num));
	}
	public static int maxD(int num){
		int max=0;
		while(num!=0){
			int rem=num%10;
			if(max<rem){
				max=rem;
			}
			num/=10;
		}
		return max;
	}
}