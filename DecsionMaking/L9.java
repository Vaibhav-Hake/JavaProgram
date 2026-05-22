import java.util.Scanner;
class L9{
	public static void main(String[]ar){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Vehicle");
		String vehicle=sc.next();
		System.out.println("Enter a hour");
		int hr=sc.nextInt();
		System.out.println("you are Vip (true/false)");
		boolean vip=sc.nextBoolean();
		int charge;
		
		if(vip){
			charge=0;
		}else if(vehicle.equalsIgnoreCase("Car")&&hr>5){
			charge=hr*100;
		}else if(vehicle.equalsIgnoreCase("Bike")){
			charge=hr*30;
		}else{
			charge=hr*50;
		}
		System.out.println("Charge "+charge);
	}
}