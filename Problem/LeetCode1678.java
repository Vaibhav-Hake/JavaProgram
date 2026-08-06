class LeetCode1678 {
	//here we use String Builder for optimization
    public static  String interpret(String command) {
         //String res="";
		  StringBuilder res=new StringBuilder();
         for(int i=0;i<command.length();i++){
            if(command.charAt(i)=='G'){
               // res+='G';
				  res.append('G');
            }else if(command.charAt(i)=='('&&command.charAt(i+1)==')'){
               // res+='o';
				  res.append('o');
            }
            else if(command.charAt(i)=='('&&command.charAt(i+1)=='a'){
              //  res+="al";
				  res.append("al");
            }
         }
         return new String(res);
    }
	public static void main(String[]args){
		System.out.println(interpret("G()()(al)"));
	}
}