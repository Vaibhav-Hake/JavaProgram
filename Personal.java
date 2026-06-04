import java.util.Scanner;
class Personal{
	public static void main(String[]args){
		personalInfo();
	}
	public static void personalInfo(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name ");
		String name=sc.next();
		sc.nextLine();
		System.out.println("Enter your phone NO ");
		long ph=sc.nextLong();
		System.out.println("Enter your clgname ");
		String clg=sc.nextLine();
		System.out.println("Enter your cgpa ");
		int cgpa=sc.nextInt();
		System.out.println("Enter your native place ");
		String nplace=sc.next();
		System.out.println("Enter your Branch ");
		String branch=sc.next();
		
		System.out.println("Personal Info");
		System.out.println("name "+name);
		System.out.println("clg name : "+clg);
		System.out.println("phone number "+ph);
		System.out.println("native place "+nplace);
		System.out.println("branch "+branch);
		System.out.println("cgpa "+cgpa);
	}
}