package Simple;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Train{
	String name;
	String trainNumber;
	String departure;
	String destination;
	public Train(String name, String trainNumber, String departure, String destination) {
		super();
		this.name = name;
		this.trainNumber = trainNumber;
		this.departure = departure;
		this.destination = destination;
	}
	@Override
	public String toString() {
		return "Train [name=" + name + ", trainNumber=" + trainNumber + ", departure=" + departure + ", destination="
				+ destination + "]";
	}
	
}
class Ticket{
	static int seat=12321;
	String name;
	String gender;
	int age;
	String seatNumber;
	Train train;
	public Ticket(String name, String gender, int age, Train train) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.seatNumber = "VB"+seat++;
		this.train = train;
	}
	@Override
	public String toString() {
		return "Ticket [ seatNumber=" + seatNumber + "]";
	}
	
	
}

class Passenger{
	String name;
	String gender;
	int age;
	long contact;
	Ticket ticket;
	public Passenger(String name, String gender, int age, long contact, Train train) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.contact = contact;
		this.ticket = new Ticket(name,gender,age,train);
	}
	@Override
	public String toString() {
		return "Passenger [name=" + name + ", gender=" + gender + ", age=" + age + ", contact=" + contact + ", ticket="
				+ ticket + "]";
	}
	
	
}
class SortNameAsc implements Comparator<Passenger>{
	@Override
	public int compare(Passenger p1,Passenger p2) {
		return p1.name.compareTo(p2.name);
	}
	
}

class SortNameDesc implements Comparator<Passenger>{
	@Override
	public int compare(Passenger p1,Passenger p2) {
		return p2.name.compareTo(p1.name);
	}
	
}

class SortAgeDesc implements Comparator<Passenger>{
	@Override
	public int compare(Passenger p1,Passenger p2) {
		return p.age-p1.age;
	}
	
}
class IRCTC{
	Train t=new Train("VandeBharat","VB4535","Pune","USA");
	ArrayList<Passenger>list=new ArrayList<Passenger>();
	{
		list.add(new Passenger("Vaibhav","Male",22,6544664l,t));
		list.add(new Passenger("A","Male",28,7544664l,t));
		list.add(new Passenger("K","Female",12,85544664l,t));
		list.add(new Passenger("R","Female",23,6544664l,t));
		list.add(new Passenger("B","Male",50,8544664l,t));
	}
	public void feture() {
		while(true) {
			System.out.println("\n Welcome To Irctc");
			System.out.println("1.View All Passenger");
			System.out.println("2.Sort");
			System.out.println("Enter your Option ");
			int opt=new Scanner(System.in).nextInt();
			switch(opt) {
			case 1 -> viewAll();
			case 2->sort();
			}
		}
	}
	private void sort() {
		System.out.println("\n Options ");
		System.out.println("1.Name Asc");
		System.out.println("2.Name Descending");
		System.out.println("3.Gender ");
		System.out.println("4.Age DESC");
		System.out.println("5.Age Asc");
		System.out.println("6.Ticket Ascending");
		System.out.println("Enter options : ");
		int opt=new Scanner(System.in).nextInt();
		switch(opt) {
		case 1-> nameAsc();
		case 2-> nameDesc();
		case 3-> genderSort();
		case 4->ageDesce();
		case 5->ageAsc();
		case 6->TicAsc();
		
		}
	}
	private Object TicAsc() {
		// TODO Auto-generated method stub
		return null;
	}
	private void ageAsc() {
		Collections.sort(list,(p1,p2)->p1.age-p2.age);
	}
	private void ageDesce() {
		Collections.sort(list,new SortAgeDesc());
	}
	private Object genderSort() {
		// TODO Auto-generated method stub
		return null;
	}
	private Object nameDesc() {
		// TODO Auto-generated method stub
		return null;
	}
	private void nameAsc() {
		
	}
	private void viewAll() {
		
	}
}
public class DriverComparator {

}
