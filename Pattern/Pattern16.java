class Pattern16{
	public static void main(String[]args){
		int n=3;
		for(int i=1;i<=n;i++){
			int k=i;
			for(int j=1;j<=n;j++){
			
				System.out.print(k+"  ");
					k+=n;
			}
			System.out.println();
		}
	}
}