import java.util.Scanner;
class Circle{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		float r=sc.nextFloat();
		
		final float PI=3.14f;
		
		float area=PI*r*r;
		float peri=2*PI*r;
		
		System.out.println(area);
		System.out.println(peri);
	}
}