package part3.ex5.java76추상화;

import part3.ex5.java65HasA상속.ExamConsole;

public class program {

	public static void main(String[] args) {
		//NewlecExam exam = new NewlecExam();
	
		ExamConsole console = new NewlecExamConsole();
		console.input();
		console.print();
	}

}
