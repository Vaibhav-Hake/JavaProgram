import java.util.ArrayList;
class CommonRange{
	public static void main(String[]args){
		int []a={1,2,3,5,6,8,10,11};
		System.out.println(common(a));
		
	}
	public static ArrayList<String> common(int []a){
		ArrayList <String> list=new ArrayList<String>();
		int k=a[0];
		int t=a[0];
		for(int i=1;i<a.length;i++){
			if(a[i]==k+1){
				k=a[i];
			}else if(t==k){
				list.add(t+"");
				t=a[i];
				k=a[i];
			}
			else{
				list.add(t+"-->"+k);
				t=a[i];
				k=a[i];
			}
		}
		list.add(t+"-->"+k);
		return list;
	}
}