import java.util.Scanner;
class SpyNum{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter a number Number");
		int num=sc.nextInt();	
		int sum=0;
		int pro=1;
		while(num!=0){
			int rem=num%10;
			sum+=rem;
			pro*=rem;
			num/=10;
		}
		if(pro==sum){
			System.out.println("it is spy Number");
		}else{
		    System.out.println("it not spy Number");
		}
	}
}