import java.util.Scanner;
class S6{
	public static void main(String[]ar){
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Bike \n 2.Car");
		int type=sc.nextInt();
		
		System.out.println("Hr");
		int hr=sc.nextInt();
		
		int r=0;
		
		switch(type){
			case 1:{
				r=10;
				break;
			}
			case 2:{
				r=20;
				break;
			}
		}
		int fee=hr*r;
		if(hr>5){
			fee+=50;
		}
		System.out.println(fee);
	}
}