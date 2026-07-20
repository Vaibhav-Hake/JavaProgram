package String;



public class CntLowerCase {
	private char[]value;
	public CntLowerCase(String s) {
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
		CntLowerCase cs=new CntLowerCase("JaVa");
		char []ch=cs.toCharrArray();
		int ct=0;
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='a'&&ch[i]<='z') {
				ct++;
			}
		}
		System.out.println(ct);
	}
}
