package part3.ex5.java76추상화;

import part3.ex4.java76추상화.Exam;

public class NewlecExam extends Exam{

	int com;
	
	public NewlecExam() {
		this(0,0,0,0);
	}
	
	public NewlecExam(int kor, int eng, int math, int com) {
		super(kor, eng, math);
		this.com = com;
	}
	
	
	@Override
	public int total() {
		int total;
		total = getKor() + getEng() + getMath() + com;
		total = ontotal() + com;
		return total;
	}

	@Override
	public float avg() {
		return total()/4.0f;
	}


}
