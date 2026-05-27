class Pattern22{
	public static void main(String[]ar){
		int n=4;
		int k=1;
		for(int i=1;i<=n;i++){
		
			for(int j=1;j<=n;j++){
				System.out.print(k+" ");
				k++;
			}
			k--;
			System.out.println();
		}
	}
}