class LeetCode242 {
    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;

        }
        int[]a=new int[256];
        for(int i=0;i<s.length();i++){
            char ch1=s.charAt(i);
            char ch2=t.charAt(i);
            a[ch1-'a']++;
            a[ch2-'a']--;
        }
        for(int i=0;i<a.length;i++){
            if(a[i]!=0){
                return false;
            }
        }
        return true
		
		;
    }
	public static void main(String[]args){
		System.out.println( isAnagram("anagram","nagaram"));
	}
}