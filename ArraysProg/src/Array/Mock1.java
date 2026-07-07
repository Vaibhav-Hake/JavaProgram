package Array;

public class Mock1 {
	public static void main(String[]args) {
		int []a= {1,2,3,1,2,5};
		freq(a);
	}
	public static void freq(int[]a) {
		boolean[]v=new boolean[a.length];
		for(int i=0;i<a.length;i++) {
			if(v[i]) {
				continue;
			}
			int ct=1;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					ct++;
					v[j]=true;
				}
			}
			System.out.println(a[i]+"-->"+ct);
		}
		
	}

}
