class DetectCapital {
    public static  boolean detectCapitalUse(String word) {
        int ct=0;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(ch>='A'&&ch<='Z'){
                ct++;
            }
        }
        if((ct==word.length())){
            return true;
        }
        if((ct==0)){
            return true;
        }
        if((word.charAt(0)>='A' && word.charAt(0)<='Z')&&ct==1){
            return true;
        }
        return false;
    }
	public static void main(String[]args){
		System.out.println(detectCapitalUse("VAIbHAV"));
        
		
	}
}