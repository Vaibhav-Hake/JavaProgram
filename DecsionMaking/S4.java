import java.util.Scanner;
class S4{
	public static void main(String[]ar){
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Living Room \n2.Bedroom");
		int room=sc.nextInt();
		
		System.out.println("1.Light \n2.Fan");
		int d=sc.nextInt();
		
			System.out.println("1.ON \n2.Off");
		int a=sc.nextInt();
		
		switch(room){
			case 1:{
				switch(d){
					case 1:{
					 System.out.println(a == 1 ? "Living Light ON" : "Living Light OFF");
                       break;

					}
					case 2:{
					 System.out.println(a == 1 ? "Living fan ON" : "Living fan OFF");
                       break;
					}
				}
			}
			case 2:{
				switch(d){
					case 1:{
					 System.out.println(a == 1 ? "Bedroom Light ON" : "Bedroom Light OFF");
                       break;

					}
					case 2:{
					 System.out.println(a == 1 ? "Bedroom fan ON" : "Bedroom fan OFF");
                       break;
					}
					 
				}
			}
		}
	}
}