package day05;

public class InheritanceTest04 {
	public static void main(String[] args) {
		
		// ¸Ş¼Òµå ¿À¹ö¶óÀÌµù
		Animal f = new Fish("ÄíÄí");
		f.breath();
		
		if(f instanceof Dog) {
			((Dog)f).print();
		}
		if(f instanceof Fish) {
			((Fish)f).print();
		}
		Fish f2 = new Fish("ÄíÄí");
		f2.print();
		
		System.out.println("----------");
		Animal[] animals = {
			new Fish("ÄíÄí"),
			new Fish("ÄíÄí"),
			new Dog("Áøµ¾°³", "ÂĞÂĞ")
		};
		
		
		// for(int i=0; i<animals.length;i++)
		for(Animal data : animals) {
			
			data.breath();
			if(data instanceof Dog) {
				((Dog)data).print();
			}
			data.print();
			
		}
		
		
		
	}
}
