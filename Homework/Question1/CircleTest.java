public class CircleTest {
    public static void main(String[] args) {
       
        Circle circle1 = new Circle();
        System.out.println("First Circle (Default Constructor):");
        System.out.println("Area : " + circle1.calculateArea());
        System.out.println("Circumference: " + circle1.calculateCircumference());
        System.out.println();

        
        Circle circle2 = new Circle(5.0);
        System.out.println("Second Circle (Smart Constructor):");
        System.out.println("Area: " + circle2.calculateArea());
        System.out.println("Circumference: " + circle2.calculateCircumference());
    }
} 