import java.util.Scanner;
class Factor{
	public static void main(String[]args){
	  Scanner sc=new Scanner(System.in);
	  int num=sc.nextInt();
	  int d=1;
	  while(d<=num/2){
		if(num%d==0){
			System.out.println(d);
		}
		d++;
	}
	System.out.println(num);
	}
	
}