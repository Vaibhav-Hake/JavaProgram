import java.util.ArrayList;
class MyArrayList <E>{
	private E[] arr;
	private int index;
	private  final int INITIAL_CAPACITY=10;
	public MyArrayList(){
		this.arr=(E[])new Object[INITIAL_CAPACITY];
	}
	
	public int size(){
		return this.index;
	}
	public int newCapcity(int old){
		return (int)(old*1.5);
	}
	public boolean isEmpty(){
		return size()==0;
	}
	
	public boolean add(E ele){
		if(size()==this.arr.length){
			E[]newArray=(E[])new Object[newCapcity(this.arr.length)];
			for(int i=0;i<arr.length;i++){
				newArray[i]=arr[i];
			}
			this.arr=newArray;
		}
		this.arr[this.index]=ele;
		this.index++;
		
		
		
		return true;
		
	}
	@Override
	public String toString(){
		if(size()==0)return "[]";
		StringBuffer sb=new StringBuffer("[");
		for(int i=0;i<size()-1;i++){
			sb.append(arr[i]+" , ");
		}
		sb.append(arr[size()-1]+"]");
		
		return new String(sb);
		
	}
	
}

class ArrayListExample {
	public static void main(String[]args){
		ArrayList<Integer> list1=new ArrayList<Integer>();
		
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		System.out.println(list1);
		System.out.println(list1.isEmpty());
		MyArrayList<Integer> list2=new MyArrayList<Integer>();
		/**list2.add(10);
		list2.add(20);
		list2.add(30);
		list2.add(40);
		list2.add(50);**/
		System.out.println(list2);
		System.out.println(list2.isEmpty());
	}
}