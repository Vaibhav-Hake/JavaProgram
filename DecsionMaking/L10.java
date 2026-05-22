import java.util.Scanner;
class L10{
	public static void main(String[]ar){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Dis ");
		int dis=sc.nextInt();
		System.out.println("Enter a amt ");
		int amt=sc.nextInt();
		System.out.println("Enter a Weather ");
		String w=sc.next();
		
		if(dis>10&&w.equalsIgnoreCase("rain")){
			System.out.println("Not Deliveriable ");
		}else if(amt>=500){
			System.out.println("Free Delivery");
		}else if(dis<=5){
			System.out.println("Fast Delivery");
		}else{
			System.out.println("Standerd Delivery");
		}
	}
}