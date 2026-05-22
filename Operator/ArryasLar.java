import java.util.Arrays;
class ArryasLar{
	public static void main(String[]args){
		int a=5,b=85,c=86,d=98,e=35,f=0;
		int [] arr={a,b,c,d,e,f};
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("Smallest  "+arr[0]);
		System.out.println("Largest "+arr[arr.length-1]);
	}
}