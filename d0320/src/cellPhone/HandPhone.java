package cellPhone;

public class HandPhone {
	
	Battery battery ;


	// 원래는 생성자로도 배터리를 넣어줄 수 있음
	// 객체를 만들 때부터 어떤 배터리를 사용할지 정하는 방식
    /*
    public HandPhone(Battery battery) {
        this.battery = battery;
    }
    */

	// setter 방식
	// 이미 만들어진 phone 객체에 나중에 배터리를 넣어주는 방식
	// 매개변수 타입이 Battery 라는 뜻은
	// Battery 인터페이스를 구현한 객체면 무엇이든 받을 수 있다는 뜻
	public void setBattery(Battery battery) {
		this.battery = battery;
	}


	// 전원 켜기 기능
	void powerOn() {


		// 전원 켜기 기능
		// battery가 가진 getEnergy() 호출
		// 실제로는 연결된 배터리 객체(LGBattery, SMBattery, 익명 클래스, 람다식)의
		// getEnergy()가 실행됨
		battery.getEnergy();

		// 에너지를 받은 뒤 핸드폰 전원 켜짐
		System.out.println("핸드폰이 켜진다");}

}
