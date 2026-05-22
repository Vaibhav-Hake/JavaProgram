import java.util.Scanner;
class L5{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Mark sub1 ");
		int m1=sc.nextInt();
		System.out.println("Enter Mark sub2 ");
		int m2=sc.nextInt();
		System.out.println("Enter Mark sub3 ");
		int m3=sc.nextInt();
		if(m1<35||m2<35||m3<35){
			System.out.println("Fail");
		}else{
			double avg=(m1+m2+m3)/3.0;
			if(avg>=75){
				System.out.println("Distinction");
			}
			else if(avg>=60){
				System.out.println("First Class ");
			}else{
				System.out.println("pass");
			}
		}
	}
}