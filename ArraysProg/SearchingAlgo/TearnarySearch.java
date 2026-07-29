class TearnarySearch{
	public static void main(String[]args){
		int []a={10,20,30,40,50};
		int k=40;
		System.out.println(search(a,k));
	}
	public static int search(int []a,int k){
		int l=0;
		int h=a.length-1;
		while(l<=h){
			int m1=l+(h-l)/3;
			int m2=h-(h-l)/3;
			if(a[m1]==k) return m1;
			if(a[m2]==k) return m2;
			if(a[m2]<k) l=m2+1; 
			else if(a[m1]>k) h=m1-1;
           else{
			   l=m1+1;
			   h=m2-1;
			   
		   }	
			
		}
		return -1;
	}
}