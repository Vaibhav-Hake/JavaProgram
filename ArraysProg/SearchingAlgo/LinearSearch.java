class LinearSearch{
	public static void main(String[]args){
		int []a={10,20,30,40,50};
		int k=40;
		System.out.println(search(a,k));
    }
	public static int search(int []a,int k){
		for(int i=0;i<a.length;i++){
			if(a[i]==k){
				return i;
			}
		}
		return -1;
	}
}