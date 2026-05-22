import java.util.Scanner;
class S8{
	public static void main(String[]ar){
		Scanner sc=new Scanner(System.in);
		
		int km=sc.nextInt();
		int time=sc.nextInt();
		
		int fare=km*10;
		
		switch(time){
			case 1:{
				fare*=2;
				break;
			}
			case 2:{
				break;
			}
		}
		System.out.println(fare);
	}
}