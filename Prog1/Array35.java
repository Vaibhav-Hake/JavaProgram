

public class Array35 {

    public static void main() {


        char [] ch = {'a', 'e', 'd', 'f', 'i'};

        for(int i = 0; i< ch.length ;i++){
            if (ch[i] > 65 && ch[i] < 90 || ch[i] > 97 && ch[i]  <= 122)
                System.out.println(ch[i]);
        }

    }

}
