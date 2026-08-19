import java.util.LinkedList;
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

interface UserLinkedList1<E>{
	void add(E ele);
	boolean remove(E ele);
	int size();
	E getLast();
}
class UserLinkedList<E>implements UserLinkedList1<E>{
	private int index;
	protected Node<E> head;
	protected Node<E> tail;
	public class Node<E>{
		E ele;
		Node<E>next;
		Node(E ele){
			this.ele=ele;
		}
	}
	public int size(){
		return this.index;
	}
	
	public boolean isEmpty(){
		return size()==0;
	}
	public void add(E ele){
		Node<E> newNode=new Node<E>(ele);
		if(head==null){
			head=newNode;
			tail=head;
		}else{
			tail.next=newNode;
			tail=newNode;
		}
		this.index++;
	}
	public boolean offer(E ele){
		add(ele);
		return true;
	}
	public void addFirst(E ele){
		Node<E> newNode=new Node<E>(ele);
		if(isEmpty()){
			head=newNode;
			tail=head;
		}
		else{
			newNode.next=head;
			head=newNode;
			
		}
		this.index++;
	}
	public boolean offerFirst(E e){
		addFirst(e);
		return true;
	}
	public void addLast(E ele){
		add(ele);
	}
	public boolean offerLast(E e){
		addLast(e);
		return true;
	}
	
	public E getFirst(){
		return this.head.ele;
	}
	public E peekFirst(){
		return getFirst();
	}
	public E getLast(){
		return this.tail.ele;
	}
	public E peekLast(){
		return getLast();
	}
	
	public E removeFirst(){
		if(isEmpty()){
			throw new UserNoSuchElementException();
		}
		
		Node<E> temp=head;
		head=head.next;
		temp.next=null;
		this.index--;
		return temp.ele;
	}
	
	public E pollFirst(){
		return removeFirst();
	}
	
	public E removeLast(){
		if(isEmpty()){
			throw new UserNoSuchElementException();
		}
		Node<E>curr=head;
		
		for(int i=0;i<size()-1;i++){
			curr=curr.next;
		}
		E temp=getLast();
		curr.next=null;
		tail=curr;
		this.index--;
		return temp;
	}
	
	public E remove(){
		return removeLast();
	}
	public E pollLast(){
		return removeLast();
	}
	
	public boolean contains(E ele){
		if(isEmpty())
			return false;
		
		Node<E> curr=head;
		while(curr!=null){
			if(curr.ele.equals(ele))return true;
			curr=curr.next;
		}
		return false;
	}
	
	public void checkIndex(int index){
		if(index<0||index>=size())
			throw new UserIndexOutOfBoundException("index not correct");
	}
	
	public E remove(int index){
		checkIndex(index);;
		if(index==0){
			return removeFirst();
		}
		if(index==size()-1){
			return removeLast();
		}
		
		Node<E> curr1=head;
		Node<E> curr2=null;
		for(int i=0;i<index;i++){
			curr2=curr1;
			curr1=curr1.next;
		}
		
		curr2.next=curr1.next;
		curr1.next=null;
		this.index--;
		return curr1.ele;
		
		
	}
	
	public boolean remove(E ele){
		
		if(ele.equals(getFirst())){
			 removeFirst();
			return true;
		}
		if(ele.equals(getLast())){
			 removeLast();
			return true;
		}
		
		Node<E> curr1=head;
		Node<E> curr2=null;
		while(curr1.next!=null){
			if(curr1.ele.equals(ele))break;
			curr2=curr1;
			curr1=curr1.next;
		}
		if(curr1.next==null) return false;
		curr2.next=curr1.next;
		curr1.next=null;
		this.index--;
		return true;
		
		
	}
	
	public void clear(){
		if(isEmpty()){
			return;
		}
		int len=size();
		for(int i=0;i<len;i++){
			removeFirst();
		}
	}
	
	public E get(int index){
		checkIndex(index);
		Node<E>curr=head;
		for(int i=0;i<index;i++){
			curr=curr.next;
		}
		return curr.ele;
	}
	public E set(int index,E newEle){
		checkIndex(index);
		Node<E>curr=head;
		for(int i=0;i<index;i++){
			curr=curr.next;
		}
		E temp=curr.ele;
		curr.ele=newEle;
		return temp;
	}
	
