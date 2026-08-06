class LeetCode151 {
    public static  String reverseWords(String s) {
        s=s.trim();
        String [] arr=s.split("\\s+");
       // String res="";
       StringBuilder res=new StringBuilder();
        for(int i=arr.length-1;i>=0;i--){
            if(i==arr.length-1){
                 // res+=arr[i];
                res.append(arr[i]);
            }
            else{
           // res+=" "+arr[i];
           res.append(" ");
            res.append(arr[i]);
            }
        }
        return new String(res);
    }
		public static void main(String[]args){
		System.out.println( reverseWords("the Sky is Blue"));
	}
}