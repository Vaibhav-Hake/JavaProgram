class  UserNoSuchElementException extends RuntimeException{
	public UserNoSuchElementException(){
		super();
	}
}

class  UserIndexOutOfBoundException extends RuntimeException{
	public UserIndexOutOfBoundException(String desc){
		super(desc);
	}
}
class MyVector<E>{
	private E[] arr;
	private int index;
	public final int INITIAL_CAPACITY = 10;
	boolean flag;
	public int increamentCap;
	
	MyVector()
	{
	arr = (E[])new Object[INITIAL_CAPACITY];
	}
	
	MyVector(int capacity)
	{
		arr = (E[])(new Object[capacity]);
	}
	
	MyVector(MyVector colln){
		arr = (E[])new Object[colln.size()];
	
		for(int i = 0; i < size(); i++)
		{
			arr[i] = (E)colln.elementAt(i);
		}
	}
	
	MyVector(int capacity, int increamentCap)
	{
        arr = (E[])(new Object[capacity]);
		this.increamentCap = increamentCap;

		flag = true;
		
	}
	
	public int size()
	{
		return this.index;
	}
	
	public boolean isEmpty(){
		return size() == 0;
	}
	
    public E elementAt(int index){
		if(index<0||index>=size())
			throw new UserIndexOutOfBoundException("hihkdjvh");
		return this.arr[index];
	}
	
	public E firstElement(){
		if(isEmpty())
			throw new UserNoSuchElementException();
		
		return this.arr[0];
	}
	public E lastElement(){
		if(isEmpty())
			throw new UserNoSuchElementException();
		
		return this.arr[size()-1];
	}
	public int newCap(int oldCap){
		if(flag){
			return oldCap+increamentCap;
		}else{
			return oldCap*2;
		}
	}
	
	public void addElement(E ele){
		if(size()==this.arr.length){
			E[]newArr=(E[])new Object[newCap(size())];
			for(int i=0;i<size();i++){
				newArr[i]=arr[i];
			}
			this.arr=newArr;
		}
		arr[this.index]=ele;
		this.index++;
	}
	
	public E setElement(int index,E ele){
		if(index<0||index>=size())
			throw new UserIndexOutOfBoundException("jdhbfhjadv");
		
		E temp=this.arr[index];
		this.arr[index]=ele;
		return temp;
	}
	
	@Override
	public String toString(){
		if(isEmpty())return "[]";
		StringBuffer sb=new StringBuffer("[");
		for(int i=0;i<size();i++){
			sb.append(arr[i]+" ,");
			
		}
		sb.deleteCharAt(sb.length()-1);
		sb.append("]");
		return sb.toString();
	}
	
	
}


class VectorImplementation{
	public static void main(String[]args){
		MyVector<Integer>list=new MyVector<Integer>();
		System.out.println(list);
		list.addElement(10);
		list.addElement(20);
		list.addElement(30);
		//System.out.println(list.firstElement());
		//System.out.println(list.lastElement());
		System.out.println(list);
		System.out.println(list.size());
		
		System.out.println(list.setElement(1,1));
		System.out.println(list);
		System.out.println(list.size());
	}
}