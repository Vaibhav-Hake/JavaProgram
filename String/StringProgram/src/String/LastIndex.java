package String;

import java.util.Arrays;

public class LastIndex {
	private  char[]v;
	public LastIndex(String s) {
		v=new char[s.length()];
		//char []ch=s.toCharArray();
		for(int i=0;i<s.length();i++) {
			v[i]=s.charAt(i);
		}
		
	}
	public int lastIndexOf(char ch) {
		return lastIndexOf(ch,v.length-1);
	}
	
	public int lastIndexOf(char ch,int fromIndex) {
		for(int i=fromIndex;i>=0;i-- ) {
			if(ch==v[i]) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		LastIndex cs=new LastIndex("Vaibhav");
		System.out.println(cs.lastIndexOf('v', 3));
		System.out.println(cs.lastIndexOf('v'));

	}

}
