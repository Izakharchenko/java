
public class ReportCard {

	public static char convertGrades(int testResult) {
		char grade;
		
		if (testResult >= 90) {
			grade = 'A';
		} else if (testResult >= 80 && testResult < 90) {
			grade = 'B';
		} else if (testResult >= 70 && testResult < 80) {
			grade = 'C';
		} else {
			grade = 'D';
		}
		
		return grade; 
	}
	
	public static void main(String[] args) {
//		ReportCard rc = new ReportCard();
		
		char yourGrade = ReportCard.convertGrades(88);
		
		switch(yourGrade) {
			case 'A':
				System.out.println("Чудова робота!");
				break;
			case 'B':
				System.out.println("Хороша робота!");
				break;
			case 'C':
				System.out.println("Треба підтянути знання!");
				break;
			case 'D':
				System.out.println("Будь серйознішим!");
				break;
		}
	}

}
