import java.util.Scanner;
class DuplicateDigit{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<=9;i++){
			int c=freq(n,i);
			if(c>1){
				System.out.println(i+" : "+c);
			}
		}
	}
	public static int freq(int num,int i){
		int cnt=0;
		for(int j=num;j!=0;j/=10){
			if(j%10==i) cnt++;
		}
		return cnt;
	}
}