package array;

public class ArgumentMethod {
    /* javac -encoding utf-8 ArgumentMethod.java => 컴파일 .class
    java ArgumentMethod hello java => main Arguments에 hello java 넣고 apply 하고 run 하면 main 돌리면 나옴
    */
    public static void main(String[] args) {
        System.out.println("전달된 인자 개수: " + args.length);

        for (int i = 0; i < args.length; i++) {
            System.out.println((i + 1) + "번째 인자: " + args[i]);
        }
    }
}
