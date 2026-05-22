import java.util.Scanner;
class R24{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a ren ");
		int run=sc.nextInt();
		System.out.println("Enter a over ");
		int o=sc.nextInt();
		System.out.println((run/o)>6 && run%o==5);
	}
}