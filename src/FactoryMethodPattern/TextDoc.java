package FactoryMethodPattern;

public class TextDoc implements Document {

	@Override
	public void open() {
		System.out.println("opening text doc");
		
	}

	@Override
	public void close() {
		System.out.println("closing text doc");
		
	}

	@Override
	public void print() {
		System.out.println("printing text doc");
		
	}

	@Override
	public DocumentConverter getConverterObject() {
		// TODO Auto-generated method stub
		return new TextConvertor();
	}

}
