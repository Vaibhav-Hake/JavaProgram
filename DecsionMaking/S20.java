import java.util.Scanner;
class S20{
	public static void main(String[]ar){
		Scanner sc=new Scanner(System.in );
		int lang=sc.nextInt();
		
		switch(lang){
			case 1:{
				System.out.println("Hello");
				break;
			}
			case 2:{
				System.out.println("Namste");
				break;
			}
			case 3:{
				System.out.println("Banjor");
				break;
			}
			default:{
				System.out.println("Unknown");
				break;
			}
			
		}
	}
}