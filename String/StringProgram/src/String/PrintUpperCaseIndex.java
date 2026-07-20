package String;



public class PrintUpperCaseIndex {
	private char[]value;
	public PrintUpperCaseIndex(String s) {
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
		PrintUpperCaseIndex cs=new PrintUpperCaseIndex("JaVa");
		char []ch=cs.toCharrArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='A'&&ch[i]<='Z') {
				System.out.println(i);
			}
		}
	}
}
