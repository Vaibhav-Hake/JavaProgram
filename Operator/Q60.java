import java.util.Scanner;

class Q60{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		byte iceCube = 100;  //volume  of ice considered as 100% 
		
		System.out.print("Enter the loss of volume: ");
		byte loss= sc.nextByte();
		
		byte remainingVolume = (byte)(iceCube - loss);
		System.out.println("Remaining volume of a ice cube is: "+remainingVolume);
	}
}