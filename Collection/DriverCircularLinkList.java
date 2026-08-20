class MyCircularLinkList<E>{
	private Node<E> head;
	private Node<E> tail;
	private int index;
	public class Node<E>{
		E ele;
		Node<E>next;
		public Node(E ele){
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
		Node<E>newNode=new Node<>(ele);
		if(head==null){
			head=newNode;
			tail=head;
		}else{
			tail.next=newNode;
			tail=newNode;
			tail.next=head;
		}
		this.index++;
	}
	
	public void addLast(E ele){
		add(ele);
	}
	
	public void addFirst(E ele){
		Node<E>newNode=new Node<>(ele);
		if(head==null){
			head=newNode;
			tail=head;
		}else{
			newNode.next=head;
			head=newNode;
			tail=head;
		}
		this.index++;
	}
	
	public void add(int index,E ele){
		if(index<0||index>size())
			throw new IndexOutOfBoundsException();
		
		if(index==0){
			addFirst(ele);
			return;
		}
		if(index==size()-1){
			addLast(ele);
			return;
		}
		Node<E>newNode=new Node<>(ele);
		Node<E>curr=head;
		for(int i=0;i<index;i++){
			curr=curr.next;
		}
		newNode.next=curr.next;
		curr.next=newNode;
		this.index++;
	}
	@Override
	public String toString(){
		if(head==null) return "[]";
		StringBuffer op=new StringBuffer("[");
		Node<E>curr=head;
		for(int i=0;i<size()-1;i++){
			op.append(curr.ele+" , ");
			curr=curr.next;
		}
		op.append(curr.ele+" ]");
		return op.toString();
		
	}
	
}

class DriverCircularLinkList{
	public static void main(String[]args){
		MyCircularLinkList<Integer> list=new MyCircularLinkList<Integer>();
		System.out.println(list);
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		System.out.println(list);
		System.out.println(list.size());
		//list.addLast(100);
		//list.addFirst(1000);
		list.add(3,1000);
		//list.addFirst(1000);
		System.out.println(list);
		System.out.println(list.size());
	}
}