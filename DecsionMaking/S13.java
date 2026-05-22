import java.util.Scanner;
class S13{
	public static void main(String[]ar){
		Scanner sc=new Scanner(System.in);
		int bal=500;
		
		System.out.println("1.199\n2.299\n3.399");
		int plan=sc.nextInt();
		
		int cost=0;
		
		switch(plan){
			case 1:{
				cost=199;
				break;
			}
			case 2:{
				cost=299;
				break;
			}
			case 3:{
				cost=399;
				break;
			}
		}
		if(bal>=cost){
			System.out.println("Recharge Sucessfully");
		}else{
			System.out.println("Insufficient Balance");
		}
	}
}