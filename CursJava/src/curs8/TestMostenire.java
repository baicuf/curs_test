package curs8;

public class TestMostenire {

	public static void main(String[] args) {
		
		
//		Angajat --> Tester --> TesterAutomat
//		2 var          2 var          1 var
//		cu mostenire
//		2 var          4 var          5 var
		
		TesterAutomat tester = new TesterAutomat();
		tester.setProgramingLanguage("Java"); // clasa TesterAutomat()
		tester.setSeniority("Senior"); // clasa Tester()
		tester.setDepartament("QA"); // clasa Tester()
		tester.setEmail("ion@ion.com"); // clasa Angajat()
		tester.setNume("Ion"); // clasa Angajat()
		tester.setAngajatID(124); // clasa Angajat()

	}

}
