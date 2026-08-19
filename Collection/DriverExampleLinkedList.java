import java.util.Iterator;
import java.util.NoSuchElementException;

// Custom Exception
class UserNoSuchElementException extends RuntimeException {
    public UserNoSuchElementException() {
        super();
    }
}

// Custom List Interface
interface UserList<E> {
    void add(E ele);

    boolean remove(E ele);

    int size();

    E getLast();
}


// Custom LinkedList
class UserLinkedList<E> implements UserList<E>, Cloneable {

    private int index;

    protected Node<E> head;
    protected Node<E> tail;


    // Node class
    public class Node<E> {

        E ele;
        Node<E> next;

        Node(E ele) {
            this.ele = ele;
        }
    }


    // Add element at last
    @Override
    public void add(E ele) {

        Node<E> newNode = new Node<E>(ele);

        if (head == null) {
            head = newNode;
            tail = head;
        } else {
            tail.next = newNode;
            tail = newNode;
        }

        this.index++;
    }


    // Offer - same as add
    public boolean offer(E ele) {
        add(ele);
        return true;
    }


    // Return size
    @Override
    public int size() {
        return this.index;
    }


    // Check whether list is empty
    public boolean isEmpty() {
        return size() == 0;
    }


    // Convert list to String
    @Override
    public String toString() {

        if (isEmpty())
            return "[]";

        String str = "[";

        Node<E> currNode = head;

        for (int i = 0; i < size() - 1; i++) {

            str += currNode.ele + ", ";

            currNode = currNode.next;
        }

        return str += currNode.ele + "]";
    }


    // Get first element
    public E getFirst() {

        if (isEmpty())
            throw new UserNoSuchElementException();

        return head.ele;
    }


    // Get last element
    @Override
    public E getLast() {

        if (isEmpty())
            throw new UserNoSuchElementException();

        return tail.ele;
    }


    // Peek first
    public E peekFirst() {
        return getFirst();
    }


    // Peek last
    public E peekLast() {
        return getLast();
    }


    // Add element at first
    public void addFirst(E ele) {

        Node<E> newNode = new Node<E>(ele);

        if (head == null) {

            head = newNode;
            tail = head;

        } else {

            newNode.next = head;
            head = newNode;
        }

        this.index++;
    }


    // Offer first
    public boolean offerFirst(E ele) {

        addFirst(ele);

        return true;
    }


    // Add element at last
    public void addLast(E ele) {

        Node<E> newNode = new Node<E>(ele);

        if (head == null) {

            head = newNode;
            tail = head;

        } else {

            tail.next = newNode;
            tail = newNode;
        }

        this.index++;
    }


    // Offer last
    public boolean offerLast(E ele) {

        addLast(ele);

        return true;
    }


    // Remove first element
    public E removeFirst() {

        if (isEmpty())
            throw new UserNoSuchElementException();

        Node<E> tempNode = head;

        head = head.next;

        tempNode.next = null;

        this.index--;

        // If list becomes empty
        if (head == null) {
            tail = null;
        }

        return tempNode.ele;
    }


    // Poll first
    public E pollFirst() {
        return removeFirst();
    }


    // Remove last
    public E removeLast() {

        if (isEmpty())
            throw new UserNoSuchElementException();

        // Only one element
        if (size() == 1) {

            E temp = head.ele;

            head = null;
            tail = null;

            index--;

            return temp;
        }

        Node<E> currNode = head;

        for (int i = 0; i < size() - 2; i++) {
            currNode = currNode.next;
        }

        E temp = getLast();

        currNode.next = null;

        this.index--;

        tail = currNode;

        return temp;
    }


    // Poll last
    public E pollLast() {
        return removeLast();
    }


    // Remove - first occurrence
    @Override
    public boolean remove(E ele) {

        if (isEmpty())
            return false;

        int indx = indexOf(ele);

        if (indx != -1) {
            remove(indx);
            return true;
        }

        return false;
    }


    // Remove element using index
    public E remove(int indx) {

        checkIndex(indx);

        if (indx == 0)
            return removeFirst();

        if (indx == size() - 1)
            return removeLast();

        Node<E> currNode1 = head;

        for (int i = 0; i < indx - 1; i++) {
            currNode1 = currNode1.next;
        }

        Node<E> currNode2 = currNode1.next;

        currNode1.next = currNode2.next;

        currNode2.next = null;

        this.index--;

        return currNode2.ele;
    }


