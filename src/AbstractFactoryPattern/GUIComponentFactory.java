package AbstractFactoryPattern;

public interface GUIComponentFactory {
	Button createButtonObject();
	TextField createTextFieldObject();
	CheckBox createCheckBoxObject();
}
