package String;

import java.util.Arrays;

public class IndexOf {
	private  char[]v;
	public IndexOf(String s) {
		v=new char[s.length()];
		//char []ch=s.toCharArray();
		for(int i=0;i<s.length();i++) {
			v[i]=s.charAt(i);
		}
		
	}
	public int indexOf(char ch) {
		return indexOf(ch,0);
	}
	
	public int indexOf(char ch,int fromIndex) {
		for(int i=fromIndex;i<v.length;i++ ) {
			if(ch==v[i]) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		IndexOf cs=new IndexOf("Vaibhav");
		System.out.println(cs.indexOf('v', 3));
		System.out.println(cs.indexOf('v'));

	}

}
