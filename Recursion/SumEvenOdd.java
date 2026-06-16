import java.util.Scanner;
class SumEvenOdd{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n=sc.nextInt();
		int [] arr=sumEvenOdd(n,0,0);
		System.out.println("Sum Of Even Digit : "+arr[0]);
		System.out.println("Sum Of Odd Digit : "+arr[1]);
		
		
	}
	public static int[] sumEvenOdd(int num,int even,int odd){
		if(num==0) return new int[]{even,odd};
		if((num%10)%2==0){
			even+=num%10;
		}else{
				odd+=num%10;
		}
		return sumEvenOdd(num/10,even,odd);
	}
}