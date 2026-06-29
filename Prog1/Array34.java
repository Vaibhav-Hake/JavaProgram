

public class Array34 {

    public static void main() {


        char [] ch = {'a', 'e', 'd', 'f', 'i'};

        for(int i = 0; i< ch.length ;i++){
           if (!(ch[i] == 'a') || !(ch[i] == 'e') || !(ch[i] == 'i') || !(ch[i] == 'o') || !(ch[i] == 'o')
            || !(ch[i] == 'A') || !(ch[i] == 'E') || !(ch[i] == 'I') || !(ch[i] == 'O') || !(ch[i] == 'U'))

               System.out.println(ch[i]);
        }

    }

}
