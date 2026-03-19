package object.String;


public class CharToString {
    public static void main(String[] args) {
        char a = 'h';
        char b = 'i';
        char[] sayHello = {a, b};
        for (int i = 0; i < 2; i++) {
            System.out.print(sayHello[i]);
        }
        System.out.println();

//        printCharArray(sayHello);
        System.out.println(myToString(sayHello));

        String str = "ABCDEFGH";
        System.out.println(str);

        char result = str.charAt(5);
        System.out.println(result);

        String string1 = "i love java"; // 문자열 배열은 반드시 문자열 객체. 메서드로만 사용한다, 불변 객체, 수정할 수 없다.
        char result1 = string1.charAt(0);

        String str3 = "i love java";
        String upperStr3 = str.toUpperCase();

        String str4 = "JAVA";
        System.out.println();
        String downStr4 = str.toUpperCase();
        System.out.println(downStr4);

        String str5 = "i love java";
        // 시작 인덱스
        System.out.println(str5.substring(7, 11));
//        str.substring();
        String str1 = "hello";
        String str2 = "helle";


    }

    public static String myToString(char[] arr){
        String str = "";
        for(int i=0; i<arr.length; i++){
            str += arr[i];
        }
        return str;
    }
}
