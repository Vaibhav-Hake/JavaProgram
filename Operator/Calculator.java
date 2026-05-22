import java.util.Scanner;
class Calculator{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a oprand 1");
		double op1=sc.nextDouble();
		System.out.println("Enter a operator ");
		char op=sc.next().charAt(0);
		System.out.println("Enter a operand 2");
		double op2=sc.nextDouble();
		double res=(op=='+')?op1+op2 :
                  (op=='-')?op1-op2 : 		
				  (op=='*')?op1*op2 : 
				  (op=='/')?op1/op2 : 
				  (op=='%')?op1%op2:
                   Double.MAX_VALUE;				   
				   
				   String ans=op1+" "+op+" "+op2+" = "+String.format("%f",res);
				   System.out.println(res==Double.MAX_VALUE?"INVALID OPERATOR ": ans);
	}
}