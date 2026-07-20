package String;



public class CntAlphabet {
	private char[]value;
	public  CntAlphabet (String s) {
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
		 CntAlphabet cs=new  CntAlphabet("Ja654Va");
		char []ch=cs.toCharrArray();
		int ct=0;
		for(int i=0;i<ch.length;i++) {
			if((ch[i]>='a'&&ch[i]<='z')||ch[i]>='A'&&ch[i]<='Z') {
				ct++;
			}
		}
		System.out.println(ct);
	}
}
