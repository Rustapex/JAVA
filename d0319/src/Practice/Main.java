package Practice;

public class Main {
    public static void main(String[] args) {
        GYM[] gyms = new GYM[10];
        gyms[0] = new GYM();
        gyms[1] = new Trainner("송주창", 26, 74, 33, 100); //업캐스팅
        gyms[2] = new Member("손영석", 24, 100, 50); //업캐스팅


        System.out.println(gyms[1].toString());
        gyms[1].exercise(); // override 트레이너의 운동
        System.out.println(gyms[1].toString()); // 운동 결과 출력
        if(gyms[1] instanceof Trainner){
            Trainner trainner = (Trainner) gyms[1]; //다운캐스팅
            trainner.Legday();
            System.out.println(trainner.toString());
        }

        System.out.println(gyms[2].toString());
        if(gyms[2] instanceof Member){
            Member member = (Member) gyms[2]; //다운캐스팅
            member.Cheating();
            System.out.println(member.toString());
            member.PT();
            System.out.println(member.toString());
        }
    }
}
