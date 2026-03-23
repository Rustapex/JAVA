package objectRealtionship.use;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("홍길동");
        Printer printer = new Printer("삼성 프린터");

        person.usePrinter(printer);
        person.printerModel(printer);
    }
}