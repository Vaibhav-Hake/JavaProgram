import java.util.*;
class DriverExampleComparator{
	public static void main(String[]args){
		ArrayList<String>list=new ArrayList<>();
		list.add("Vaibhav");
		list.add("A");
		list.add("B");
		list.add("R");
		list.add("k");
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		Collections.sort(list,(s1,s2)->s2.compareTo(s1));
		System.out.println(list);
	}
}