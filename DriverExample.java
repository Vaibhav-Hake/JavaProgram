class ShowRoom{
	String name;
	String address;
	String email;
	long contact;
	ShowRoom(String name,String address,String email,long contact){
		this.name=name;
		this.address=address;
		this.email=email;
		this.contact=contact;
		
	}
	void displayDetails(){
		System.out.println("\n ShowRoom Details ");
		System.out.println("Showroom Name : "+name);
		System.out.println("Showroom address : "+address);
		System.out.println("Showroom email : "+email);
		System.out.println("Showroom Contact : "+contact);
	}
}
class Car extends ShowRoom{
	String carName;
	String brand;
	String color;
	String fuelType;
	Car(String name,String address,String email,long contact,String carName,String brand,String color,String fuelType){
		super( name, address, email, contact);
		this.carName=carName;
		this.brand=brand;
		this.color=color;
		this.fuelType=fuelType;
	}
	void display(){
		displayDetails();
		System.out.println("\n Car Info");
		System.out.println("Car NAme: "+carName);
		System.out.println("Car brand: "+brand);
		System.out.println("Car color: "+color);
		System.out.println("Car fuelType: "+fuelType);
	}
}
class DriverExample{
	public static void main(String[]args){
		Car obj=new Car("Vaibhav CAr","Mahad","vhake@",564466464,"BMW M5","BMW","White","Petrol" );
		obj.display();
	}
}