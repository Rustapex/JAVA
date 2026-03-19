package Practice;

public class Trainner extends GYM{
	private int squat;

	public Trainner(String name, int age, int weight, int mass,int squat) {
		super(name, age, weight, mass);
		this.squat = squat;
	}
	
	@Override
	public void exercise() {
		setMass(getMass() + 20);
		setWeight(getWeight() - 5);
	}


	public void Legday() {
		this.squat += 20;
		setMass(getMass() + 30);
		setWeight(getWeight() - 10);
	}

	@Override
	public String toString() {
		return super.toString() +
				"\n스쿼트 중량 : " + squat;
	}
}


