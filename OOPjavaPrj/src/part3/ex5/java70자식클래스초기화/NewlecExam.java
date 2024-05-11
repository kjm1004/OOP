package part3.ex5.java70자식클래스초기화;

import part3.ex5.java65HasA상속.Exam;

public class NewlecExam extends Exam {
	private int com;

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
