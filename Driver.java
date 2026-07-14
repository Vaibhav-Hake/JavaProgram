import java.util.ArrayList;
class Guest{
	String name;
	String add;
	long mob;
	Guest(String name,String add,long mob){
		this.name=name;
		this.add=add;
		this.mob=mob;
		
	}
	void displayGuest(){
		System.out.println("\n Guest Details ");
		System.out.println("Name : "+name);
		System.out.println("Address : "+add);
		System.out.println("Mob : "+mob);
	}
	
}
class EventDetails{
	String eventName;
	String add;
	int time;
    String oragnizer;
	ArrayList<Guest> guest=new ArrayList<Guest>();
	
	EventDetails(String eventName,String add,int time,String oragnizer){
		this.eventName=eventName;
		this.add=add;
		this.time=time;
		this.oragnizer=oragnizer;
	}
	void displayEvent(){
		System.out.println("\n Event Deatails ");
	    System.out.println("EventName: "+eventName);
	    System.out.println("address: "+add);
	    System.out.println("time: "+time);
	    System.out.println("oragnizer: "+oragnizer);
		displayAllGuest();
	}
	public void addGuest(Guest g){
		guest.add(g);
	}
	public  void displayAllGuest(){
		System.out.println("\n Guest Deatails ");
		for(Guest ele:guest){
			ele.displayGuest();
		}
	}
}
class Driver{
	public static void main(String []args){
		EventDetails obj=new EventDetails("Wedding ","Pune",8,"Event");
		obj.displayEvent();
		obj.addGuest(new Guest("Vaibhav","Pune",98564625));
		obj.addGuest(new Guest("Afroz","IchalKArnji",98564625));
		obj.addGuest(new Guest("Yash","Mahad",98564625));
		obj.addGuest(new Guest("Vaishnavi","Sangli",98564625));
		obj.addGuest(new Guest("Diksha","Shirala",98564625));
		obj.addGuest(new Guest("Pavan","Sangli",98564625));
		obj.displayEvent();
	}
}