package part3.ex5.java81이벤트메소드;

public class NewlecExamConsole extends ExamConsole{

	@Override
	protected Exam makeExam() {
		// TODO Auto-generated method stub
		return new NewlecExam();
	}

}
