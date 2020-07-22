package list;

interface Shape{
	public abstract void Draw();
	}

class Circle implements Shape{
	public void Draw(){
		System.out.println("Circle shape drawn");
	}
}

 class Square implements Shape{
	public void Draw(){
		System.out.println("Square shape drawn");
	}
}


class Rectangle implements Shape{
	public void Draw(){
		System.out.println("Rectnagle shape drawn");
	}
}

public class FactoryPattern{
public static void main(String args[]) {
	Square s=new Square();
	s.Draw();
	
	Circle c=new Circle();
	c.Draw();
	
	Rectangle r=new Rectangle();
	r.Draw();
}
	
}
