
public class Image extends File{

	private int width;
	
	private int height;

	public Image(int size, int width, int height) {
		super(size);
		this.width = width;
		this.height = height;
	}
	
	public void zip(Compression compressionMethod) {
		System.out.println("Size: " + getSize() + "mb");
		System.out.println("Width: " + width + "px");
		System.out.println("Height: " + height + "px");
		System.out.println("Image compression done");
		compressionMethod.compressionMethod();
	}
}
