import java.util.Scanner;
class Grade{
	public static void mai n(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a mark :");
		float mark=sc.nextFloat();
		float total=500;
		
		float per =(mark/total)*100;
		
		if(per>=90&&per<=100){
			System.out.println("Excellent"+per);
		}
		else if(per>=75&&per<=90){
			System.out.println("first class with dis"+per);
		}
		else if(per>=60&&per<=75){
			System.out.println("first class"+per);
		}
		else if(per>=50&&per<=60){
			System.out.println("2nd class"+per);
		}
		else if(per>=35&&per<=50){
			System.out.println("pass"+per);
		}
		else if(per>=0&&per<=35){
			System.out.println("fail"+per);
		}
		else{
			System.out.println("Invalid mark");
		}
	}
}