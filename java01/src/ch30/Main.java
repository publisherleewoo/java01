package ch30;

public class Main {
//	public static final int CAT = 0;
//	public static final int DOG = 1;
//	public static final int BIRD = 2;
//	
	public static void main(String[] args) {
//		
//		int animal = CAT;
//		
//		switch(animal) {
//			case CAT:
//				System.out.println("고양이");
//				break;
//			case DOG:
//				System.out.println("강아지");
//				break;	
//			case BIRD:
//				System.out.println("새");
//				break;
//			default:
//				System.out.println("에러");		
//		}

			Animal animal = Animal.CAT;
			
			switch(animal) {
			case CAT:
				System.out.println("고양이");
				break;
			case DOG:
				System.out.println("강아지");
				break;	
			case BIRD:
				System.out.println("새");
				break;
			default:
				System.out.println("에러");		
		}	
	}

}
