package PrototypePattern;

public interface Document {
	Document cloneDocument();
	void addElement(Element element);
	void display();
}
