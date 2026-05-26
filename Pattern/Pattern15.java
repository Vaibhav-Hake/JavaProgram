class Pattern15{
	public static void main(String[]args){
		int n=3;
	char ch='a';
	char temp=ch;
		int even=2*n-1;
		int odd=1;
		for(int i=1;i<=n;i++){
			  ch=temp;
			
			for(int j=1;j<=n;j++){
			
			if(j%2!=0){
				
				System.out.print(ch+" ");
				ch+=even;
			}else{
				
				System.out.print(ch+" ");
				ch+=odd;
			}
			}
			even-=2;
			  odd+=2;
			  temp++;
			System.out.println();
		}
	}
}