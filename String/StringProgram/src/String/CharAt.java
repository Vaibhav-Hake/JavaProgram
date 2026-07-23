package String;

public class CharAt {
    private char[]v;
    public CharAt(String s) {
		v=new char[s.length()];
		char[]ch=s.toCharArray();
		for(int i=0;i<v.length;i++) {
			v[i]=ch[i];
		}
	}
    public char charAt(int i) {
    	return v[i];
    }
    public static void main(String[] args) {
		CharAt cs=new CharAt("Vaibhav");
		System.out.println(cs.charAt(3));
	}
    
}
