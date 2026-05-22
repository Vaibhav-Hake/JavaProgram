import java.util.Scanner;
class S17{
	public static void main(String[]ar){
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Standerd \n 2.Deluxein \n3.Suite");
		int room=sc.nextInt();
		
		int p=0;
		switch(room){
			case 1:{
				p=1000;
				break;
			}
		    case 2:{
				p=2000;
				break;
			}
			case 3:{
				p=5000;
				break;
			}
			
		}
		System.out.println(p);
	}
}