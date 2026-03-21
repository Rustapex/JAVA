package cellPhone;

import objectRealtionship.Inheritance.isA.B;

public class Main2 {
    public static void main(String[] args) {

        HandPhone phone = new HandPhone();
        HandPhone phone2 = new HandPhone();
        HandPhone phone3 = new HandPhone();

        //배터리 주입 injection
        /*phone.setBattery(new SMBattery());
        * phone.setBattery(new LGBattery());
        * phone.setBattery(new Battery(){});*/


        phone.setBattery(new Battery() {
            @Override
            public void getEnergy() {
                System.out.println("배터리의 에너지를 얻어오다.");
            }
        });

        phone.powerOn();

        /*
        1. Battery interface를 이름 있는 class로 구현으로 사용해보기
        2. Battery interface를 익명 class로 구현해보기
        */

//      1. 이름 있는 class로 구현
        phone2.setBattery(new LOBattery());
        phone2.powerOn();

//      2. 익명 class로 구현하기

        phone3.setBattery(new Battery() {
            @Override
            public void getEnergy() {
                System.out.println("익명 클래스의 배터리를 에너지를 얻어온다.");
            }
        });



    }
}
