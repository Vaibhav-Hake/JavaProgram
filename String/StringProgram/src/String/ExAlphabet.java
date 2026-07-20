package String;



public class ExAlphabet {
	private char[]value;
	public  ExAlphabet (String s) {
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
		 ExAlphabet cs=new  ExAlphabet("Ja654Va");
		char []ch=cs.toCharrArray();
		for(int i=0;i<ch.length;i++) {
			if(!((ch[i]>='a'&&ch[i]<='z')||ch[i]>='A'&&ch[i]<='Z')) {
				System.out.print(ch[i]+" : ");
				System.out.println((int)ch[i]);
			}
		}
	}
}
