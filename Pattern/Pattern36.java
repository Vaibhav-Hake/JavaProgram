class Pattern36{
	public static void main(String[]ar){
		int m=5;
		int n=6;
		
		//int num=1;
		for(int i=1;i<=m;i++){
		
			for(int j=1;j<=n;j++){
				if(i==1||j==1||i==m||j==n||i==m/2||i==3/4*m){
					System.out.print("1"+" ");
				
				}else{
					System.out.print("0"+" ");
				}
			}
			
			System.out.println();
		}
	}
}