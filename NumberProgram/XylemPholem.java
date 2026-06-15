import java.util.Scanner;
class XylemPholem{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(isXylem(num)){
			System.out.println("The number is Xylem");
		}else{
			System.out.println("The number is Pholem");
		}
	}
	public static boolean isXylem(int num){
		int last=num%10;
		num/=10;
		int sum=0;
		while(num>10){
			sum+=num%10;
			num/=10;
		}
		last+=num;
		return sum==last;
	}
}