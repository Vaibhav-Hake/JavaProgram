import java.util.Scanner;
class Example{
    public static void main(String[]args){
		int[]a={5,2,3,7,2};
		System.out.println(max(a));
	}
	public static int max(int []a){
		int profit=0;
		for(int i=0;i<a.length-1;i++){
			if(a[i]<a[i+1]){
				profit+=(a[i+1]-a[i]);
			}
		}
		return profit;
	}
}