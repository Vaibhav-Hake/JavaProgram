class Pattern45{
	public static void main(String[]ar){
		int n=4;
		int num=1;
		char ch='a';
		for(int i=1;i<=n;i++){
			
			for(int j=1;j<=n;j++){
		       if(j<=i){
				   System.out.print(num+" ");
				   num++;
			   }else{
				    System.out.print(ch+" ");
					ch++;
			   }
			}
			System.out.println();
		}
	}
}