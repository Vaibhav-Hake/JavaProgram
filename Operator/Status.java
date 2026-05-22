import java.util.Scanner;
class Status{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a mark ");
		float mark=sc.nextFloat();
		
		float per=(mark/500)*100;
		
		String op=(per>=90 && per<=100)?" OutStanding "+per:
		(per>=75 && per<=90)?" First Class With Distinction "+per:
		(per>=60 && per<=75)?" First class  "+per:
		(per>=50 && per<=60)?" Second class "+per:
		(per>=35 && per<=50)?" Pass "+per:
		(per>=0 && per<=35)?" Fail "+per:"Invalid Mark";
		System.out.println(op);
		
	}
}