    // Check whether element exists
    public boolean contains(E ele) {

        if (isEmpty())
            return false;

        Node<E> currNode = head;

        while (currNode != null) {

            if (currNode.ele.equals(ele))
                return true;

            currNode = currNode.next;
        }

        return false;
    }


    // Remove all elements
    public void clear() {

        if (isEmpty())
            return;

        int len = size();

        for (int i = 0; i < len; i++) {
            removeFirst();
        }
    }


    // Get element using index
    public E get(int indx) {

        checkIndex(indx);

        Node<E> curr = head;

        for (int i = 0; i < indx; i++) {
            curr = curr.next;
        }

        return curr.ele;
    }


    // Check index
    public void checkIndex(int indx) {

        if (indx < 0 || indx >= size()) {

            throw new IndexOutOfBoundsException(
                    "index " + indx +
                    " out of bounds for size " + size()
            );
        }
    }


    // Set element
    public E set(int indx, E ele) {

        checkIndex(indx);

        Node<E> curr = head;

        for (int i = 0; i < indx; i++) {
            curr = curr.next;
        }

        E temp = curr.ele;

        curr.ele = ele;

        return temp;
    }


    // Add element at particular index
    public void add(int indx, E ele) {

        if (indx < 0 || indx > size()) {

            throw new IndexOutOfBoundsException(
                    "index " + indx +
                    " out of bounds for size " + size()
            );
        }

        if (indx == 0) {
            addFirst(ele);
            return;
        }

        if (indx == size()) {
            addLast(ele);
            return;
        }

        Node<E> newNode = new Node<E>(ele);

        Node<E> currNode = head;

        for (int i = 0; i < indx - 1; i++) {
            currNode = currNode.next;
        }

        Node<E> currNode2 = currNode.next;

        currNode.next = newNode;

        newNode.next = currNode2;

        this.index++;
    }


    // Return node at index
    public UserLinkedList<E>.Node<E> node(int indx) {

        checkIndex(indx);

        Node<E> curr = head;

        for (int i = 0; i < indx; i++) {
            curr = curr.next;
        }

        return curr;
    }


    // Find first occurrence
    public int indexOf(E ele) {

        if (isEmpty())
            return -1;

        Node<E> curr = head;

        int i = 0;

        while (curr != null) {

            if (curr.ele.equals(ele))
                return i;

            curr = curr.next;
            i++;
        }

        return -1;
    }


    // Find last occurrence
    public int lastIndexOf(E ele) {

        if (isEmpty())
            return -1;

        Node<E> curr = head;

        int i = 0;
        int op = -1;

        while (curr != null) {

            if (curr.ele.equals(ele))
                op = i;

            curr = curr.next;
            i++;
        }

        return op;
    }


    // Peek - last element
    public E peek() {
        return peekLast();
    }


    // Poll - last element
    public E poll() {
        return pollLast();
    }


    // Remove first occurrence
    public boolean removeFirstOccurrence(E ele) {

        if (isEmpty())
            return false;

        int indx = indexOf(ele);

        if (indx != -1) {

            remove(indx);

            return true;
        }

        return false;
    }


    // Remove last occurrence
    public boolean removeLastOccurrence(E ele) {

        if (isEmpty())
            return false;

        int indx = lastIndexOf(ele);

        if (indx != -1) {

            remove(indx);

            return true;
        }

        return false;
    }


    // Clone
    @Override
    public Object clone() throws CloneNotSupportedException {

        return super.clone();
    }
}


// Driver class
public class DriverExampleLinkedList {

    public static void main(String[] args) {

        UserLinkedList<Integer> list =
                new UserLinkedList<Integer>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("List : " + list);

        System.out.println("Size : " + list.size());

        System.out.println("First : " + list.getFirst());

        System.out.println("Last : " + list.getLast());

        System.out.println("Peek : " + list.peek());

        System.out.println("Contains 20 : "
                + list.contains(20));

        System.out.println("Index of 30 : "
                + list.indexOf(30));

        list.addFirst(5);

        System.out.println("After addFirst : " + list);

        list.addLast(50);

        System.out.println("After addLast : " + list);

        list.add(3, 25);

        System.out.println("After add(3,25) : " + list);

        list.removeFirst();

        System.out.println("After removeFirst : " + list);

        list.removeLast();

        System.out.println("After removeLast : " + list);

        list.remove(2);

        System.out.println("After remove(2) : " + list);

        list.set(1, 100);

        System.out.println("After set(1,100) : " + list);

        System.out.println("Get index 1 : "
                + list.get(1));

        list.clear();

        System.out.println("After clear : " + list);
    }
}