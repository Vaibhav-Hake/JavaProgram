package Array;

public class SecondHighFreq {
public static void main(String[]args) {
	int[]a= {1,2,1,2,1,6,4,5,3,3,2};
	secondFreq(a);
}
public static void secondFreq(int[]a) {
	boolean[]v=new boolean[a.length];
	int m1=0;
	int m2=0;
	int mEle=0;
	int sEle=0;
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
		if(m1<ct) {
			m2=m1;
			m1=ct;
			sEle=mEle;
			mEle=a[i];
			
		}
		else if(m2<ct&&ct<m1){
			m2=ct;
			sEle=a[i];
		}
	}
	System.out.println(sEle);
}
}
