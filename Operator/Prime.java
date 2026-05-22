import java.util.Scanner;
class Prime{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");
		int num=sc.nextInt();
		
		String op= num<2 ||( num%2==0 && num!=2)||( num%3==0 && num!=3)||( num%5==0 && num!=5)||( num%7==0 && num!=7)?
		             num+" it is not prime ": num+" it is prime";
					 
        System.out.println(op);
	}
}