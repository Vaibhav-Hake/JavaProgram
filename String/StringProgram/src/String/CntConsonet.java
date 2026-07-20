package String;



public class CntConsonet{
	private char[]value;
	public CntConsonet(String s) {
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
		CntConsonet cs=new CntConsonet("JaVa");
		char []ch=cs.toCharrArray();
		int ct=0;
		for(int i=0;i<ch.length;i++) {
			if(!(ch[i]=='a'||ch[i]=='A'||ch[i]=='E'||ch[i]=='e'||ch[i]=='i'||ch[i]=='I'||ch[i]=='o'||ch[i]=='O'||ch[i]=='U'||ch[i]=='u')) {
				ct++;
			}
		}
		System.out.println(ct);
	}
}
