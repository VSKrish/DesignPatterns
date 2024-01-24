package FactoryMethodPattern;

public class PDF implements Document{

	@Override
	public void open() {
		System.out.println("opening pdf doc");
		
	}

	@Override
	public void close() {
		System.out.println("closing pdf doc");
		
	}

	@Override
	public void print() {
		System.out.println("printing pdf doc");
		
	}

	@Override
	public DocumentConverter getConverterObject() {
		// TODO Auto-generated method stub
		return new PDFConverter();
	}

}
