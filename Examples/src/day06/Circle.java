package day06;

//extends Object�� �����Ǿ� ����
public class Circle extends Object implements T{
	int r = 3;
	
	
	@Override
	public double area() {
		return Math.PI * r * r;
	}


	@Override
	public void Draw() {
		// TODO Auto-generated method stub
		System.out.println("Circle �׸���");
		
	}


	@Override
	public void color(String color) {
		// TODO Auto-generated method stub
		System.out.println(color+"ĥ�ϱ�");
		
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
		System.out.println("Rectangle �׸���");
	}
	@Override
	public void color(String color) {
		// TODO Auto-generated method stub
		System.out.println(color+"ĥ�ϱ�");
		
	}
	
}
