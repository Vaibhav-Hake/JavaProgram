import java.util.*;
class DriverCollections{
	public static void main(String[]args){
		ArrayList<Integer>list=new ArrayList<Integer>();
		for(int i=1;i<=20;i++){
			list.add((int)(Math.random()*100));
		}
		System.out.println(list);
		//sort 
		Collections.sort(list);
		System.out.println(list);
		//binarySearch
		//System.out.println("Enter a element:");
		//int ele=new Scanner(System.in).nextInt();
		//int pos=Collections.binarySearch(list,ele);
		//System.out.println(pos>0?ele+"found at "+pos:ele+"Not found");
		//reverse 
		//Collections.reverse(list);
		//System.out.println(list);
		//shuffle
		//Collections.shuffle(list);
		//System.out.println(list);
		//swap
		//Collections.swap(list,2,6);
		//System.out.println(list);
		//fill
		//Collections.fill(list,2);
		//System.out.println(list);
		//min
		System.out.println(Collections.min(list));
		//max
		System.out.println(Collections.max(list));
		//rotataion
		Collections.rotate(list,3);
		System.out.println(list);
		//replaceAll
		Collections.replaceAll(list,33,52);
		System.out.println(list);
		
		
	}
}