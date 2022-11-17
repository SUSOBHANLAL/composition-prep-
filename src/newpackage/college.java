package newpackage;

class college {
	private String collegeName;
	private Library library;
	private Branch branch;
	
	

	public college(String collegeName, Library library, Branch branch) {
		super();
		this.collegeName = collegeName;
		this.library = library;
		this.branch = branch;
	}



	public String getCollegeName() {
		return collegeName;
	}



	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}



	public Library getLibrary() {
		return library;
	}



	public void setLibrary(Library library) {
		this.library = library;
	}



	public Branch getBranch() {
		return branch;
	}



	public void setBranch(Branch branch) {
		this.branch = branch;
	}




}
