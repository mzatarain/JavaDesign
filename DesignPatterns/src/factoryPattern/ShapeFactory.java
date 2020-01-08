package factoryPattern;

public class ShapeFactory {
	//Use get shape method to get object of class shape
	public Shape getShape(String shapeType) {
		if(shapeType == null) {
			return null;
		}
		if(shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();			
		}
		if(shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();			
		}
		if(shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();			
		}
		return null;
	}
}
