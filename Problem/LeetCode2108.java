class LeetCode2108 {
    public static String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            if(isPalidrome(words[i])){
                return words[i];
            }
        }
        return "";
        
    }
    public static  boolean isPalidrome(String a){
        int i=0,j=a.length()-1;
        while(i<=j){
            if(a.charAt(i  )!=a.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
	public static void main(String[]args){
	String[]a={"abc","car","ada","racecar","cool"};
		System.out.println( firstPalindrome(a));
	}
}