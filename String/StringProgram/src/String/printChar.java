package String;



public class printChar {
	private char[]value;
	public printChar(String s) {
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
		printChar cs=new printChar("JaVa");
		char []ch=cs.toCharrArray();
		for(int i=0;i<ch.length;i++) {
			
			System.out.print(ch[i]+" : ");
			System.out.println((int)ch[i]);
			
		}
	}
}
