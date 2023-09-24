package Week3.Day1HomeAssignment;

public class BasePage {
	public void findElement() {
		System.out.println("findElement");
		
	}
	public void clickElement() {
	System.out.println("clickElement");

	}
	public void enterText() {
		System.out.println("enterText");
		
	}
	public void performCommonTasks() {
		System.out.println("performCommonTasks");
		
	}
	public static void main(String[] args) {
		BasePage lo = new BasePage();
		lo.findElement();
		lo.clickElement();
		lo.enterText();
		lo.performCommonTasks();
	}
}
