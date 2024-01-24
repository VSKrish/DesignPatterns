package AbstractFactoryPattern;

public class AbstractFactoryClient {
	public static void main(String[] args) {
		GUIComponentFactory factory = new LightThemeComponentFactory();
		Button button =factory.createButtonObject();
		button.display();
		factory = new DarkThemeComponentFactory();
		factory.createButtonObject().display();
		factory.createCheckBoxObject().display();
		factory.createTextFieldObject().display();
	}
}
