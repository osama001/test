package abstractareas;;

public class Circle extends Diagram2{
    Circle(double a){
        super(a);
    }
    @Override
    double area() {
        return 3.14*num*num;
    }
}
