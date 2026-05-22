import java.util.Scanner;
class S5{
	public static void main(String[]ar){
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Home \n 2.Car");
		int type=sc.nextInt();
		
		System.out.println("sal");
		int sal=sc.nextInt();
		
		System.out.println("Credit Score");
		int score=sc.nextInt();
		
		switch(type){
			case 1:{
				if(sal>50000&&score>700){
					System.out.println("Home loan Appr");
				}else{
					System.out.println("Rejected ");
				}
				break;
			}
			case 2:{
				if(sal>30000&&score>650){
					System.out.println("car loan Appr");
				}else{
					System.out.println("Rejected ");
				}
				break;
			}
			default:{
				System.out.println("Invalid type");
				break;
			}
		}
		
		
	}
}