import java.util.Scanner;
import java.util.ArrayList;
class Bank{
	static String name;
	static String address;
	static long contact;
	static double balance;
	static int pin;
	static ArrayList<String>tranction=new ArrayList<>();
	
	public static void main(String[]args){
		launchApp();
	}
	public static Scanner getScannerInstance(){
		return new Scanner(System.in);
	}
	public static void launchApp(){
		while(true){
			System.out.println("\n WELCOME \n");
			System.out.println("1. New User");
			System.out.println("2. Login");
			System.out.println("Enter a option : ");
			int op=getScannerInstance().nextInt();
			
			switch(op){
				case 1 -> creatAcc();
				case 2 -> login();
				default -> System.out.println("\n Invalid Option \n");
			}
			
		}
	}
	public static void login(){
		if(name==null){
			System.out.println("\nACCOUNT NOT CREATED n");
			return;
		}
		System.out.println("\n LOGIN \n");
		System.out.println("contact : ");
		long uCon=getScannerInstance().nextLong();
		System.out.println("PIN  : ");
		int uPin=getScannerInstance().nextInt();
		if(validateUserCread(uPin,uCon)){
			homePage();
		}else{
		  System.out.println("\n INVALID CREAD \n");	
		}
		
	}
	public static void homePage(){
		while(true){
			System.out.println("\n SERVICES  \n");
			System.out.println("1. DEPOSITE AMT");
			System.out.println("2. WITDRAW AMT");
			System.out.println("3. CHECK BAL");
			System.out.println("4. STATMENT");
			System.out.println("5. LOGOUT");
			System.out.println("Enter a option : ");
			int opt=getScannerInstance().nextInt();
			switch(opt){
				case 1 ->{
					System.out.println("\n DEPOSITE MODULE \n ");
					System.out.println("Enter a Amount ");
					double amt=getScannerInstance().nextDouble();
					if(deposite(amt)){
						tranction.add("DEPOSITE : "+amt);
						System.out.println("\n AMOUNT DEPOSITED SUCESSFULLY\n ");
						
					}else{
						System.out.println("\n INVALID  AMT \n ");
					}
				}
				case 2 ->{
					System.out.println("\n WITDRAW MODULE \n ");
					System.out.println("Enter a Amount ");
					double wAmt=getScannerInstance().nextDouble();
				    System.out.println("Pin : ");
					int uPin=getScannerInstance().nextInt();
					if(validatePin(uPin)){
						if(checkAmt(wAmt)&&!(wAmt<0)){
							balance=withdrawAmt(wAmt);
							tranction.add("WITHDRAW AMT : "+wAmt);
							System.out.println("\n AMOUNT WITHDRAW SUCCESFULLY  \n");	
						}
						else if(wAmt<0){
	                     	System.out.println("\n INVALID AMOUNT  \n");	
						}
						else{
							System.out.println("\n INSUFFCIENT BALANCE  \n");	

						}
					}else{
					System.out.println("\n INVALID PIN   \n");	

					}
				}
				case 3 ->{
					System.out.println("\n CHECK BALANCE \n ");
					 System.out.println("Pin : ");
					int uPin=getScannerInstance().nextInt();
					if(validatePin(uPin)){
						System.out.println("Account Balance : "+balance);
					}
					else{
						System.out.println("INVALID PIN ");
					}
				}
				case 4 ->{
					  statement();
				}
				case 5 ->{
					System.out.println("\n THANK YOU !! \n ");
					 return ;
				}
				default ->{
					System.out.println("\n INVALID OPTION  \n ");
				}
			}
		}
	}
	public static void statement(){
		System.out.println("\n TRANSACTION \n");
	   for(String ele : tranction){
		   System.out.println(ele);
	   }
	}
	public static double withdrawAmt(double wAmt){
		return balance-wAmt;
	}
	public static boolean checkAmt(double wAmt){
		return balance>=wAmt;
	}
	public static boolean validatePin(int uPin){
		return uPin==pin;
	}
	
	public static boolean deposite(double amt){
		if(amt<0){
			return false;
			
		}
		balance+=amt;
		return true;
	}
	public static boolean validateUserCread(int uPin,long uCon){
		return (uPin==pin&& uCon==contact);
	}
	public static void  creatAcc(){
       if(name!=null){
		  	System.out.println("\n ACCOUNT ALREDY CREATED  ");
            return;			
	   }
	   	System.out.println("\n ACCOUNT CREATION \n ");
       System.out.println("Nmae : ");
	   name=getScannerInstance().nextLine();
	    System.out.println("Adress : ");
	   address=getScannerInstance().nextLine();
	    System.out.println("contact : ");
	   contact=getScannerInstance().nextLong();
	    System.out.println("Balance  : ");
	   balance=getScannerInstance().nextDouble();
	   tranction.add("deposite : "+balance);
	    System.out.println("PIN : ");
	   pin=getScannerInstance().nextInt();
	   	System.out.println("\n USER  ACCOUNT CREATED \n ");
	   
	}
}