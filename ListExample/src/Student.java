public class Student {

	private Integer studentId;
	private String studentName;
	private String studentMobileNum;

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentMobileNum() {
		return studentMobileNum;
	}

	public void setStudentMobileNum(String studentMobileNum) {
		this.studentMobileNum = studentMobileNum;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentMobileNum="
				+ studentMobileNum + "]";
	}

}
