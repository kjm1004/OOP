package part3.ex5.java76추상화;

public class NewlecExam extends Exam{

	private int com;
	
	// 새로 추가된 com 과목을 위한 생성자 작성
	public NewlecExam() {
		this(0,0,0,0);
	}
	
	public NewlecExam(int kor, int eng, int math, int com) {
		super(kor,eng, math);
		this.com = com;
	}
	
	public int getCom() {
		return com;
	}

	public void setCom(int com) {
		this.com = com;
	}

	@Override
	public int total() {
		int total = getKor() + getEng() + getMath() + getCom();
		int total2 = onTotal() + com;		// 부모 객체 함수를 사용하려면 부모객체서 protected로 선언
		return total;
	}

	@Override
	public float avg() {
		return total()/4.0f;
	}

}
