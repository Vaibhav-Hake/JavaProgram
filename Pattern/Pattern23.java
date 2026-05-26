class Pattern23{
	public static void main(String[]args){
		int n=4;
	    int k=1;
	
		for(int i=1;i<=n;i++){
			
			
			for(int j=1;j<=n;j++){
			   System.out.print(k+" ");
			   
			if(i%2!=0){
				
				k++;
			}else{
				
				k--;
			}
			}
			if(i%2!=0){
				k=k-1+n;
			}else{
				k=k+1+n;
			}
			System.out.println();
		}
	}
}