import java.util.Scanner;
class CheckLeap{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Year ");
		int  y=sc.nextInt();
		String op=((y%400==0)||(y%4==0&&y%100!=0))?y+" is Leap Yera":y+" is not LeapYear";
		System.out.println(op);
	}
}