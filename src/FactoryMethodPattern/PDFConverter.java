package FactoryMethodPattern;

public class PDFConverter implements DocumentConverter {

	@Override
	public void convert() {
		System.out.println("converting to PDF document");

	}

}
