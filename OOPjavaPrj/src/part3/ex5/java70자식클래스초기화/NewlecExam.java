package part3.ex5.java70자식클래스초기화;

import part3.ex5.java65HasA상속.Exam;

public class NewlecExam extends Exam {
	private int com;

	public NewlecExam() {
		// 아래의 생성자 사용전에 부모객체에 값을 저장하면 안됨
		// this.com=3; <== 오류 발생
		this(0,0,0,0);
	}
	
	public NewlecExam(int kor, int eng, int math, int com) {
		//this.setKor(kor);
		super(kor, eng, math );// 부모 생성자 호출
	}

	public int getCom() {
		return com;
	}

	public void setCom(int com) {
		this.com = com;
	}
	
	@Override
	public int total() {
		return super.total()+com;
	}

	
	@Override
	public float avg() {
		return total()/4.0f;
	}
}
