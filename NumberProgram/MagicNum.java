import java.util.Scanner;
class MagicNum{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(isMagic(n)){
			System.out.println("Magic number ");
		}else{
			System.out.println("Not magic");
		}
	}
	public static boolean isMagic(int num){
		int sum=sum(num);
		while(sum>9){
			sum=sum(sum);
		}
		return sum==1;
	}
	public static int sum(int num){
		int sum=0;
		while(num!=0){
			sum+=num%10;
			num/=10;
		}
		return sum;
	}
}