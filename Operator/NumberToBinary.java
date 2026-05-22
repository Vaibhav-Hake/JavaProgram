class NumberToBinary{
	public static void main(String[]args){
		int num=110;
		String bin=Integer.toBinaryString(num);
		System.out.println("num1 : "+num);
		System.out.println("Binary : "+bin);
		
		int num1=Integer.valueOf(bin,2);
		System.out.println("num1 : "+num1);
		int num2=Integer.valueOf(bin,8);
		System.out.println("OctalNumber : "+num2);
	
	}
}