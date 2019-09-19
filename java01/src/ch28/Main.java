package ch28;

public class Main {
	
	public static void main(String[] args) {
		 
		
		Phone.ID=0;
		System.out.println(Phone.ID);
	
		Test.changePhoneID();
		System.out.println(Phone.ID);
		
		Laptop notebook1 = new Laptop();
		notebook1.ID=1;
		System.out.println(notebook1.ID);
	
		Laptop notebook2 = new Laptop();
		notebook2.ID =10;
		System.out.println(notebook2.ID);
		
		Test test = new Test();
		test.changeNotebookID();
		System.out.println(notebook1.ID);
	
		
	}
	 
	
}
