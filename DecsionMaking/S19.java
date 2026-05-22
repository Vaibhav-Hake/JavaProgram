import java.util.Scanner;
class S19{
	public static void main(String[]ar){
		Scanner sc=new Scanner(System.in);
		
		int km=sc.nextInt();
		int f=0;
		
		switch(km/10){
			case 0:{
				f=10;
				break;
			}
			case 1:{
				f=20;
				break;
			}
			case 2:{
				f=30;
				break;
			}
			default:{
				f=50;
				break;
			}
		}
		System.out.println(f);
	}
}