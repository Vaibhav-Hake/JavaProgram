import java.util.Scanner;
class L2{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a purchace Amount ");
		float amt=sc.nextFloat();
		System.out.println("Enter Member (Regular/Primium : )");
		String member=sc.next().toUpperCase();
		if(amt>=10000&&member.equals("PRIMIUM")){
			System.out.println("Discount : 30%");
		}
		else if(amt>=5000){
			System.out.println("Discount : 20%");
		}
		else if(amt>=2000){
			System.out.println("Discount : 10%");
		}else{
			System.out.println("No Discount ");
		}
	}
}