package String;



public class SpecialCharIndex {
	private char[]value;
	public   SpecialCharIndex(String s) {
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
		 SpecialCharIndex s=new   SpecialCharIndex("Ja65%4Va");
		char []ch=s.toCharrArray();
		for(int i=0;i<ch.length;i++) {
			if(!((ch[i]>='a'&&ch[i]<='z')||ch[i]>='A'&&ch[i]<='Z' ||(ch[i]>='0'&&ch[i]<='9'))){
				System.out.println(i);
			}
		}
	}
}
