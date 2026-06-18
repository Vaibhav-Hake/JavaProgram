import java.util.Scanner;
class MinFreqDigit{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int d=-1;
		int f=9;
		for(int i=0;i<=9;i++){
			int c=freq(n,i);
			if(c!=0&&f>c){
				d=i;
				f=c;
			}
		}
		System.out.println(d+" 
		s: "+f);
	}
	public static int freq(int num,int i){
		int cnt=0;
		for(int j=num;j!=0;j/=10){
			if(j%10==i) cnt++;
		}
		return cnt;
	}
}