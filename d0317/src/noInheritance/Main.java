package noInheritance;

public class Main {
    public static void main(String[] args) {

        StudentWorker sw = new StudentWorker();
        sw.talk();
        sw.study();
        sw.talk();
        sw.eat();
        sw.work();
        sw.sleep();



        Researcher r = new Researcher();
        r.talk();
        r.talk();
        r.eat();
        r.research();
        r.sleep();


        Professor p = new Professor();
        p.teach();
        p.talk();
        p.talk();
        p.research();
        p.sleep();

    }

}
