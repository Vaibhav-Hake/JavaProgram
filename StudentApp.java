import java.util.Scanner;
import java.util.ArrayList;
class Student{
	String name;
	String email;
	String branch;
	int yop;
	double cgpa;
	long contact;
	
	Student(String name,String email,String branch,int yop,double cgpa,long contact){
		this.name=name;
		this.email=email;
		this.branch=branch;
		this.yop=yop;
		this.cgpa=cgpa;
		this.contact=contact;
	}
	public  void displayStudent(){
		System.out.println("\n STUDENT INFO \n");
		System.out.println("name : "+name);
		System.out.println("email : "+email);
		System.out.println("branch : "+branch);
		System.out.println("yop : "+yop);
		System.out.println("cgpa : "+cgpa);
		System.out.println("contact : "+contact);
	}
}
class StudentApp{
	static ArrayList<Student> studentList=new ArrayList<>();
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		launchApp(sc);
	}
	public static void launchApp(Scanner sc){
		while(true){
			System.out.println("\n STUDENT MAN APP \n");
			System.out.println("1. ADD STUDENT ");
			System.out.println("2. SEARCH STUDENT ");
			System.out.println("3. REMOVE STUDENT ");
			System.out.println("4. VIEW ALL STUDENT ");
			System.out.println("Enter an option ");
			int opt=sc.nextInt();
			switch(opt){
				case 1 ->addStudent();
				case 2 ->{
					System.out.println("Enter a Contact : ");
					long searchCont=new Scanner(System.in).nextLong();
					boolean res=searchStudent(searchCont,studentList);
					if(res){
						System.out.println("\n STUDENT FOUND");
					}else{
						System.out.println("\n STUDENT NOT FOUND \n");
					}
				}
				case 3 ->{
					System.out.println("Enter a Contact : ");
					long searchCont=new Scanner(System.in).nextLong();
					int  indx=removeStudent(searchCont,studentList);
					if(indx==-1){
						System.out.println("\n STUDENT FOUND");
					}else{
				       studentList.remove(indx);
					}
				}
				case 4 -> viewAllStudent(studentList);
			}
		}
	}
	public static int removeStudent(long searchCont,ArrayList<Student> studentList){
		if(studentList.size()==0) return -1;
		int indx=0;
		for(Student ele:studentList){
			if(searchCont==ele.contact){
				return indx;
			}
			indx++;
		}
		return -1;
	}
	public static boolean searchStudent(long searchCont,ArrayList<Student> studentList){
	   if(studentList.size()==0) return false;	
	   for(Student ele:studentList){
			if(searchCont==ele.contact){
				return true;
			}
			
		}
		return false;
	}
	public static void viewAllStudent(ArrayList<Student>studentList){
		if(studentList.size()==0){
			System.out.println("\n NO DATA FOUND ");
			return;
		}
		System.out.println("\n VIEW ALL STUDENT ");
		 for(Student ele:studentList){
			ele.displayStudent();
			
		}
	}
	public static void addStudent(){
		System.out.println("\n ADD STUDENT MODULE \n ");
		System.out.println("Name : ");
		String name=new Scanner(System.in).nextLine();
		System.out.println("email : ");
		String email=new Scanner(System.in).next();
		System.out.println("Branch : ");
		String branch=new Scanner(System.in).nextLine();
		System.out.println("YOP : ");
		int yop=new Scanner(System.in).nextInt();
		System.out.println("CGPA : ");
		double cgpa=new Scanner(System.in).nextDouble();
		System.out.println("Contact : ");
		long contact=new Scanner(System.in).nextLong();
		
		Student obj=new Student(name,email,branch,yop,cgpa,contact);
		studentList.add(obj);
	}
}