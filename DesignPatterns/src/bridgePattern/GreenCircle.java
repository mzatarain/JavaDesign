package bridgePattern;

public class GreenCircle implements DrawAPI{
	@Override
	public void drawCircle(int radius, int x, int y) {
		System.out.println("Drawing circle[ color: Green, radius: " + radius + "x: " + x + "y: " + y);
	}
}
