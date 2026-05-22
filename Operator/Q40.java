import java.util.Scanner;
class Q40{
	public static void main(String[]args){
		Scanner sc=new Scanner (System.in);
		double p=sc.nextDouble();
		double d1=sc.nextDouble();
		double d2=sc.nextDouble();
	       	p=p-(p*d1/100);
			p=p-(p*d2/100);
			System.out.println(p);
	}
}