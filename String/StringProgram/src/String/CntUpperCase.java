package String;



public class CntUpperCase {
	private char[]value;
	public CntUpperCase(String s) {
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
		CntUpperCase cs=new CntUpperCase("JaVa");
		char []ch=cs.toCharrArray();
		int ct=0;
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='A'&&ch[i]<='Z') {
				ct++;
			}
		}
		System.out.println(ct);
	}
}
