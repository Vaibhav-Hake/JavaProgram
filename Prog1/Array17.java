

public class Array17 {
    public  static void main(String[] args) {

        int[] arr = {1,3,4,3};
        int prod = 1;

        for (int i = 0; i< arr.length;i++)
        {
            if (arr[i] % 2 != 0)
                prod *= arr[i];
        }

        System.out.println(prod);

    }
}
