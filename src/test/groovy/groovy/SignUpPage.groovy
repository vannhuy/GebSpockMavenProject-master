
import geb.Page

class SignUpPage extends Page {
	
	static url = "/users/new"
	static content = {
		// Get err tag when login fail
		errorHeading { $(".alert-error").text() }
		// Get login form
		signUpForm { $("form[id=new_user]") }
		nickname { $("input[id=user_name") }
		username { $("input[id=user_username") }
		email { $("input[id=user_email") }
		password { $("input[id=user_password") }
		passwordConfirm { $("input[id=user_password_confirmation") }
//		submitButton{ signUpForm.find("input", name: "commit") }
		submitButton(to: DashboardPage) { $("button[type=submit]") }
	}
}