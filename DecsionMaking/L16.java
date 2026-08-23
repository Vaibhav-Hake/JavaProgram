import java.util.Scanner;
class L16{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Amount ");
		int amt=sc.nextInt();
		System.out.println("It is International ");
		boolean international=sc.nextBoolean();
		System.out.println("Enter a failed ");
		int failed=sc.nextInt();
		
		if(failed>=3){
			System.out.println("BLOCK");
		}else if(international&&amt>500000){
			System.out.println("Block");
		}else if(amt>25000){
			System.out.println();
		}
	}
}