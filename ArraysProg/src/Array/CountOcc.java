package Array;
import java.util.Scanner;
public class CountOcc {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int []a= {121,356,7876,5431,125};
		int ct=0;
		int num=sc.nextInt();
		for(int i=0;i<(a.length);i++) {
			if(a[i]==num) {
				ct++;
			}
			
			}
		System.out.println(num+" : "+ct+" times ");
			}
		}
		
	
	

