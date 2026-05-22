class Bus{
	public static void main(String[]args){
		String name="Bus";
		byte totalCapicity=60;
		byte reservation=(byte)(totalCapicity/100.0*40);
		byte seniorCtz=(byte)(totalCapicity/100.0*3.5);
		byte femalRes=(byte)(totalCapicity/100.0*33);
		byte handiCapRes=(byte)(totalCapicity/100.0*7);
		byte tyers=6;
		byte doors=3;
		byte hault=12;
		System.out.println(name);
		System.out.println("Total Capicity of bus :"+totalCapicity);
		System.out.println("Senior citizen reservatioj :"+seniorCtz);
		System.out.println("Femal Res :"+femalRes);
		System.out.println("Handi Caprd Reservation :"+handiCapRes);
		System.out.println("No of Tyres :"+tyers);
		System.out.println("No of doors :"+doors);
		System.out.println("No of Hault :"+hault);
		
	}
}