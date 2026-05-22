import java.util.Scanner;
class S16{
	public static void main(String[]ar){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("1.Copy \n 2.Delete \n3.Rename");
		int op=sc.nextInt();
		
		switch(op){
			case 1:{
				System.out.println("File Copied");
				break;
			}
			case 2:{
				System.out.println("File Deleted");
				break;
			}
			case 3:{
				System.out.println("File REnamed");
				break;
			}
		}
	}
}