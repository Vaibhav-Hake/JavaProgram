import java.util.Scanner;
class Pronic{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n=sc.nextInt();
		if(isPronic(n)){
			System.out.println("It is Pronic number  ");
		}else{
			System.out.println("It is not  Pronic number  ");
		}
		
	}
	public static boolean isPronic(int n){
		for(int i=1;i*(i+1)<=n;i++){
			if(i*(i+1)==n){
				return true;
			}
		}
		return false;
	}
}