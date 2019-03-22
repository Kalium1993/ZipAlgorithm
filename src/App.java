
public class App {
	public static void main(String[] args) {
		Audio music = new Audio(2, "mp3", "5:55");
		Text text = new Text(89, 12);
		Image image = new Image(3, 1920, 1080);
		
		Compression zip = new Zip();
		Compression zip7 = new Zip7();
		Compression rar = new Rar();
		
		music.zip(rar);
		text.zip(zip7);
		image.zip(zip);
	}
}
