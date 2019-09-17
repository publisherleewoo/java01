package ch23;

//캡슐화
public class Phone {
	//핸드폰 모델은 변하지않는, 그리고 참고해도되는,  볼수는있지만 변경못하는
	public static final String Model ="갤럭시S";
	private long number = 1231231234;
	
	public long getNumber() {
		return this.number;
	}
	
	public void setNumber(long num) {
		this.number = num;
	}
}
