import java.util.Scanner;
class CountDigit{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number ");
		int num=sc.nextInt();
		int ct=0;
		if(num==0){
			ct=1;
		}else{
			while(num>0){
			ct++;
			num/=10;
		}
		}
		System.out.println(ct);
	}
}