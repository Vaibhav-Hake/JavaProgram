import java.util.Scanner;
class RangeTable{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter starting number");
		int s=sc.nextInt();
		System.out.println("Enter Endinging number");
		int end=sc.nextInt();
		for(int i=s;i<=end;i++){
			table(i);
			
		}
	}
	public static void table(int num){
		for(int i=1;i<=10;i++){
			System.out.println(i*num);
		}
	}
}
