import java.util.ArrayList;
class MinMax {
    public static ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        ArrayList<Integer>list=new ArrayList<>();
        list.add(min(arr));
        list.add(max(arr));
        return list;
        
    }
    public static int min(int[]a){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        return min;
    }
        public static int max(int[]a){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        return max;
    }
    public static void main(String []args){
	int[]a={10,66,5,865,56};
	System.out.println(getMinMax(a));
}
}
