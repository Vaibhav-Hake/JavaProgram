class NumberToBinary2{
	public static void main(String[]args){
		int num=110;
		String bin=" ";
		
		while(num!=0){
			int rem=num%2;
			bin=rem+bin;
			num/=2;
		}
		System.out.println(bin);
	}
}