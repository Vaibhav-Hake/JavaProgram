package String;



public class Itrate {
	private char[]value;
	public Itrate(String s) {
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
		Itrate cs=new Itrate("JaVa");
		char []ch=cs.toCharrArray();
		for(int i=ch.length-1;i>=0;i--) {
			
				System.out.println(ch[i]);
			
		}
	}
}
