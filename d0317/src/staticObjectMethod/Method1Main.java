package staticObjectMethod;

public class Method1Main {
    public static void main(String[] args) {

        //how to call static method
        MethodPrac1.method1();
        int result = Math.abs(-2);
        System.out.println(result);

        double result2 = Math.random(); // className.methodName
        System.out.println(result2);
    }
}
