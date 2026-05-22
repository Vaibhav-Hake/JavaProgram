import java.util.Scanner;
class L1{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Salary : ");
		int sal=sc.nextInt();
		System.out.println("Enter credit : ");
		int credit=sc.nextInt();
		System.out.println("Enter existing  loan : ");
		int loan=sc.nextInt();
		if(loan>2){
			System.out.println("high Risk ");
		}
		else if(sal>=50000&&credit<=750){
			System.out.println("Approved ");
		}
		else if(sal>=30000&&credit>=650){
			System.out.println("Conditional Approved ");
		}else{
			System.out.println("loan Reject");
		}
	}
}