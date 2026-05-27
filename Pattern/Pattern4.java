class Pattern4{
	public static void main(){
		int n=3;
		for(int i=1;i<=n;i++){
			int num=i;
			for(int j=1;j<=n;j++){
				System.out.print(num+++" ");
			}
			System.out.println();
		}
	}
}