import java.util.Scanner;
class Evil{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(ct(numToBin(num))%2==0){
			System.out.println("Evil");
		}else{
			System.out.println("odus");
		}
	}
	public static int numToBin(int num){
		int bin=0;
		int pos=1;
		while(num!=0){
			int rem=num%2;
			bin=pos*rem+bin;
			pos*=10;
			num/=2;
		}
		return bin;
	}
	public static int ct(int bin){
		int ct=0;
		while(bin!=0){
			if(bin%10==1){
				ct++;
			}
			bin/=10;
		}
		return ct; 
	}
}