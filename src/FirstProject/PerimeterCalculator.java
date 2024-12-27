package FirstProject;

class Rectangle{
	
	private int length;
	private int breadth;
	
	public int getLength() {
		return length;	
	}
	
	public void setLenth(int length) {
		this.length = length;
	}
	
	public int getBreadth() {
		return breadth;	
	}
	
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	
	public void calculatePerimeter() {
		System.out.println( 2*(length + breadth));
		
	}
}
public class PerimeterCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Rectangle r = new Rectangle();
		
		r.setLenth(20);
		r.setBreadth(30);
		System.out.println(r.getLength());
		System.out.println(r.getBreadth());
		r.calculatePerimeter();
	}

}
