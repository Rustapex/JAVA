package exception.사용자예외;

public class 음수예외checked extends Exception { //=> checkedException이 됨
	
	public 음수예외checked() {		 
		super("음수안돼");
	}

}
