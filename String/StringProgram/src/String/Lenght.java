package String;

public class Lenght {
	private char[]value;
	public Lenght(String s) {
		value=new char[s.length()];
		char[]ch=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			value[i]=ch[i];
		}
		
	}
	public char[] toCharrArray() {
		return value;
	}
	@Override
	public String toString() {
		return new String(value);	
	}
	public int length() {
		return value.length;
	}
	public static void main(String[] args) {
	Lenght s=new Lenght("Java");
		System.out.println(s.length());
	}

}
