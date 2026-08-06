class LeetCode1678 {
    public static  String interpret(String command) {
         String res="";
         for(int i=0;i<command.length();i++){
            if(command.charAt(i)=='G'){
                res+='G';
            }else if(command.charAt(i)=='('&&command.charAt(i+1)==')'){
                res+='o';
            }
            else if(command.charAt(i)=='('&&command.charAt(i+1)=='a'){
                res+="al";
            }
         }
         return res;
    }
	public static void main(String[]args){
		System.out.println(interpret("G()()(al)"));
	}
}