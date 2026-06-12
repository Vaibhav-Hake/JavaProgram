import java.util.Scanner;
class DuckNumber{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num<=0){
			System.out.println("it is not Duck number ");
		}
		else if(isDuck(num)){
			System.out.println("it is Duck Number  ");
		}else{
			System.out.println("it is not Duck  number ");
		}
	}
	public static boolean isDuck(int n){
		while(n!=0){
			if(n%10==0){
				return true;
			}
			n/=10;
		}
		return false;
	}
}