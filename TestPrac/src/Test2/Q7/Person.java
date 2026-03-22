package Test2.Q7;

public class Person {
    protected String name;
    protected String id;

    public Person() {
        this.name = "nobody";
        this.id = "NOTID";
    }

    public Person(String name, String id) {
        this.name = name;
        this.id = id;
        System.out.println("Person 클래스 생성자 호출");
    }

    public void disp(){
        System.out.printf("name : %s, id : %s%n", name, id);
    }
}
