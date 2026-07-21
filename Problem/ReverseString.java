import java.util.Arrays;
class RevrseString {
    public static void reverseString(char[] s) {
     int i=0,j=s.length-1;
     char temp;
     while(i<=j){
        temp=s[i];
        s[i]=s[j];
        s[j]=temp;
        i++;
        j--;
     }
     System.out.println(Arrays.toString(s));
        
    }
	public static void main(String[]args){
		char[]s = {'h','e','l','l','o'};

		reverseString(s);
        
		
	}
}