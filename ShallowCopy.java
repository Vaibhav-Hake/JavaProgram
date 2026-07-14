class Batch{
	String subjectName;
	String timings;
	String trainerName;
	String code;
	int cntStudent;
	Batch(String subjectName,String timings,String trainerName,int cntStudent,String code){
		super();
		this.subjectName=subjectName;
		this.timings=timings;
		this.trainerName=trainerName;
		this.cntStudent=cntStudent;
		this.code=code;
		
	}
	void displayBatch(){
		System.out.println("Batch Info ");
		System.out.println("SubjectName : "+subjectName);
		System.out.println("Timings : "+timings);
		System.out.println("trainerName : "+trainerName);
		System.out.println("code : "+code);
		System.out.println("cntStudent : "+cntStudent);
	}
}
class Student{
	String name;
	String email;
	long contact;
	Batch batch;
	Student(String name,String email,long contact,Batch batch){
		this.name=name;
		this.email=email;
		this.contact=contact;
		this.batch=batch;
	}
	//Copy Constructor 
	
	Student(Student old){
		this.name=old.name;
		this.email=old.email;
		this.contact=old.contact;
		this.batch=old.batch;
	}
	void displayStudent(){
		System.out.println("Student Info ");
		System.out.println("name : "+name);
		System.out.println("email : "+email);
		System.out.println("Contact : "+contact);
		batch.displayBatch();
	}
}
class ShallowCopy{
	public static void main(String[]args){
		Batch batch=new Batch("Core Java","8.30","Shrikant",50,"A40");
		Student old=new Student("Vipul","vpul@gmail.com",646466546,batch);
        old.displayStudent();
		Student copy=new Student(old);
		copy.displayStudent();
		System.out.println("--------Changes name in copy obj--------");
		copy.name="Afroz";
		copy.displayStudent();
		System.out.println(---------old--------);
	}
}