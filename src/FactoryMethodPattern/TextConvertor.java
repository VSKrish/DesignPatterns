package FactoryMethodPattern;

public class TextConvertor implements DocumentConverter{

	@Override
	public void convert() {
		System.out.println("converting to text document");
		
	}

}
