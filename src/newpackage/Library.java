package newpackage;

class Library {
	private String Name;
	private String yob;
	private String noofbooks;
	private Floor floor;
	
	

	public Library(String name, String yob, String noofbooks, Floor floor) {
		super();
		Name = name;
		this.yob = yob;
		this.noofbooks = noofbooks;
		this.floor = floor;
	}



	public String getName() {
		return Name;
	}



	public void setName(String name) {
		Name = name;
	}



	public String getYob() {
		return yob;
	}



	public void setYob(String yob) {
		this.yob = yob;
	}



	public String getNoofbooks() {
		return noofbooks;
	}



	public void setNoofbooks(String noofbooks) {
		this.noofbooks = noofbooks;
	}



	public Floor getFloor() {
		return floor;
	}



	public void setFloor(Floor floor) {
		this.floor = floor;
	}
	
	public void searchbook() {
		System.out.println("searching for a book");
	}



}
