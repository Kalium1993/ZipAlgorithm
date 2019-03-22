
public abstract class File {
	private int size;
	
	public File(int size) {
		this.size = size;
	}

	public int getSize() {
		return size;
	}
	
	public abstract void zip(Compression compressionMethod);
}
