package abstractareas;

public class AbstractAreas {
    public static void main(String[] args) {
        Circle c = new Circle(11.5);
        Square s = new Square(4.5);
        Diagram2 d;
        d = c;
        System.out.println("Area is "+d.area());
        d = s;
        System.out.println("Area is "+d.area());
    }
}
