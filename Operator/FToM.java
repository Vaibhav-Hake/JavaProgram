import java.util.Scanner;
class FToM{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double feet = sc.nextDouble();
		
		double meter = feet*0.305;
		System.out.println(meter);
	}
}