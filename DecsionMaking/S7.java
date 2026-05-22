import java.util.Scanner;
class S7{
	public static void main(String[]ar){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("1.Theory\n2.Practicle");
		int type=sc.nextInt();
		
		System.out.println("Mark ");
		int m=sc.nextInt();
		
		switch(type){
			case 1:{
				if(m>=75){
					System.out.println("Distinction");
					
				}else if(m>=50){
					System.out.println("Pass");
				}else{
					System.out.println("fail");
				}
				break;
				
			}
			case 2:{
				System.out.println(m>=60?"pass":"fail");
				break;
			}
		}
		
	}
}