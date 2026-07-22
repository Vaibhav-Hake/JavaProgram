package String;

public class LengthOddWord {
public static void main(String[] args) {
	String s=new String("Java is Easy abc");
	print(s);
}
public static void print(String s) {
	s+=" ";
	String res="";
	for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		if(ch!=' ') {
			res+=ch;
		}else {
			if(res.length()%2!=0) {
			System.out.println(res);
			}
			//System.out.println("scsc");
			res="";
		}
	}
}


}
