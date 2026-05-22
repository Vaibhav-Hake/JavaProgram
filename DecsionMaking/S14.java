import java.util.Scanner;
class S14{
	public static void main(String[]ar){
		Scanner sc=new Scanner(System.in);
		int state=sc.nextInt();
		
		switch(state){
			case 1:{
				System.out.println("RED-STOP");
				break;
			}
			case 2:{
				System.out.println("GREEN-GO");
				break;
			}
			case 3:{
				System.out.println("YELLOW-WAITE");
				break;
			}
			default:{
				System.out.println("INVALID");
				break;
			}
		}
	}
}