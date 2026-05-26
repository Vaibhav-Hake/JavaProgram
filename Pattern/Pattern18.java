class Pattern18{
	public static void main(String[]args){
		int n=3;
	
		int even=2*n-1;
		int odd=1;
		for(int i=1;i<=n;i++){
			int k=i;
			
			for(int j=1;j<=n;j++){
			
			if(j%2!=0){
				
				System.out.print(k+" ");
				k+=even;
			}else{
				
				System.out.print(k+" ");
				k+=odd;
			}
			}
			even-=2;
			  odd+=2;
			System.out.println();
		}
	}
}