	public void add(int index,E ele){
		if(index!=size())checkIndex(index);
		if(index==0){
			addFirst(ele);
			return;
		}
		if(index==size()-1){
			addLast(ele);
			return;
		}
		Node<E>newNode=new Node<E>(ele);
		Node<E> curr1=head;
		for(int i=0;i<index;i++){
			curr1=curr1.next;
		}
		Node<E>curr2=curr1.next;
		curr1.next=newNode;
		newNode.next=curr2;
		this.index++;
		
	}
	
	public int indexOf(E ele){
		if(isEmpty())
			throw new UserNoSuchElementException();
		
		Node<E> curr=head;
		int i=0;
		while(curr!=null){
			if(curr.ele.equals(ele))return i;
			curr=curr.next;
			i++;
		}
		return -1;
	}
	
	public int lastIndexOf(E ele){
		if(isEmpty())
			throw new UserNoSuchElementException();
		
		Node<E> curr=head;
		int i=0;
		int op=-1;
		while(curr!=null){
			if(curr.ele.equals(ele)) op=i;;
			curr=curr.next;
			i++;
		}
		return op;
	}
	public E peek(){
		return peekLast();
	}
	public boolean removeFirstOcurrance(E ele){
		if(isEmpty())return false;
		int indx=indexOf(ele);
		if(indx!=-1){
			remove(indx);
			return true;
		}
		return false;
	}
	public boolean removeLastOcurrance(E ele){
		if(isEmpty())return false;
		int indx=lastIndexOf(ele);
		if(indx!=-1){
			remove(indx);
			return true;
		}
		return false;
	}
	public  UserLinkedList<E>.Node<E> node (int indx){
		checkIndex(indx);
		Node<E>curr=head;
		for(int i=0;i<indx;i++){
			curr=curr.next;
		}
		return curr;
	}
	
	public Object[] toArray(){
		if(isEmpty())return new Object[0];
		Object[]newArr=new Object[this.size()];
        for(int i=0;i<size();i++){
			newArr[i]=this.get(i);
		}
		return newArr;
	}
	
	public <T> T[] toArray(T[] newArray){
	if(isEmpty())return newArray;
        for(int i=0;i<this.size();i++){
			newArray[i]=(T)this.get(i);
		}
		return newArray;
	}
	@Override
	public Object clone()throws CloneNotSupportedException{
		return super.clone();
	}
	@Override
	public String toString(){
		if(isEmpty()) return "[]";
		String str="[";
		Node<E>curr=head;
		for(int i=0;i<size()-1;i++){
			str+=curr.ele+",";
			curr=curr.next;
		}
		return str+=curr.ele+"]";
	}
}
class LinkListExample{
	public static void main(String[]args){
		LinkedList list=new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println(list);
		
		UserLinkedList1 list2=new UserLinkedList<>();
		
		list2.add(10);
		list2.add(20);
		list2.add(30);
		
		list2.add(40);
		list2.add(30);
		
		System.out.println(list2);
		//System.out.println(list2.removeFirst());
		//System.out.println(list2.removeLast());
		//System.out.println(list2.contains(10));
		//System.out.println(list2.contains(40));
		//System.out.println(list2.contains(50));
		//System.out.println(list2);
		//list2.clear();
		//System.out.println(list2.remove(2));
		//System.out.println(list2.get(1));
		//System.out.println(list2.set(1,50));
		//System.out.println(list2);
		//list2.add(3,500);
		//System.out.println(list2.removeFirstOcurrance(30));
		//System.out.println(list2.removeLastOcurrance(30));
		System.out.println(list2.remove(30));
		System.out.println(list2);
		//System.out.println(list2.lastIndexOf(30));
		//System.out.println(list2.lastIndexOf(3000));
		//System.out.println(list2.lastIndexOf(40));
		//System.out.println(list2.lastIndexOf(350));
		//System.out.println(list2.indexOf(30));
		//System.out.println(list2.indexOf(300));
		//System.out.println(list2.indexOf(40));
		//System.out.println(list2);
		//System.out.println(list2.size());
		//list2.addFirst(140);
		//list2.addLast(140);
		//System.out.println(list2.getFirst());
		//System.out.println(list2.getLast());
		//System.out.println(list2.peekFirst());
		//System.out.println(list2.peekLast());
		//System.out.println(list2.size());
		//System.out.println(list2.isEmpty());
		
	}
}