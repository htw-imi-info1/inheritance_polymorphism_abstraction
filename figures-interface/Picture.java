
import java.util.*;
public class Picture
{

    List<Shape> shapes;
    
    public Picture()
    {
        init();
    }

    public void init(){
        shapes = new ArrayList<>();
        Shape c1 = new Circle();
        c1.move(30,30);
        shapes.add(c1);
        Circle c2 = new Circle();
        shapes.add(c2);
        Triangle t = new Triangle();
        shapes.add(t);

    }

    public void display(){
        for (Shape s : shapes){
            s.display();
        }
    }

    public void moveAll(){
        for (Shape s : shapes){
            s.move(30,40);
        }
    }
}
