package day06;

public interface Shape {
	public abstract double area();

}

interface Colorable {
	public void color(String color);
}

interface Drawble {
	public void Draw();
}

interface T extends Shape, Colorable, Drawble{
	
}