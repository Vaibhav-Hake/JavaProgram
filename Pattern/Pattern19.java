class Pattern19{
	public static void main(String[]ar){
		int n=4;
		int k=n;
		for(int i=1;i<=n;i++){
			int temp=k;
			for(int j=1;j<=n;j++){
				System.out.print(temp+" ");
				temp--;
			}
			k+=n;
			System.out.println();
		}
	}
}