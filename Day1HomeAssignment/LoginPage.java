package Week3.Day1HomeAssignment;

public class LoginPage extends BasePage{
	public static void main(String[] args) {
		LoginPage lo = new LoginPage();
		lo.findElement();
		lo.clickElement();
		lo.enterText();
		lo.performCommonTasks();
		
	}

	public void performCommonTasks() {
		System.out.println("CommonTasks");
	}
	

}
