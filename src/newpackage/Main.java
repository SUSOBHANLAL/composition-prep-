package newpackage;

class Main {

	
	public static void main(String[] args) {
		
		
		Student s1 = new Student("susobhan ");
		Session session1 = new Session("b",s1) ;// or we can  give as new student(value)
		 Floor  flor1 = new Floor (9,89.0000);
		 Library l1= new Library("bidyabhavan","2011","789",flor1);
		 Branch bech1 = new Branch("cse",session1);
		college  colleg1= new college ("sri krishna institute of technology",l1,bech1);
		 university  uni1 = new  university ("vtu",colleg1);
		 
		 //
		 uni1.getCollege(). getLibrary().searchbook();// here university ka andar college () , college ka andar  library, library ka andar  ha searchbook meethod 

		 

	}

}
