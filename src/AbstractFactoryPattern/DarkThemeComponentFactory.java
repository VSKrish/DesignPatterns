package AbstractFactoryPattern;

public class DarkThemeComponentFactory implements GUIComponentFactory {

	@Override
	public Button createButtonObject() {
		return new DarkThemeButton();
	}

	@Override
	public TextField createTextFieldObject() {
		return new DarkThemeTextField();

	}

	@Override
	public CheckBox createCheckBoxObject() {
		return new DarkThemeCheckBox();

	}

}
