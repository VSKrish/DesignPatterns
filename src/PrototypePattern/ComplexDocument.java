package PrototypePattern;

import java.util.ArrayList;
import java.util.List;

public class ComplexDocument implements Document {
	List<Element> list = null;
	ComplexDocument() {
		list = new ArrayList<>();
	}
	ComplexDocument(ComplexDocument doc) {
		//shallow copy
		this.list=new ArrayList<>(doc.list);
	}
	
	@Override
	public ComplexDocument cloneDocument() {
		return new ComplexDocument(this);
	}

	@Override
	public void addElement(Element element) {
		list.add(element);
	}

	@Override
	public void display() {
		System.out.println("display elements "+list);
	}

}
