public class Circle {
   private  double radius;

    
    public Circle() {
        this(10.0); 
    
 }
    public Circle(double radius) {
        this.radius = radius;
    }

    
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
     }

