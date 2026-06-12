import java.util.Scanner;
class RangeNeon{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int sp=sc.nextInt();
		int ep=sc.nextInt();
		for(int i=sp;i<=ep;i++){
			if(isNeon(i)){
				System.out.println(i);
			}
		}
	}
	public static boolean isNeon(int num){
		return num==sq(num*num);
		
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