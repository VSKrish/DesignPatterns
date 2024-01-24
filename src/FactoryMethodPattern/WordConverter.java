package FactoryMethodPattern;

public class WordConverter implements DocumentConverter {

	@Override
	public void convert() {
		System.out.println("converting to word document");

	}

}
