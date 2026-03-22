package Test1.Q6;

public class Member {
    private String id;
    private String name;
    private int age;

    public Member(String id, String name, int age) {
        this.id = id;
        this.name = name;
        if(age >0){
            this.age = age;
        } else{
            this.age=0;
        }
    }

    //    getter
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    //setter
    public void setAge(int age) {
        if(age >=0){
            this.age = age;
        } else{
            System.out.println("0보다 작은 값을 입력하셨습니다.");
            System.out.println("다시 입력하세요");
        }
    }
}
