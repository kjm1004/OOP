package part3.ex5.java76추상화;

public class NewlecExamConsole extends ExamConsole{

	@Override
	protected Exam makeExam() {
		// TODO Auto-generated method stub
		return new NewlecExam();
	}

}
