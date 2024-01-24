package DecoratorPattern;

public class MilkDecorator implements Coffee {
	Coffee decoratedCoffee = null;
	MilkDecorator(Coffee decoratedCoffee) {
		this.decoratedCoffee = decoratedCoffee;
	}
	
	@Override
	public double getPrice() {
		return decoratedCoffee.getPrice()+5.0;
	}

	@Override
	public String getIngredients() {
		return decoratedCoffee.getIngredients()+", Milk";
	}

}
