package FactoryMethodPattern;

public class FactoryMethodClient {
	public static void main(String[] args) {
		Document doc = new PDF();
		DocumentConverter converter = doc.getConverterObject();
		converter.convert();
	}
}
