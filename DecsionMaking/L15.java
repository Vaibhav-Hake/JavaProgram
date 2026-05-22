import java.util.Scanner;
class L15{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Demand");
		int demand=sc.nextInt();
		System.out.println("Enter Supply");
		int supply=sc.nextInt();
		System.out.println("Enter peak (true/false)");
		boolean peak=sc.nextBoolean();
		if(demand>supply&&peak){
			System.out.println("Load Sheding");
		}else if(demand>supply){
			System.out.println("Using Backup Power ");
		}else if(supply>demand&&!peak){
			System.out.println("Storing Energy");
		}else{
			System.out.println("Normal Distrubution");
		}
	}
}