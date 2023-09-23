package Week3.Day1HomeAssignment;

public class LoginTestData extends TestData {
	public void enterUsername() {
		System.out.println("enterUsername :");
		
	}
	public void enterPassword() {
		System.out.println("enterPassword :");
		
	}
	public static void main(String[] args) {
		LoginTestData myLoginTestData = new LoginTestData();
		myLoginTestData.enterCredentials();
		myLoginTestData.navigateToHomePage();
		myLoginTestData.enterUsername();
		myLoginTestData.enterPassword();
	}

}
