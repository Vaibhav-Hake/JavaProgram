package String;



public class ExLower {
	private char[]value;
	public  ExLower(String s) {
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
		 ExLower cs=new  ExLower("JaVa");
		char []ch=cs.toCharrArray();
		for(int i=0;i<ch.length;i++) {
			if(!(ch[i]>='a'&&ch[i]<='z')) {
				System.out.print(ch[i]+" : ");
				System.out.println((int)ch[i]);
			}
		}
	}
}
