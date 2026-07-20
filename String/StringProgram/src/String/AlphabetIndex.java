package String;



public class AlphabetIndex {
	private char[]value;
	public  AlphabetIndex (String s) {
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
		 AlphabetIndex cs=new  AlphabetIndex("Ja654Va");
		char []ch=cs.toCharrArray();
		for(int i=0;i<ch.length;i++) {
			if((ch[i]>='a'&&ch[i]<='z')||ch[i]>='A'&&ch[i]<='Z') {
				System.out.println(i);
			}
		}
	}
}
