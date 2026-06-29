class Car{
	String brand;
	String model;
	String color;
	double price;
	String engine;
	double milige;
	
	public  void displayCar(){
		System.out.println("Brand : "+brand);
		System.out.println("Model : "+model);
		System.out.println("Color : "+color);
		System.out.println("Price  : "+price+" rs ");
		System.out.println("Engine : "+engine);
		System.out.println("Milige : "+milige);
	}
}
class Object{
	public static void main(String[]args){
		Car car1=new Car();
		car1.displayCar();
		System.out.println("------------------------------------------------------");
		car1.brand="BMW";
		car1.model="M5";
		car1.color="White";
		car1.price=1000000000;
		car1.engine="1500cc";
		car1.milige=4.6;
		car1.displayCar();
		System.out.println("------------------------------------------------------");
		
		Car car2=new Car();
		car2.brand="WolksWagon";
		car2.model="Virtus";
		car2.color="White";
		car2.price=2000000;
		car2.engine="1200cc";
		car2.milige=7.6;
		car2.displayCar();
		System.out.println("------------------------------------------------------");
		
		Car car3=new Car();
		car3.brand="Suzuki";
		car3.model="Celerio";
		car3.color="White";
		car3.price=700000;
		car3.engine="1000cc";
		car3.milige=19;
		car3.displayCar();
		System.out.println("------------------------------------------------------");
	}
}