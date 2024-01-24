package AbstractFactoryPattern;

public class LightThemeComponentFactory implements GUIComponentFactory {

	@Override
	public Button createButtonObject() {
		return new LightThemeButton();
	}

	@Override
	public TextField createTextFieldObject() {
		return new LightThemeTextField();

	}

	@Override
	public CheckBox createCheckBoxObject() {
		return new LightThemeCheckBox();

	}

}
