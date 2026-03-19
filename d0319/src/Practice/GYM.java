package Practice;

public class GYM {
    private String name;
    private int age;
    private int weight;
    private int mass;

    public GYM(){
        this("헬스장사장", 40, 70, 300);
    }

    public GYM(String name, int age, int weight, int mass) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.mass = mass;
    }

    //getter
    protected int getWeight() {
        return weight;
    }
    protected int getMass() {
        return mass;
    }

    //setter
    protected void setWeight(int weight) {
        this.weight = weight;
    }
    protected void setMass(int mass) {
        this.mass = mass;
    }

    public void exercise(){
        mass +=10;
        weight -=5;
    }
    public void noExercise(){
        mass -=10;
        weight += 10;
    }

    @Override
    public String toString() {
        return "[헬스장 회원]\n" +
                "이름 : " + name +
                "\n나이 : " + age +
                "\n몸무게 : " + weight +
                "\n근육량 : " + mass;
    }
}
