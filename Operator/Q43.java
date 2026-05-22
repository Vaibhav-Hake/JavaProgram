import java.util.Scanner;

class Q43{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		
		double hr = sc.nextInt();
		double min = sc.nextLong();
		double sec = ((hr * 60) + min) *60;
		
		System.out.println(sec);
		
	}
}