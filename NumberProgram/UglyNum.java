import java.util.Scanner;
class UglyNum{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Num : ");
		int n=sc.nextInt();
		if(isUgly(n)){
			System.out.println(n+" The Number is Ugly");
		}else{
			System.out.println(n+" The Number is not Ugly");
		}
	}
	public static boolean isUgly(int n){
		if(n<1){
			return false;
		}
		while(n>1){
			if(n%2==0){
				n/=2;
			}
			else if(n%3==0){
				n/=3;
			}
			else if(n%5==0){
				n/=5;
			}else{
				return false;
			}
		}
		return true;
	}
}