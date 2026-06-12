import java.util.Scanner;
class NeonM{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(sq(num*num)==num){
			System.out.println("Neaon number");
		}else{
			System.out.println("NOt Neaon number");
		}
	}
	public static int sq(int num){
		int sum=0;
		while(num!=0){
			sum+=num%10;
			num/=10;
		}
		return sum;
	}
}