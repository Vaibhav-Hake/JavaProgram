class Population{
	public static void main(String[] args){
		byte birth = 7;
		byte death = 13;
		byte immigrant = 45;
		long population = 312032489l;
		
		int birthPerYr = 365 * birth;
		int deathPerYr = 365 * death;
		int immigrantPerYr = 365 * immigrant;
		
		long totalPopulation = population + (birthPerYr * 5) - (deathPerYr * 5) - (immigrantPerYr * 5);
		System.out.println("Total Population is : "+totalPopulation);
	}
}