import java.util.Scanner;
class Instagram{
	static boolean credSave;
	static String storeUserName;
	static String storePassword;
	static{
		storeUserName=System.getenv("userName");
		storePassword=System.getenv("myPin");
	}
	public static void login(){
		System.out.println("\n LOGIN MODULE\n ");
		System.out.print("UserName : ");
		String loginU=new Scanner(System.in).next();
		System.out.print("Password : ");
		String loginP=new Scanner(System.in).next();
		System.out.println(storeUserName);
		System.out.println(storePassword);
		if(storePassword.equals(loginP)&&storeUserName.equals(loginU)){
			System.out.println("Do you Want save login cred : ");
			String resp=new Scanner(System.in).next().toUpperCase();
			if(resp.equals("YES")){
				credSave=true;
				home();
			}
		}else{
			System.out.println("\n INVALID CREADITIONAL \n ");
			login();
		}
	}
	public static void home(){
		System.out.println("\n HOME \n ");
		System.out.println("1.RELLS \n 2.POST \n3.SEARCH \n4.LOGOUT");
		System.out.println("Enter your option ");
		int opt=new Scanner(System.in).nextInt();
		switch(opt){
			case 4: if(credSave){
				System.out.println("Do you Want remove login cred : ");
			String resp=new Scanner(System.in).next().toUpperCase();
			if(resp.equals("YES")){
				credSave=false;
				
			}
			}
			launchApp();
		}
	}
	public static void launchApp(){
		System.out.println("\n INsta Launched  \n ");
		if(credSave){
			home();
		}else{
			login();
		}
	}
	
	
}
class StaticBlock{
	public static void main(String[]args){
		Instagram.launchApp();
	}
}