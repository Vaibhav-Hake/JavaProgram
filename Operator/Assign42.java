class Assign42{
	public static void main(String[] args){
		byte profitPer = 20;
		int sellPrice = 1200;
		
		float costPrice = sellPrice / (1 + profitPer/100);
		System.out.println("Cost price : "+costPrice);
	}
}