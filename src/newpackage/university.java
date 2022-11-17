package newpackage;

class university {
	
	private String  name;
	private college college;
	
	

	public university(String name, newpackage.college college) {
		super();
		this.name = name;
		this.college = college;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public college getCollege() {
		return college;
	}



	public void setCollege(college college) {
		this.college = college;
	}




}
