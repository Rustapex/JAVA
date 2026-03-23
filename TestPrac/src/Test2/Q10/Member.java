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
        if (object instanceof Member) {
            Member member = (Member) object;
            int resComp;

            if (member.point == this.point) {
                resComp = 0;
            } else {
                resComp = this.point - member.point;
            }
            // 비교할 대상이 point가 더 크면 양수, 아니면 음수 반환
            return resComp;
        }
//        return object
        return 0;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", point=" + point +
                '}';
    }
}
