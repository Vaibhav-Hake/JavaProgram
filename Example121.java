import java.util.Scanner;
class Example121{
    public static void main(String[]args){
		int[] a = {7, 1, 5, 3, 6, 4};
		System.out.println(max(a));
	}
	public static int max(int []a){
		int profit=0;
		int min=a[0];
		for(int i=1;i<a.length;i++){
			if(a[i]<min){
				min=a[i];
			}
			else{
				if(a[i]-min>profit){
					profit=(a[i]-min);
				}
			}
		}
		return profit;
	}
}