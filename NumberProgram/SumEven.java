import java.util.Scanner;
class SumEven{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Starting point ");
		int sp=sc.nextInt();
		System.out.println("Enter a Endinging point ");
		int ep=sc.nextInt();
		int sum=0;
		for(int i=sp;i<=ep;i++){
		if(isEven(i)){
			sum+=i;
		}
		}
		System.out.println(sum);
		
	}
	public static boolean isEven(int num){
		if(num%2==0){
			return true;
		}
		return false;
	}
}