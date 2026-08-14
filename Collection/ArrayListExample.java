import java.util.ArrayList;
class UserIndexOutOfBoundException extends RuntimeException{
	public UserIndexOutOfBoundException(String desc){
		super(desc);
	}
}
class UserNoSuchElementException extends RuntimeException{
	public UserNoSuchElementException(){
		super();
	}
}
class MyArrayList <E>{
	private E[] arr;
	private int index;
	private  final int INITIAL_CAPACITY=10;
	public MyArrayList(){
		this.arr=(E[])new Object[INITIAL_CAPACITY];
	}
	public MyArrayList(int newCAp){
		this.arr=(E[])new Object[newCAp];
	}
	public MyArrayList(MyArrayList coll){
		this.arr=(E[])new Object[coll.size()];
		for(int i=0;i<this.arr.length;i++){
			this.arr[i]=(E)coll.get(i);
		}
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
	
	public E[] creatNewArray(int oldLen){
		E[]newArray=(E[])new Object[newCapcity(oldLen)];
			for(int i=0;i<size();i++){
				newArray[i]=arr[i];
			}
			return newArray;
	}
	public void checkIndex(int indx){
		if(indx<0||indx>=size()){
			throw new UserIndexOutOfBoundException("Index "+indx+" out of bounds for length "+size());
		}
	}
	 
	public boolean add(E ele){
		if(size()==this.arr.length){
			this.arr=creatNewArray(this.arr.length);
		}
		this.arr[this.index]=ele;
		this.index++;	
		return true;
		
	}
	public void addLast(E ele){
		add(ele);
	}
	
	public void addFirst(E ele){
		if(size()==this.arr.length){
			
			this.arr=creatNewArray(this.arr.length);
		}
		for(int i=size()-1;i>=0;i--){
			arr[i+1]=this.arr[i];
		}
		arr[0]=ele;
		index++;
	}
	public void add(int index,E ele){
		checkIndex(index);
		if(size()==this.arr.length){
			this.arr=creatNewArray(this.arr.length);
		}
		for(int i=size()-1;i>=index;i--){
			arr[i+1]=arr[i];
		}
		arr[index]=ele;
		index++;
	}
	public int capacity(){
		return this.arr.length;
	}
	
	public boolean contains(E ele){
		if(size()==0) return false;
		for(int i=0;i<size();i++){
			if(this.arr[i].equals(ele)){
				return true;
			}
		}
		return false;
	}
	public E get(int indx){
		checkIndex(indx);
		return this.arr[indx];
	}
	public E getFirst(){
		return get(0);
	}
	public E getLast(){
		return get(size()-1);
	}
	public E removeFirst(){
		if(size()==0){
			throw new UserNoSuchElementException();
		}
		E temp=this.arr[0];
		for(int i=1;i<size();i++){
			arr[i-1]=arr[i];
		}
		index--;
		return temp;
	}
	public E removeLast(){
		if(size()==0)
			throw new UserNoSuchElementException();
		E temp=this.arr[size()-1];
		this.arr[size()-1]=null;
		index--;
		return temp;
	}
	
	public int indexOf(E ele){
		for(int i =0;i<size();i++){
			if(arr[i].equals(ele)){
				return i;
			}
		}
		return -1;
	}
	public int lastIndexOf(E ele){
		for(int i =size()-1;i>=0;i--){
			if(arr[i].equals(ele)){
				return i;
			}
		}
		return -1;
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
		
		//list1.add(10);
		//list1.add(20);
		/**list1.add(30);
		list1.add(40);
		list1.addFirst(140);
		list1.addLast(50);
		System.out.println(list1);
		System.out.println(list1.indexOf(20));
		System.out.println(list1.lastIndexOf(20));
		System.out.println(list1.isEmpty());
		//System.out.println(list1.get(-1));
		System.out.println(list1.contains(141));**/
	
		MyArrayList<Integer> list2=new MyArrayList<Integer>();
		list2.add(10);
		list2.add(20);
		list2.add(30);
		list2.add(40);
		list2.add(50);
		list2.addLast(60);
		list2.addFirst(70);
		System.out.println(list2);
		//System.out.println(list2.isEmpty());
		//System.out.println(list2.capacity());
		//System.out.println(list2.contains(40));
		//System.out.println(list2.get(4));
		//System.out.println(list2.removeLast());
		//System.out.println(list2.indexOf(150));
		//System.out.println(list2.lastIndexOf(50));
		//System.out.println(list2);
		//System.out.println(list2.get(-4));
		//list2.add(2,100);
		//System.out.println(list2.removeFirst());
		//System.out.println(list2.getFirst());
		//System.out.println(list2.getLast());
		
		System.out.println(list2);
	}
}