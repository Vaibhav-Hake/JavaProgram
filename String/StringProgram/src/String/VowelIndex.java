package String;



public class VowelIndex{
	private char[]value;
	public VowelIndex(String s) {
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
       VowelIndex cs=new VowelIndex("JaVa");
		char []ch=cs.toCharrArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='a'||ch[i]=='A'||ch[i]=='E'||ch[i]=='e'||ch[i]=='i'||ch[i]=='I'||ch[i]=='o'||ch[i]=='O'||ch[i]=='U'||ch[i]=='u') {
				System.out.println(i);
			}
		}
	}
}
