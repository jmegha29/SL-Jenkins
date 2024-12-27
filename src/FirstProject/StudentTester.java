package FirstProject;

class Student {
	
	private int studentID;
	private String name;
	private double qualifyingExamMarks;
	private char residentialStatus;
	private int yearOfEngg;
	
	public String getName() {
		return name;
	}
	public void setName(String name ) {
		this.name= name;
	}
	public float getQualifyingExamMarks() {
		return (float) qualifyingExamMarks;
	}
	public void setQualifyingExamMarks(float qualifyingExamMarks ) {
		this.qualifyingExamMarks = qualifyingExamMarks;
	}
	public char getResidentialStatus() {
		return residentialStatus;
	}
	public void setResidentialStatus(char residentialStatus ) {
		this.residentialStatus = residentialStatus;
	}
	
	public int getYearOfEngg() {
		return yearOfEngg;
	}
	public void setYearOfEngg(int yearOfEngg) {
		this.yearOfEngg = yearOfEngg;
	}
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
}

 class StudentTester{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student S = new Student();
		S.setStudentID(1001);
		S.setName("Jacob");
		S.setQualifyingExamMarks(80);
		S.setResidentialStatus('H');
		S.setYearOfEngg(3);
		System.out.println("Student Name : "+S.getName());
		System.out.println("Student ID : "+S.getStudentID());
		System.out.println("Qualifying marks : "+S.getQualifyingExamMarks());
		System.out.println("ResidentialStatus : "+S.getResidentialStatus());
		System.out.println("Year of Engg : "+S.getYearOfEngg());
	}
}


