import java.util.Scanner;
class Leap{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");
		int y=sc.nextInt();
		
		if(y%400==0 ||(y%4==0&&y%100!=0)){
			System.out.println("leap");
		}
		
		else{
			System.out.println("not leap");
		}
	}
}