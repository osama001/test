package abstractareas;

public class Square extends Diagram2{
    Square(double a){
        super(a);
    }
    @Override
    double area() {
        return num*num;
    }
}
