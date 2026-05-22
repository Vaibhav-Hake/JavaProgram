import java.util.Scanner;
class R6{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a user Name ");
		String u=sc.nextLine();
		System.out.println("Enter a Password ");
		String p=sc.nextLine();
		System.out.println(u.equals("vaibhav")&&p.equals("123"));
	}
}