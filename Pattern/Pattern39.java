class Pattern39{
	public static void main(String[]ar){
		int n=4;
		for(int i=1;i<=n;i++){
			int k=i;
			for(int j=1;j<=n;j++){
				System.out.print(k+" ");
				k+=i;
			}
			System.out.println();
		}
	}
}