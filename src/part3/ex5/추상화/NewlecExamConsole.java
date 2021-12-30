package part3.ex5.추상화;
import java.util.Scanner;

public class NewlecExamConsole extends ExamConsole{

	@Override
	protected Exam makeExam() {
		return new NewlecExam();
	}

	@Override
	protected void onInput(Exam exam, int cnt) {
		
		NewlecExam newlecExam = (NewlecExam) exam;
		
		Scanner scan = new Scanner(System.in);
		int com;
		
		do {
			System.out.printf("컴퓨터%d: ", cnt+1 );
			com = scan.nextInt();
			
			if(com < 0 || com > 100)
	 			System.out.println("성적범위(0~100)를 벗어났습니다");
			
		}while(com < 0 || com > 100);
		
		newlecExam.setCom(com);
	}

	@Override
	protected void onPrint(Exam exam, int i) {
		NewlecExam newlecExam = (NewlecExam) exam;
		int com = newlecExam.getCom();
		System.out.printf("컴퓨터%d: %3d\n", i+1, com);
	}

}
