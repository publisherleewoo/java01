package ch04;

public class Test {

	public static void main(String[] args) {
		int kor=85;
		int mat=90;
		int eng=70;
		int tot= kor + eng + mat;
		double avg = tot / 3.0;
		String grade = "";
		
		if(avg >= 90) {
			grade = "수";
		}else if(avg >= 80) {
			grade = "우";
		}else if(avg >= 70) {
			grade = "미";
		}else if(avg >= 60) {
			grade = "양";
		}else {
			grade = "가";
		}
		System.out.println("국어\t영어\t수학\t총점\t평균\t등급");
		System.out.printf(
		"%d\t%d\t%d\t%d\t%5.1f\t%s"
		,kor,eng,mat,tot,avg,grade	
		);
	}

}
