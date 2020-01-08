package adapterPattern;

public class Mp4Player implements AdvancedMediaPlayer{
	@Override
	public void playVlc(String fileName) {
		//do nothing
	}
	
	public void playMp4(String fileName) {
		System.out.println("Playing MP4 file. File name: " + fileName);
	}
}	
