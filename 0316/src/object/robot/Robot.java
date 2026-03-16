package object.robot;

public class Robot {
    /*instance method : 객체 소속 객체 내부에서만 접근 가능*/
    private String name;
    private int battery;
    private String mode;

    /*static field : 모든 로봇이 공유함 static*/
    private static int robotCount =0;
    private static String factoryNmae = "A Robot Factory";

    public Robot(String name, int battery, String mode){
        this.name = name;
        this.battery = battery;
        this.mode = mode;
    }

    /*main에서 사용 public*/
    public void work(int useBattery){
        if(useBattery <= 0){
            System.out.println("사용할 배터리는 1 이상이어야 합니다.");
            return;

        }
        if(battery >= useBattery){
            battery -= useBattery;
            System.out.printf("작업자 - %s / 작업을 수행했습니다. 배터리 잔량 - %d%n", name, battery);

        } else{
            System.out.printf("작업자 - %s / 베터리가 부족합니다.%n", name);
        }
    }
    public void charge(int amount) {
        if (amount <= 0) {
            System.out.println("충전량은 1 이상이어야 합니다.");
            return;
        }

        battery += amount;
        if (battery > 100) {
            battery = 100;
        }

        System.out.println(name + "이(가) 충전되었습니다. 현재 배터리 : " + battery);
    }

    public void changeMode(String newMode){
        this.mode = newMode; // setter로 mode 변경
        System.out.printf("작업자 - %s, 변경된 모드 - %s%n", name,newMode);
    }

    public void printStatus(){
        System.out.println("===로봇 상태===");
        System.out.println("이름 : " + name);
        System.out.println("배터리 : " + battery);
        System.out.println("모드 : " + mode);

    }


    /*static method : 객체와 무관한 클래스 소속 method*/

    public static void printFactoryInfo(){
        System.out.println("공장명 : " + factoryNmae);
        System.out.println("현재 생성된 로봇 수 : " + robotCount);
    }

    public static boolean isValidBattery(int battery){
        boolean isValidBattery;
        if(battery >= 0 && battery <= 100){
            isValidBattery = true;
        } else{
            isValidBattery = false;
        }
        return isValidBattery;
    }

    public String getName(){
        return name;
    }

    public int getBattery(){
        return battery;
    }
    public String getMode(){
        return mode;
    }

}
