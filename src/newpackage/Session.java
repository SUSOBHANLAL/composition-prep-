package newpackage;

class Session {
	
	private String sessionname;
	private Student student;
	

	public Session(String sessionname, Student student) {
		super();
		this.sessionname = sessionname;
		this.student = student;
	}


	public String getSessionname() {
		return sessionname;
	}


	public void setSessionname(String sessionname) {
		this.sessionname = sessionname;
	}


	public Student getStudent() {
		return student;
	}


	public void setStudent(Student student) {
		this.student = student;
	}



}
