import java.util.Arrays;
class TrailingZero{
	  public static void main(String[]args){
		  int []a={0,25,0,9,0,7,5,6,0,0,0};
		  System.out.println(Arrays.toString(trailing(a)));
	  }	
public static int[] trailing(int []a){
	int[]b=new int[a.length];
	int index=0;
	for(int i=0;i<a.length;i++){
		if(a[i]!=0){
			b[index++]=a[i];
		}
	}
	for(int i=0;i<a.length;i++){
		if(a[i]==0){
			b[index++]=a[i];
		}
	}
	return b;
}	  

}