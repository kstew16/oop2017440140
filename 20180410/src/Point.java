
public class Point {
	//Fields
   private double x;
   private double y;
    
   //Methods
   public String toString() {
	   return ("(" + this.x + ", " + this.y + ")");
   }
   public void print() {
	   //System.out.println("(" + this.getX() + ", " + this.getY() + ")");
	   System.out.println("(" + getX() + ", " + getY() + ")");
	   //System.out.println("(" + this.x + ", " + this.y + ")");
   }
      public double distance() {
		double distance; //지역변수의 유효범위는 메소드 내부
		return Math.sqrt(x*x+y*y);
	}
      //method overloading 
      public double distance(Point p) {
    	  return Math.sqrt( (this.x-p.getX())*( this.x-p.getX() ) +              
    			  ( this.y - p.getY() )*( this.y - p.getY() ) ); 

      }

	public double getX() {
	return x;
   }
   public void setX(double x) {
	this.x = x;
   }
   public double getY() {
	return y;
   }
   public void setY(double y) {
	this.y = y;
   }
   

	

}
