
public class Text extends File{
	
	private int fontSize;

	public Text(int size, int fontSize) {
		super(size);
		this.fontSize = fontSize;
	}

	public void zip(Compression compressionMethod) {
		System.out.println("Size: " + getSize() + "kb");
		System.out.println("Font Size: " + fontSize);
		System.out.println("Text compression done");
		compressionMethod.compressionMethod();
	}

}
