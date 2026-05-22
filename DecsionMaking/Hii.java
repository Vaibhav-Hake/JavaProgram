import java.util.Scanner;
class Hii{
	public static  void  main(String[]argd){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");
		int num=sc.nextInt();
        
       if(num%2==0 &&num%5!=0){
		   System.out.println("HiiTwo");
	   }		
	   if(num%5==0&&num%2!=0){
		   System.out.println("HiiFive");
	   }
	   if(num%2==0&&num%5==0){
		   System.out.println("HiiTwoHiiFive");
	   }
	  
	  
	  
  
	}
}