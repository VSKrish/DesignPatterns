package PrototypePattern;

public class Image implements Element {
	private String source;

    public Image(String source) {
        this.source = source;
    }

    @Override
    public void display() {
        System.out.println("Image: " + source);
    }
}
