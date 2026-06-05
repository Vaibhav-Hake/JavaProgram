import java.util.Scanner;
class ProdDigitM{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(pro(num));
	}
	public static int pro(int num){
		int pro=1;
		while(num!=0){
			pro*=num%10;
			num/=10;
		}
		return pro;
	}
}