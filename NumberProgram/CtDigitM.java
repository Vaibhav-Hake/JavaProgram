import java.util.Scanner;
class CtDigitM{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(ct(num));
		
	}
	public static int ct(int num){
		int ct=0;
		while(num!=0){
			ct++;
			num/=10;
		}
		return ct;
	}
}