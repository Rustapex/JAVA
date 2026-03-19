package Practice;

public class Member extends GYM {

    public Member(String name, int age, int weight, int mass) {
        super(name, age, weight, mass);
    }

    public void Cheating() {
        setMass(getMass() - 20);
        setWeight(getWeight() + 20);
    }

    public void PT() {
        setMass(getMass() + 15);
        setWeight(getWeight() - 15);
        System.out.println("PT를 받습니다.");
    }

}
