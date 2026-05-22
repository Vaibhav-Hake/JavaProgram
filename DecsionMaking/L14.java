import java.util.Scanner;
class L14{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Mark");
		int mark=sc.nextInt();
		System.out.println("Enter a entrance");
		int entrance=sc.nextInt();
		System.out.println("Enter categoery");
		String cat=sc.next();
		
		if(mark>=90&&entrance>=85){
			System.out.println("Direct Admission");
		}else if(mark>=75){
			System.out.println("Entrance Based Admission");
		}else if(cat.equalsIgnoreCase("Reserved")&&mark>=65){
			System.out.println("Relaxed Admission");
		}else{
			System.out.println("Rejected");
		}
	}
}