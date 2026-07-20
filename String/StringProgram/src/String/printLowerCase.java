package String;



public class printLowerCase {
	private char[]value;
	public printLowerCase(String s) {
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
		printLowerCase cs=new printLowerCase("JaVa");
		char []ch=cs.toCharrArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='a'&&ch[i]<='z') {
				System.out.print(ch[i]+" : ");
				System.out.println((int)ch[i]);
			}
		}
	}
}
