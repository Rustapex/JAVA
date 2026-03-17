package staticObjectMethod;

import java.util.Random;

public class Method2Main {
    public static void main(String[] args) {
        MethodPrac2 b = new MethodPrac2();
        b.method1();

        Random random = new Random(); //
        int result1 = random.nextInt(100); // 1 ~100

        System.out.println(result1);

    }
}
