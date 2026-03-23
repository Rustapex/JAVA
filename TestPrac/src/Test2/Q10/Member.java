package Test2.Q10;

public class Member implements MyComparable {
    String name;
    int point;

    public Member() {
        this.name = "nobody";
        this.point = 0;
    }

    public Member(String name, int point) {
        this.name = name;
        this.point = point;
    }

    @Override
    public int compareTo(Object object) {
        if(object instanceof Member){
            Member member = (Member) object;
            return this.point -member.point;
        }
        return 0;


        // 현재 객체의 point 가 비교 객체의 point 보다 크면 양(정렬필요), 아니면 음, 같으면 0

    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", point=" + point +
                '}';
    }
}
