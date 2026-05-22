import java.util.Scanner;
class Financial{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Bal :");
		float  bal= sc.nextFloat();
		System.out.println("Enter a interst : ");
		float r=sc.nextFloat();
		float interstOfNext=bal*(r/1200);
		System.out.println(interstOfNext);
	}
}