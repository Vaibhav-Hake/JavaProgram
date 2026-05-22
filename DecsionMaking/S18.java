import java.util.Scanner;
class S18{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("1.Citizen \n2.Foreginer");
		int type=sc.nextInt();
		
		int age=sc.nextInt();
		
		switch(type){
			case 1:{
				System.out.println(age>=18?"Eligible":"Not Eligible");
				break;
			}
			case 2:{
				System.out.println("Not Allowed");
				break;
			}
		}
	}
}
