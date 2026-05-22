import java.util.Scanner;
class S10{
	public static void main(String[]ar){
		Scanner sc=new Scanner(System.in);
		int code=sc.nextInt();
		
		switch(code){
			case 404:{
				System.out.println("page not found");
				break;
			}
			case 500:{
				System.out.println("Server Error ");
				break;
			}
			case 403:{
				System.out.println("ForeBidden");
				break;
			}
			default:{
				System.out.println("Unknown Error");
			}
		}
	}
}