import java.util.Scanner;
class EvenOdd{
	// check the number is even or odd take input from user
  public static void main(String[]args){
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter a number");
	  int num=sc.nextInt();
	  
	  if(num%2==0)
	  {	  System.out.println("even"+num);
	  }else{
		  System.out.println("odd number"+num);
	  }
  }
}