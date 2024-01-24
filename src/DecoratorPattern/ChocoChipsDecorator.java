package DecoratorPattern;

public class ChocoChipsDecorator implements Coffee {

	Coffee decoratedCoffee = null;
	ChocoChipsDecorator(Coffee decoratedCoffee) {
		this.decoratedCoffee = decoratedCoffee;
	}
	
	@Override
	public double getPrice() {
		return decoratedCoffee.getPrice()+4.0;
	}

	@Override
	public String getIngredients() {
		return decoratedCoffee.getIngredients()+", Choco Chips";
	}

}