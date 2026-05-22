import java.util.Scanner;
class S3{
	public static void main(String[]ar){
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Economy \n2.Business \n3.First");
		int cfs=sc.nextInt();
		
	System.out.print("Enter distance: ");
       int dist = sc.nextInt();
	   
	   System.out.print("Season(1-Peak,2-Off):");
	   int se=sc.nextInt();
	   
	   double r=0;
	   switch(cfs){
		   case 1:r=5;break;
		   case 2:r=10;break;
		   case 3:r=20;break;
		   default:System.out.println("Invalid class");break;
		   
	   }
	   double fare=dist*r;
	   if(se==1){
		   fare*=1.5;
	   }
	   System.out.println(fare);

	}
}