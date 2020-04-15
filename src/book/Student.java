package book;

public class Student {
	int studentID; 
	String studentName; 
	int grade; 
	String studentAddress; 

	public Student() {}
	
	public Student(String name, String address) {
		studentName = name;
		studentAddress = address;
	}
	public String getStudentName() { // 메서드라고한다.
		return studentName;
	}

	public void setStudentName(String name) {
		studentName = name;
	}

	public void showStudentInfo() {
		System.out.println(studentName + "," + studentAddress);  	//이름,주소 출력
	}
	public static void main(String[] args) {
		Student studentBae = new Student();
		studentBae.studentName = "배기훈";
		studentBae.studentAddress = "서울시 마포구 아현동";
		
		Student studentKim = new Student("김슬비","서울시 마포구 마포동");
		
		studentBae.showStudentInfo();
		studentKim.showStudentInfo();
			
		
	}


}