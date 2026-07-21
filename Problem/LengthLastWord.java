class LengthLastWord {
    public static int lengthOfLastWord(String s) {
        int ct=0;
        s=s.trim();
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' '){
                break;
            }
            ct++;
        }
        return ct;
    }
	public static void main(String[]args){
		System.out.println(lengthOfLastWord("Hello World  "));
		System.out.println(lengthOfLastWord("joy will yu"));
	}
}