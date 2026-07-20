package String;



public class Digit{
	private char[]value;
	public  Digit(String s) {
		value=new char[s.length()];
		char[]ch=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			value[i]=ch[i];
		}
		
	}
	public char[] toCharrArray() {
		return value;
	}
	public static void main(String[] args) {
		 Digit cs=new  Digit("JaVa45454");
		char []ch=cs.toCharrArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='0'&&ch[i]<='9') {
				System.out.print(ch[i]+" : ");
				System.out.println((int)ch[i]);
			}
		}
	}
}
