package part3.ex5.java70자식클래스초기화;

import part3.ex5.java65HasA상속.Exam;

public class program {

	public static void main(String[] args) {
		
		Exam exam = new Exam();
		System.out.println(exam.total());
		
		
		NewlecExam exam1 = new NewlecExam(1,1,1,1);
		System.out.println(exam1.total());
		
		exam1.setKor(10);
		exam1.setEng(10);
		exam1.setMath(10);
		System.out.println(exam1.total());
		
		exam1.setCom(10);
		System.out.println(exam1.total());
		System.out.println(exam1.avg());
	}
}
