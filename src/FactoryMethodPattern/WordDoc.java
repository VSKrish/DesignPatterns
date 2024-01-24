package FactoryMethodPattern;

public class WordDoc implements Document {

	@Override
	public void open() {
		System.out.println("opening Word doc");
		
	}

	@Override
	public void close() {
		System.out.println("closing Word doc");
		
	}

	@Override
	public void print() {
		System.out.println("printing Word doc");
		
	}

	@Override
	public DocumentConverter getConverterObject() {
		// TODO Auto-generated method stub
		return new WordConverter();
	}

}
