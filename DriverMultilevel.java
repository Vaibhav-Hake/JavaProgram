class Country{
	String name;
	String language;
	long population;
	String cpital;
	
	Country(String name, String language ,long population,String cpital){
		this.name=name;
		this.language=language;
		this.population=population;
		this.cpital=cpital;
		
	}
	public void displayCountry(){
		System.out.println("\n Country Information");
		System.out.println(" Country Name : "+name);
		System.out.println(" Country Population : "+population);
		System.out.println(" Country Capital : "+cpital);
	}
}
class State extends Country{
	String sName;
	String cm;
	String capital;
	State(String name, String language ,long population,String cpital,String sName,String cm,String capital){
		super(name,language,population,cpital);
		this.sName=sName;
		this.cm=cm;
		this.capital=capital;
		
	}
	public void displayState(){
		System.out.println("\n State Information");
		System.out.println(" State Name : "+sName);
		System.out.println(" State Chief Minister : "+cm);
		System.out.println(" State Capital : "+capital);
	}
	
}
class District extends State{
	String dName;
	String collector;
	long area;
	District(String name, String language ,long population,String cpital,String sName,String cm,String capital,String dName,String collector,long area){
		super(name,language,population,cpital,sName,cm,capital);
		this.dName=dName;
		this.collector=collector;
		this.area=area;
	}
	public void displayDistrict(){
		System.out.println("\n District  Information");
		System.out.println(" District Name : "+sName);
		System.out.println(" District Collector : "+cm);
		System.out.println(" District Area : "+area);
	}
}
class DriverMultilevel{
	public static void main(String[]args){
		District d=new District("Ind","Hindi",667698789797l,"Dehli","Maharastra","Devndra Fadvnis","Mumbai","Raigad","Vijay Suryvanshi",46421);
		d.displayCountry();
		d.displayState();
		d.displayDistrict();
	}
}