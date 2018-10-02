package day06;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle();
		Rectangle r= new Rectangle();
		
		T s = c;
		s.Draw();
		((Colorable)s).color("RED");
		
		T[] t= {r,c};
		for(int i =0; i<t.length;i++) {
			t[i].Draw();
			t[i].color("yellow");
			System.out.println(t[i].area());
		}
	}

}
