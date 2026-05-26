class Pattern38{
	public static void main(String[]ar){
		int n=5;
		//int num=1;
		for(int i=1;i<=n;i++){
		
			for(int j=1;j<=n;j++){
				if(i==j||i+j==n+1){
					System.out.print(i+" ");
				
				}else{
					System.out.print("0"+" ");
				}
			}
			
			System.out.println();
		}
	}
}