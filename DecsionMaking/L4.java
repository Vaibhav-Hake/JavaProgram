import java.util.Scanner;
class L4{
	public static void main(String[]ar){
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter units ");
		int unit=sc.nextInt();
		int bill;
		if(unit<=100){
			bill=unit*5;
		}
		else if(unit<=300){
			bill=(100*5)+(unit-300)*7;
		}
		else{
			bill=(100*5)+(200*7)+(unit-300)*10;
		}
		System.out.println("total "+bill);
	}
}