import java.util.Scanner;
class L8{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a amt : ");
		int amt=sc.nextInt();
		System.out.println("Enter a year : ");
		int y=sc.nextInt();
		System.out.println("Enter a claims : ");
		int c=sc.nextInt();
		
		if(c>2){
			System.out.println("Rejected");
		}else if(amt<=50000&&c==0){
			System.out.println("Approved");
		}else if(amt<200000&&y>=5){
			System.out.println("Partial Approval");
		}else{
			System.out.println("Manual Review");
		}
	}
}