
//import spock.lang.Stepwise;
import geb.Browser
import geb.Page
import org.junit.Test
import geb.spock.GebReportingSpec
//@Stepwise
class SignUpSpec extends GebReportingSpec {
	def "sign up with blank username and password"(){

		given: "I'm at the sign up form"
		to SignUpPage

		when: "I signup as an invalid user"
		submitButton.click(SignUpPage)

		then: "I'm at the sign up page again "
		errorHeading == "Password can't be blank"
	}

	def "sign up with valid username and password"(){

		given: "I'm at the sign up form"
		to SignUpPage

		when: "I signup as an invalid user"
		nickname = "Nhung Nguyen 2"
		username = "nhungNguyen1"
		email    = "hikarushindou001@gmail.com"
		password = "framgia001"
		passwordConfirm = "framgia001"
		submitButton.click()

		then: "I'm at the sign up page again "
		at DashboardPage
	}
}