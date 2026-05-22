class NumberToBinary1{
	public static void main(String[]args){
		int num=110;
		String bin="";
		int rem=0;
		
		rem=num%10;
		bin=rem+bin;
		
		num=num/2;
		rem=num%2;
		bin=rem+bin;
		
		num=num/2;
		rem=num%2;
		bin=rem+bin;
		
		num=num/2;
		rem=num%2;
		bin=rem+bin;
		
		num=num/2;
		rem=num%2;
		bin=rem+bin;
		
		num=num/2;
		rem=num%2;
		bin=rem+bin;
		
		num=num/2;
		rem=num%2;
		bin=rem+bin;
		
		num=num/2;
		rem=num%2;
		bin=rem+bin;
		
		System.out.println("Divident "+num);
		System.out.println("Divisor "+2);
		System.out.println("reminder "+rem);
		System.out.println("Bin "+bin);
		
		
		
		
	}
}