 import java.util.Scanner;
class LadderCal{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number1 : ");
		int num1=sc.nextInt();
		System.out.println("Enter a operator : ");
		char op=sc.next().charAt(0);
		System.out.println("Enter a number2 : ");
		int num2=sc.nextInt();
		
		if(op=='+'){
			System.out.println(num1+" "+op+" "+num2+" = "+(num1+num2));
		}
		else if(op=='-'){
			System.out.println(num1+" "+op+" "+num2+" = "+(num1-num2));
		}
		else if(op=='*'){
			System.out.println(num1+" "+op+" "+num2+" = "+(num1*num2));
		}
		else if(op=='/'){
			System.out.println(num1+" "+op+" "+num2+" = "+(num1/num2));
		}
		else if(op=='%'){
			System.out.println(num1+" "+op+" "+num2+" = "+(num1%num2));
		}
		else{
			System.out.println("Invalid opeartor");
		}
	}
}