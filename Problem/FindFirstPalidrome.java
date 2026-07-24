class FindFirstPalidrome {
    public static  String firstPalindrome(String[] words) {
        for(String ele:words){
            if(isPalidrome(ele)){
                return ele;
            }

        }
        return "";
        
    }
    public static boolean isPalidrome(String s){
        int i=0,j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
	public static void main(String[]args){
		String[]s = {"hii","ele","lemon","madam","o"};

		System.out.println(firstPalindrome(s));
        
		
	}
}