package String;

import java.util.Arrays;

public class ToCharArray {
	private char[]v;
	public ToCharArray(String s) {
		v=new char[s.length()];
		//char []ch=s.toCharArray();
		for(int i=0;i<s.length();i++) {
			v[i]=s.charAt(i);
		}
		
	}
	public char[] toCharArray1() {
		return v;
	}
	public static void main(String[] args) {
		ToCharArray cs=new ToCharArray("Vaibhav");
				System.out.println(Arrays.toString(cs.toCharArray1()));
	}

}
