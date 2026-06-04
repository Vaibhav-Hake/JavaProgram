import java.util.Scanner;    
class  EvenRange{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Starting point ");
		int sp=sc.nextInt();
		System.out.println("Enter a Endinging point ");
		int end=sc.nextInt();
		for(int i=sp;i<=end;i++){
			if(isEven(i)){
				System.out.println(i);
			}
		}
	}
	public static boolean isEven(int num){
		if(num%2==0){
			return true;
		}
		return false;
	}
}