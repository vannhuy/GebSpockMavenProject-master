import geb.Page

class DashboardPage extends Page {
	 
	
		static at = { header.text() == "Definition of test noun from the Oxford Advanced Learner's Dictionary" }
	
		static content = {
	
			header { $((".definition-title") )}
	

	}

}