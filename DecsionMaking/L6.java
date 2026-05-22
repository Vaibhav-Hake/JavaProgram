import java.util.Scanner;
class L6{
	public static void main(String[]ar){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a amt");
		float amt=sc.nextFloat();
		System.out.println("Enter Transaction");
		int tr=sc.nextInt();
		System.out.println("Enter a Loc");
		boolean isLoc=sc.nextBoolean();
		
		if(amt>50000){
			System.out.println("Suspicious Transaction");
		}
		else if(tr>3){
			System.out.println("fraud risk");
		}
		else if(!isLoc){
			System.out.println("high Fraud");
		}else{
			System.out.println("normal Transaction");
		}
	}
}