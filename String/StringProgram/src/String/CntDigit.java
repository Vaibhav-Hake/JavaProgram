package String;



public class CntDigit{
	private char[]value;
	public  CntDigit(String s) {
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
		 CntDigit cs=new  CntDigit("JaVa45454");
		char []ch=cs.toCharrArray();
		int ct=0;
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='0'&&ch[i]<='9') {
				ct++;
			}
		}
		System.out.println(ct);
	}
}
