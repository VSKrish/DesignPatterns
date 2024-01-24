package DecoratorPattern;

public class VaniallaDecorator implements Coffee {

	Coffee decoratedCoffee = null;
	VaniallaDecorator(Coffee decoratedCoffee) {
		this.decoratedCoffee = decoratedCoffee;
	}
	
	@Override
	public double getPrice() {
		return decoratedCoffee.getPrice()+2.0;
	}

	@Override
	public String getIngredients() {
		return decoratedCoffee.getIngredients()+", Vanialla";
	}

}