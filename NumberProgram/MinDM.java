import java.util.Scanner;
class MinDM{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(minD(num));
	}
	public static int minD(int num){
		int min=9;
		while(num!=0){
			int rem=num%10;
			if(min>rem){
				min=rem;
			}
			num/=10;
		}
		return min;
	}
}