class Calender{
   public static void main(String[]args){
	   String title="Calender";
	   
	   int day=365;
	   int noHour=day*24;
	   int noMiniute=noHour*60;
	   int noSec=noMiniute*60;
	   int noHourMonth=30*60;
	   int noMinMonth=noHourMonth*60;
	   int noSecMonth=noMinMonth*60;
	   
	   System.out.println(title);
	   System.out.println("No of Day In Year :"+day);

	   System.out.println("No of Hour in Year :"+noHour);

	   System.out.println("No of Miniute in Year :"+noMiniute);

	   System.out.println("No of Second in Year :"+noSec);

	   System.out.println("No of Hour in Month :"+noHourMonth);

	   System.out.println("No of Miniute in Month :"+noMinMonth);
	   System.out.println("No of Second in Month :"+noSecMonth);

	   
   }
}