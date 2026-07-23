package String;

public class ConvertUpperCase {
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
			char chs=res.charAt(0);
			if(chs>='a'&&chs<='z') {
				chs=(char)(chs+32);
			}
			res  
		}
	}
}


}
