import java.util.*;
class Marker implements Comparable<Marker>{
	int id;
	String color;
	double price;
	
	Marker(int id,String color,double price){
		this.id=id;
		this.color=color;
		this.price=price;
	}
	
	public String toString(){
		return id+" "+color+" "+price+;
	}
	//ascend sort based onprice 
	/**@Override
	public int compareTo(Marker  obj){
		if(this.price>obj.price) return +1;
		else if(this.price<obj.price) return -1;
		return 0;
	}**/
	
	//id asc sort
	@Override
	public int compareTo(Marker  obj){
		return this.id-obj.id;
	}
	
	
	//id desc sort
	/**@Override
	public int compareTo(Marker  obj){
		return obj.id-this.id;
	}**/
	
	
	//@Override
	//public int compareTo(Marker  obj){
	  // if(this.color.compareTo(obj.price)>0) return -1;
		//else if(this.color.compareTo(obj.price)<0) return +1;
		//return 0;
	//}
}



class DriverExampleCom{
	public static void main(String []args){
		ArrayList<Marker>list=new ArrayList<Marker>();
		list.add(new Marker(1,"Red",25));
		list.add(new Marker(2,"Black",55));
		list.add(new Marker(3,"Red",20));
		list.add(new Marker(4,"Blue",255));
		
		list.forEach(ele->System.out.println(ele));
		Collections.sort(list);
		System.out.println("_________________________________________");
		list.forEach(ele->System.out.println(ele));
		
		System.out.println("_________________________________________");
		list.forEach(ele->System.out.println(ele));
	}
}