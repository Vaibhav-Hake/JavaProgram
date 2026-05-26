class Pattern24{
	public static void main(String[]args){
		int n=4;
	    char ch='a';
	 
		for(int i=1;i<=n;i++){
			
			
			for(int j=1;j<=n;j++){
			   System.out.print(ch+" ");
			   
			if(i%2!=0){
				
				ch++;
			}else{
				
				ch--;
			}
			}
			
			if(i%2!=0){
				ch=(char)(ch-1+n);
			}else{
				ch=(char)(ch+1+n);
			}
			System.out.println();
		}
	}
}