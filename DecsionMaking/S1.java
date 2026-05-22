import java.util.Scanner;
class S1{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int cPin=1234;
		int bal=5000;
		
		System.out.println("Enter pin");
		int uPin=sc.nextInt();
		if(uPin!=cPin){
			System.out.println("Invalid PIN");
			return;
		}
		
		System.out.println("1.check Bal \n2.Withdraw \n3.Deposite");
		int ch=sc.nextInt();
		
		switch(ch){
			case 1: System.out.println("bal : "+bal);break;
		  case 2:{
			       System.out.println("Enter amt");
		           int amt=sc.nextInt();
				   if(amt<=bal){
					   bal-=amt;
					   System.out.println("WithDraw Succesfully");
				   }else{
					   System.out.println("Insufficient Bal");
				   }
				   break;
				   }
			case 3:{
				System.out.println("ENter deposite");
				bal+=sc.nextInt();
				System.out.println("Deposite succefully");
				break;
			}
			default:{
				System.out.println("Invalid ch");
			}
		}
	}
}