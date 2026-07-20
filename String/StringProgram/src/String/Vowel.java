package String;



public class Vowel{
	private char[]value;
	public Vowel(String s) {
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
       Vowel cs=new Vowel("JaVa");
		char []ch=cs.toCharrArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='a'||ch[i]=='A'||ch[i]=='E'||ch[i]=='e'||ch[i]=='i'||ch[i]=='I'||ch[i]=='o'||ch[i]=='O'||ch[i]=='U'||ch[i]=='u') {
				System.out.print(ch[i]+" : ");
				System.out.println((int)ch[i]);
			}
		}
	}
}
