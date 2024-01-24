package DecoratorPattern;

public class SimpleCoffee implements Coffee {
	Coffee decoratedCoffee = null;
	SimpleCoffee() {
		
	}
	SimpleCoffee(Coffee decoratedCoffee) {
		this.decoratedCoffee = decoratedCoffee;
	}
	
	@Override
	public double getPrice() {
		if(decoratedCoffee!=null)
			return decoratedCoffee.getPrice()+3.0;
		return 10.0;
	}

	@Override
	public String getIngredients() {
		if(decoratedCoffee!=null)
			return decoratedCoffee.getIngredients()+", Coffee";
		return "Coffee";
	}

}
