package String;

import java.util.Arrays;

public class StringIntoArray {
	private char[]value;
	public StringIntoArray(String s) {
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
	public static void main(String[] args) {
		String s=new String("Java");
		char []ch=s.toCharArray();
		System.out.println(Arrays.toString(ch));
		
		
		StringIntoArray cs=new StringIntoArray("Java");
		char []ch1=cs.toCharrArray();
		System.out.println(Arrays.toString(ch1));
		
	}
	

}
