package Acorn2;

public class AcornMain {
    public static void main(String[] args) {
        SyS a = new SyS();
        a.음료마시기();
        System.out.println(a.toString());

        AcornStudent ac = new AcornStudent("asdf",100);
        ac.음료마시기();

    }
}
