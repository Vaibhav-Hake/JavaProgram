import java.util.Scanner;
class PrimeNumber1{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Prime Number");
		int num=sc.nextInt();
		if(num==2){
			System.out.println("The Number is Prime");
		}
		else if(num==1 || num%2==0){
			System.out.println("The Number is Not Prime");
		}
		else{
			int i=3;
			for(;i*i<=num;i++){
				if(num%i==0){
					break;
				}
			}
			if(i*i>num){
				System.out.println("The Number is Prime");
			}
			else{
				System.out.println("The Number is not Prime");
			}
		}
	}
}