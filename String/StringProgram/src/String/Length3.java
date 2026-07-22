package String;

public class Length3 {
public static void main(String[] args) {
	String s=new String("Java is Easy abc");
	print(s);
}
public static void print(String s) {
	s+=" ";
	int ct=0;
	String res="";
	for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		if(ch!=' ') {
			res+=ch;
		}else {
			
			//System.out.println(res);
			ct++;
			//System.out.println("scsc");
			res="";
		}
	}
	System.out.println(ct);;
}


}
