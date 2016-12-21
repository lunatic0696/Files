package domain;

public class Rectangle {
	public double width;
	public double height;
	public Point origem;

	public double area() {
		double area = width * height;
		return area;
	}
	
	public double perimeter(){
		return 2*this.width + 2*this.height;
	}
	
	public boolean contains(Rectangle rect2){
		if (rect2.origem.x > this.origem.x && rect2.origem.x < this.origem.x + this.width && ){
			
		} 
	}

}
