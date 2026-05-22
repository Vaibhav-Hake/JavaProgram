import java.util.Scanner;
class Clock{
	public static void main(String[]args){
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a Number : ");
		int num=sc.nextInt();
	  int res=num<=12?num:num%12;
System.out.println(res);	  
    }
}