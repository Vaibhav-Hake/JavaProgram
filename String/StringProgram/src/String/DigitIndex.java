package String;



public class DigitIndex{
	private char[]value;
	public  DigitIndex(String s) {
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
		 DigitIndex cs=new  DigitIndex("JaVa45454");
		char []ch=cs.toCharrArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='0'&&ch[i]<='9') {
				System.out.println(i);
			}
		}
	}
}
