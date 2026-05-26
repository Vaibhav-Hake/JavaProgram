class Pattern27{
	public static void main(String[]ar){
		int n=4;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(j==0||i==0||j==n-1||i==n-1){
					System.out.print("1"+" ");
				}else{
					System.out.print("2"+" ");
				}
			}
			System.out.println();
		}
	}
}