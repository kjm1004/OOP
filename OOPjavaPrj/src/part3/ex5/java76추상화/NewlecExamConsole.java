package part3.ex5.java76추상화;

import java.awt.font.TextHitInfo;
import java.util.Scanner;

import part3.ex4.java76추상화.Exam;
import part3.ex4.java76추상화.ExamConsole;

public class NewlecExamConsole extends ExamConsole{

	Scanner scan = new Scanner(System.in);
	int com ;
	
	@Override
	protected Exam makeExam() {
		// TODO Auto-generated method stub
		return new NewlecExam();
	}


	@Override
	protected void onPrint(Exam exam) {
		NewlecExam newlecExam = (NewlecExam)exam;
		int com = newlecExam.getCom() ;
		System.out.printf("컴퓨터 : %d \n", com);
	}

	@Override
	protected void onInput(Exam exam) {
		do {
			System.out.printf("컴퓨터 : ");
			com = scan.nextInt();
			
			if (com < 0 || 100 < com)
				System.out.println("컴퓨터성적은 0~100까지의 범위만 입력이 가능합니다.");
		} while (com < 0 || 100 < com);
		
	}
	
}
