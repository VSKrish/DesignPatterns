package FactoryMethodPattern;

public interface Document {
	void open();
	void close();
	void print();
	DocumentConverter getConverterObject();
}
