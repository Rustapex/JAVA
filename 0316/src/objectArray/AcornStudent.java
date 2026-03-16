package objectArray;

public class AcornStudent {


    //속성
    private String name;
    private int energy;
    private int mass;
    private int performance;
    private int frontAbility;
    private int stress;

    // 기본 생성자
    public AcornStudent(){

    }

    public AcornStudent(String name, int energy, int mass, int performance, int frontAbility) {
        this.name = name;
        this.energy = energy;
        this.mass = mass;
        this.performance = performance;
        this.frontAbility = frontAbility;

    }

    public void printInfo() {
        System.out.println("name : " + name);
        System.out.println("energy : " + energy);
        System.out.println("mass : " + mass);
        System.out.println("performance : " + performance);
        System.out.println("frontAbility : " + frontAbility);
    }


    public void studyArray() {
        performance += 20;
        mass += 20;
        energy -= 5;

    }

    public void makeDiv() {
        frontAbility += 30;
        mass += 5;
        energy -= 5;
    }


    public void eat() {
        energy += 100;
    }


    public int smile() {
        energy += 10;
        return 10;
    }

    public void studyObject(){
        performance += 20;
        mass += 10;
        energy -= 10;
    }


}
