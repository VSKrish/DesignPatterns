package DecoratorPattern;

public class DecoratorClient {
	public static void main(String[] args) {
		Coffee c = new ChocoChipsDecorator(
				new SimpleCoffee(
						new SugarDecorator(
								new MilkDecorator(
										new VaniallaDecorator(
												new SimpleCoffee()
												)
										)
								)
						)
				);
		System.out.println("Coffee Price "+c.getPrice());
		System.out.println("Coffee Ingredients "+c.getIngredients());
	}
}
