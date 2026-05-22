import java.util.Scanner;
class Year{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a min");
		long min=sc.nextLong();
		
		long days=min/(60*24);
		 
		 long year=days/365;
		 long remaing=days%365;
		 
		 System.out.println(min+" miniutes is Approximilitly "+year+" years "+remaing+" days" );
	}
}