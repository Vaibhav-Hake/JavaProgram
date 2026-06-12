import java.util.Scanner;
class Neon{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sq=num*num;
		int sum=0;
		while(sq!=0){
			sum+=sq%10;
			sq/=10;
		}
		if(sum==num){
			System.out.println("Neaon number");
		}else{
			System.out.println(" not Neaon number");
		}
	}
}