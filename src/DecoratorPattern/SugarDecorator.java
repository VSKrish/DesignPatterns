package DecoratorPattern;

public class SugarDecorator implements Coffee {

	Coffee decoratedCoffee = null;
	SugarDecorator(Coffee decoratedCoffee) {
		this.decoratedCoffee = decoratedCoffee;
	}
	
	@Override
	public double getPrice() {
		return decoratedCoffee.getPrice()+2.0;
	}

	@Override
	public String getIngredients() {
		return decoratedCoffee.getIngredients()+", Sugar";
	}

}
