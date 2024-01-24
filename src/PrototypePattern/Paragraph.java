package PrototypePattern;

public class Paragraph implements Element {

	private String content;

    public Paragraph(String content) {
        this.content = content;
    }

    @Override
    public void display() {
        System.out.println("Paragraph: " + content);
    }

}
