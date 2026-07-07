package Array;

public class Mock2 {
	public static void main(String[]args) {
		char []a= {'a','b','a','2','2'};
		freq(a);
	}
	public static void freq(char[]a) {
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
