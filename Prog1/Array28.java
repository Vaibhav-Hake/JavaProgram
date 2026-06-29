

public class Array28 {
    public  static void main(String[] args) {

        int[] arr = {1,3,4,3};
        int prod = 1;

        for (int i = 0; i< arr.length;i++)
        {

            prod *= arr[i];

        }

        if (prod % 3 == 0)
            System.out.println(prod);



    }
}
