import java.util.Scanner;
class S9{
	public static void main(String[]ar){
		Scanner sc=new Scanner(System.in);
		
		String role=sc.next();
		
		switch(role){
			case "admin":{
				System.out.println("Read Write Delete");
				break;
			}
			case "user":{
				System.out.println("Read Write ");
				break;
			}
			case "gust":{
				System.out.println("Read ");
				break;
			}
			default:{
				System.out.println("No ");
				break;
			}
		}
	}
}