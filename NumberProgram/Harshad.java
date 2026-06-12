import java.util.Scanner;
class Harshad{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num<=0){
			System.out.println("it is not harshad number ");
		}
		else if(num%sum(num)==0){
			System.out.println("it  harshad number ");
		}else{
			System.out.println("it is not harshad number ");
		}
	}
	public static int sum(int n){
		int sum=0;
		while(n!=0){
			sum+=n%10;
			n/=10;
		}
		return sum;
	}
}