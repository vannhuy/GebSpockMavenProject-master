import geb.Page

class LoginPage extends Page {

	static url = "/signin"

	//	static at = { header.text() == "Ä�Äƒng nháº­p Facebook" }
	static content = {
		//		header { $(".uiHeaderTitle") }
		errorHeading { $(".alert-error").text() }

		loginForm { $("form") }
		username { $("input[id=session_mail_or_name]") }
		password { $("input[id=session_password]") }
		submitButton{ loginForm.find("input", name: "commit") }


	}
}