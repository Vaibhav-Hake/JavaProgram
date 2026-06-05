import java.util.Scanner;
class Pattern46{
	public static void main(String[]args){
		int n=6;
		int k=1;
		for(int i=1;i<=n;i++){
			int m=k;
			for(int j=1;j<=i;j++){
				System.out.print(m+" ");
				m--;
			}
			k=k+1+i;
			System.out.println();
		}
	}
}