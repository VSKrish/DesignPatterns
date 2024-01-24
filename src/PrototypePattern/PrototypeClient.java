package PrototypePattern;

public class PrototypeClient {
	public static void main(String[] args) {
		ComplexDocument doc = new ComplexDocument();
		doc.addElement(new Paragraph("Paragraph1"));
		doc.addElement(new Paragraph("Paragraph2"));
		doc.addElement(new Paragraph("Paragraph3"));
		doc.addElement(new Image("src"));
		
		ComplexDocument clonedDoc = doc.cloneDocument();
		System.out.println(doc+" "+clonedDoc);
		System.out.println(doc.list);
		System.out.println(clonedDoc.list);
	}
}
