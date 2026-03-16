package object.robot;

public class RobotMain {
    public static void main(String[] args) {
        // static method 호출
        Robot.printFactoryInfo();
        System.out.println();

        // static method는 객체 생성 없이 사용 가능
        System.out.println("배터리 80은 올바른 값인가? " + Robot.isValidBattery(80));
        System.out.println("배터리 150은 올바른 값인가? " + Robot.isValidBattery(150));
        System.out.println();

        // 객체 생성
        Robot r1 = new Robot("Cleaner-X", 70, "청소");
        Robot r2 = new Robot("Guard-Z", 90, "경비");

        // 로봇 생성 후 다시 공통 정보 출력
        Robot.printFactoryInfo();
        System.out.println();

        // instance method 호출
        r1.printStatus();
        System.out.println();

        r1.work(30);
        r1.changeMode("순찰");
        r1.charge(20);
        r1.printStatus();
        System.out.println();

        r2.printStatus();
        r2.work(95);
        r2.charge(15);
        r2.printStatus();
    }
}