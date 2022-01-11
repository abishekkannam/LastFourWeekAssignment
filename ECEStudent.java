package Department;

import ECEdepartment.StudentECE;

public class ECEStudent extends StudentECE {

	public void studentName() {
		System.out.println("Abishekkanna");

	}

	public void studentDept() {
		System.out.println("ECE");

	}

	public void studentId() {
		System.out.println("256789");

	}

	public static void main(String[] args) {

		ECEStudent details = new ECEStudent();

		details.departmentName();
		details.studentName();
		details.studentDept();
		details.studentId();

	}

}
