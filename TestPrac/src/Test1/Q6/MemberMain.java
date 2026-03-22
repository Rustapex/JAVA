package Test1.Q6;

public class MemberMain {
    public static void main(String[] args) {
        Member member1 = new Member("id1", "name1", -20);
        Member member2 = new Member("id2", "name2", 20);

        System.out.printf("id - %s, name - %s, age - %d%n", member1.getId(),member1.getName(),member1.getAge());

        member1.setAge(10);
        member1.setAge(-2);
        System.out.printf("id - %s, name - %s, age - %d%n", member1.getId(),member1.getName(),member1.getAge());

        System.out.printf("id - %s, name - %s, age - %d%n", member2.getId(),member2.getName(),member2.getAge());

    }
}
