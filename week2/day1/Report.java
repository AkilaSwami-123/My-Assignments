package week2.day1;

public class Report {

	public static void main(String[] args) {
		System.out.println("CREATING OBJECT FOR STUDENT CLASS IN REPORT CLASS AND ACCESSING VARIABLES IN REPORT CLASS");
   Student std= new Student();
   System.out.println("Name" + std.studentName);
   System.out.println("Rollno" + std.rollNo);
   System.out.println("School" + std.schoolName);
   System.out.println("CGPA" + std.cgpa);
   
	}

}
