package part3.ex5.java76추상화;

import part3.ex5.java65HasA상속.Exam;
import part3.ex5.java65HasA상속.ExamConsole;

public class NewlecExamConsole extends ExamConsole{

	@Override
	protected Exam makeExam() {
		// TODO Auto-generated method stub
		return new NewlecExam();
	}

}
