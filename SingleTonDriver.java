class SingleTon{
	private static SingleTon obj;
	private SingleTon(){
		
	}
	public static SingleTon getInstance(){
		if(obj==null){
			obj=new SingleTon();
		}
		return obj;
	}
}
class SingleTonDriver{
	public static void main(String[]args){
		SingleTon obj=SingleTon.getInstance();
		System.out.println(obj);
		SingleTon obj1=SingleTon.getInstance();
		System.out.println(obj1);
	}
}