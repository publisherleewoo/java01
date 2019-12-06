class Print{
	public String delimiter;
	public String str;
	public Print(String param) {
		System.out.println(param);
		System.out.println("hi. 가장먼저 실행되는 생성자(컨스트럭터). 초기화작업용");
	}
	public void print() {
		System.out.println(delimiter);	
		System.out.println(str);
		System.out.println(str);
		System.out.println("  ");
		
	}
	
}