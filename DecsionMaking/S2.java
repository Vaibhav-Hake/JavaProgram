import java.util.Scanner;
class S2{
	public static void main(String[]ar){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter coupon :");
		String coupon=sc.next();
		System.out.println("Enter amount ");
		double amt=sc.nextDouble();
		
		double dis=0;
		
		switch(coupon){
			case "SAVE10":{
				dis=10;
				break;
			}
			case "SAVE20":{
				if(amt>2000){
					dis=20;
				}
				break;
			}
			case "FLAT500":{
				if(amt>5000){
					dis=50;
				}
			 break;
			}
			default:{
				System.out.println("Invalid coupon");
			   break;
			}
		}
		double fPrice=(dis<100)?amt-(amt*dis/100):amt-dis;
		System.out.println(fPrice);
	}
}