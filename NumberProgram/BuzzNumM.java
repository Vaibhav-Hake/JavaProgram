import java.util.Scanner;
class BuzzNumM{
	public static void main(String[]args){
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a number : ");
		int num=sc.nextInt();
		if(isBuzz(num)){
		  System.out.println("it is buzz number  ");

		}else{
			  System.out.println("it is not buzz number  ");
		}
	}
	public static boolean isBuzz(int num){
		if(num%10==7|| num%7==0){
			return true;
		}
		return false;
	}
}