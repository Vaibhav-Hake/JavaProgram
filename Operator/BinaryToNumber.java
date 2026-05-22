class BinaryToNumber{
	public static void main(String[]args){
		int num=120;
		String bin="";
		
		while(num!=0){
		bin=(num%2)+bin;
		num/=2;
		}
		System.out.println(bin);
		
		//Binary to Number
		int n=0;
		int pow=1;
		for(int i=bin.length()-1;i>=0;i--){
			n=n+(bin.charAt(i)-48)*pow;
			pow*=2;
			
		}
		System.out.println(n);
	}
	
}