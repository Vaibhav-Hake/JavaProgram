import java.util.Scanner;
class FacanatingNum{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n=sc.nextInt();
		int d=div(n);
		System.out.println(d);
		int newNum=newNum(n,d);
		System.out.println(newNum);
		if(check(newNum)){
			System.out.println(n+" It is Facanating NUmber ");
		}else{
			System.out.println(n+" It is not Facanating NUmber ");
		}
	}
	public static int div(int n){
		int d=1;
		while(n!=0){
			d*=10;
			n/=10;
		}
		return d;
	}
	public static int newNum(int num,int d ){
		int newNum=num*d;
		for(int i=2;i<=3;i++){
			newNum+=num*i;
			if(i!=3){
				newNum*=d;
			}
			
		}
		return newNum;
	}
	public static boolean check(int num ){
		
		for(int i=1;i<=9;i++){
			int dup=num;
			int ct=0;
			while(dup!=0){
				int rem=dup%10;
				if(dup==i){
					ct++;
				}
			}
			if(ct!=1){
				return false;
			}
		}
		return true;
	}
}