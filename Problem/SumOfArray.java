class SumOfArray {
    public static  int arraySum(int arr[]) {
        int sum=0;
        for(int i=0;i<arr.length;i++){
        sum+=arr[i];
    }
    return sum;
}
    public static void main(String[]args){
		int[]a={10,20,30,40};
		System.out.println(arraySum(a));
	}
}
