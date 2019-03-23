
public class Audio extends File{
	
	private String codec;
	
	private String duration;
	
	public Audio(int size, String codec, String duration) {
		super(size);
		this.codec = codec;
		this.duration = duration;
	}

	public void zip(Compression compressionMethod) {
		System.out.println("Size: " + getSize() + "mb");
		System.out.println("Codec: " + codec);
		System.out.println("Duration: " + duration);
		System.out.println("Audio compression done");
		compressionMethod.compressionMethod();
	}

}
