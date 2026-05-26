class Pattern17{
	public static void main(String[]args){
		int n=4;
		char ch='a';
		char temp=ch;
		
		for(int i=1;i<=n;i++){
			
			 ch=temp;
			for(int j=1;j<=n;j++){
			
				System.out.print(ch+"  ");
					ch+=n;
			}
			temp++;
			System.out.println();
		}
	}
}