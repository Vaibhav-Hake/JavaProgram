import java.util.ArrayList;
class Account{
	static long series=212345678;
	String name;
	String address;
	long contact;
    final static String	ifscCode="SBI12302";
	long accNum;
	{
		this.accNum=series++;
	}
	Account(String name,String address,long contact){
		this.name=name;
		this.address=address;
		this.contact=contact;
	}
	void displayAcc(){
		System.out.println("\n ACCOUNT INFO");
		System.out.println("\n SBI");
		System.out.println("AccountNUm : "+accNum);
		System.out.println("ifscCode : "+ifscCode);
		System.out.println("name : "+name);
		System.out.println("Contact : "+contact);
		System.out.println("Adress : "+address);
		System.out.println("AccountNUm : "+accNum);
		
		
	}
}
class Bank{
	ArrayList<Account>list=new ArrayList<Account>();
	
	public void addNewAccount(Account newAccount){
		list.add(newAccount);
	}
	public void displayAllAcc(){
		for(Account ele:list){
			ele.displayAcc();
		}
	}
}
class Driver{
	public static void main(String[]args){
		Bank bank=new Bank();
		bank.addNewAccount(new Account("ramesh","pune",456669746l));
		bank.addNewAccount(new Account("Suresh","Kolkatta",456669746l));
		bank.addNewAccount(new Account("ram","Ayodha",456669746l));
		bank.addNewAccount(new Account("mesh","pune",456669746l));
		bank.addNewAccount(new Account("kalki","Delhi",8566665746l));
		bank.addNewAccount(new Account("ravan","Lanka",5656669746l));
		bank.addNewAccount(new Account("laxman","Pune",956669746l));
		bank.addNewAccount(new Account("Sita","Ayodha",956669746l));
		bank.displayAllAcc();
	}
}