class LeetCode1704 {
    public static boolean halvesAreAlike(String s) {
        if(s.length()%2!=0){
            return false;
        }
        

        int m=s.length()/2;
        int ct1=0,ct2=0;
        for(int i=0;i<m;i++){
             if(isVowel(s.charAt(i))){
                ct1++;
            }
        }
           for(int i=m;i<s.length();i++){
             if(isVowel(s.charAt(i))){
                ct2++;
            }
        }
        return ct1==ct2;

    }
   
    public static boolean isVowel(char ch){
        return "aeiouAEIOU".indexOf(ch)!=-1;
    }
	public static void main(String[]args){
		System.out.println(halvesAreAlike("book"));
	}
}