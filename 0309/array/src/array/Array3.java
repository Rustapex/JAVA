package array;

public class Array3 {
    public static void main(String[] args) {
        char a = 'a';
        char b = 'b';
        char c = 'c';
        char d = 'd';
        char e = 'e';

        char[] str = new char[5];
        str[0] = a;
        str[1] = b;
        str[2] = c;
        str[3] = d;
        str[4] = e;

        for(int i=0; i<str.length; i++){
            System.out.print(str[i]);
        }
        System.out.println();
        System.out.println(str);

    }
}
