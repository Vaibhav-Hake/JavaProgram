import java.util.Scanner;
class L7{
	public static void main(String[]ar){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a distance ");
		double dis=sc.nextDouble();
		System.out.println("Enter a Peak ");
		boolean p=sc.nextBoolean();
		System.out.println("Enter a Demand  ");
		String  demand=sc.next();
		
		double baseFare=dis*20;
		double total;
		if(p&&demand.equalsIgnoreCase("HIGH")){
			total=baseFare*2.5;
		}else if(p){
			total=baseFare*2;
		}else if(demand.equalsIgnoreCase("HIGH")){
			total=baseFare*1.5;
		}else{
			total=baseFare;
		}
		System.out.println("Total Fare : "+total);
		
	}
}