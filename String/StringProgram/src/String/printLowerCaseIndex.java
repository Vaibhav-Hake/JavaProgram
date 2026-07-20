package String;



public class printLowerCaseIndex {
	private char[]value;
	public printLowerCaseIndex(String s) {
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
		printLowerCaseIndex cs=new printLowerCaseIndex("JaVa");
		char []ch=cs.toCharrArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='a'&&ch[i]<='z') {
				System.out.println(i);
			}
		}
	}
}
