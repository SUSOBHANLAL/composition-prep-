package newpackage;

class Branch {
	String branchname;
	private Session session;

	public Branch(String branchname, Session session) {
		super();
		this.branchname = branchname;
		this.session = session;
	}

	public String getBranchname() {
		return branchname;
	}

	public void setBranchname(String branchname) {
		this.branchname = branchname;
	}

	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}
	
	



}
