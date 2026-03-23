package objectRealtionship.use;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void usePrinter(Printer printer) {
        System.out.println(name + "이(가) 프린터를 사용합니다.");
        printer.print();
    }
    public void printerModel(Printer printer){
        System.out.println("프린터 이름 : " + printer.getModel());
    }
}