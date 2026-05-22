import java.util.Scanner;
class IfExample1{
	public static  void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Status ");
		boolean res=sc.nextBoolean();
		if(res){
			System.out.println("Executing from if block");	
 			}
	       System.out.println("THE END");
	   }
	
}