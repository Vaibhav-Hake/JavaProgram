import java.util.Scanner;
class L3{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Performance Score :");
		int score=sc.nextInt();
		System.out.println("Enter Attendace in : ");
		int att=sc.nextInt();
		if(score>=90&&att<=90){
			System.out.println("Excellent ");
		}
		else if(score>=75){
			System.out.println("Good ");
		}else if(score>=60){
			System.out.println("Average ");
		}else{
			System.out.println("Poor");
		}
		
	}
}
