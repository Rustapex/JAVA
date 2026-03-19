package AbstractClassInterface.Abstract;

//추상 클래스
/*추상 클래스를 하나라도 가지면 추상 클래스가 된다.
* instance 객체 생성 불가
*
* 추상 메서드 만드는 법 : 선언부만 가짐.*/

public abstract class AcornStudent {
	String name;

	public AcornStudent(){
	}
	public AcornStudent(String name){
		this.name=name;
	}

	public abstract void study();
	public abstract void dance();
}
