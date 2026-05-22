import java.util.Scanner;
class HandCricket{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("******** WELCOME**********");
		System.out.println("       HAND-CRICKET \n");
		System.out.println("Enter number of over : ");
		int over=sc.nextInt();
		if(over<6||over>20){
			System.out.println("\n INVALID OVER ");
			return;
		}
		System.out.println("Do u Want to Bat/Bowl");
		String resp=sc.next().toUpperCase();
		int totalRuns=0;
		int player=1;
		String runs="Runs  :   ";
		if(resp.equals("BAT")){
			overLoop:
			for(int i=1;i<=over;i++){
				System.out.println("\n"+i+" over Start");
				System.out.println("previous Runs : "+totalRuns);
				
				ballsOver:
				for(int j=1;j<=6;j++){
					System.out.println("\n"+i+" over "+j+" balls ");
					System.out.println("Balls  :   1  2  3  4  5  6");
					System.out.println(runs);
					System.out.println("\n Enter a run :  ");
					int run=sc.nextInt();
					if(run>=0&&run<=6){
						int bowl=0;
						for(; ;){
							bowl=(int)(Math.random()*10);
							if(bowl>=0&&bowl<=6) break;
						}
						if(run!=bowl){
							System.out.println("\n Bowl : "+bowl);
							totalRuns+=run;
							runs+=run+"  ";
						}else{
							runs+="W  ";
							System.out.println("\n Player "+player+" out \n");
							if(player==11){
								System.out.println("\n ALL OUT \n ");
								break overLoop;
							}
						}
						}
						else{
							System.out.println("\n INVALID RUNS \n");
							j--;
						}
					}
					System.out.println("\n"+i+"over got finished"+"\n");
					runs="Runs  :  ";
				}
			}else{
				//bowl
			}
		}
	}
