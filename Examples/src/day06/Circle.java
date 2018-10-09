package day06;

//extends Object는 생략되어 있음
public class Circle extends Object implements T{
	int r = 3;
	
	
	@Override
	public double area() {
		return Math.PI * r * r;
	}


	@Override
	public void Draw() {
		// TODO Auto-generated method stub
		System.out.println("Circle 그리기");
		
	}


	@Override
	public void color(String color) {
		// TODO Auto-generated method stub
		System.out.println(color+"칠하기");
		
	}
}

class Rectangle implements T{
	int w = 7;
	int h = 3;
	@Override
	public double area() {
		return w*h;
	}
	@Override
	public void Draw() {
		// TODO Auto-generated method stub
		System.out.println("Rectangle 그리기");
	}
	@Override
	public void color(String color) {
		// TODO Auto-generated method stub
		System.out.println(color+"칠하기");
		
	}
	
}
