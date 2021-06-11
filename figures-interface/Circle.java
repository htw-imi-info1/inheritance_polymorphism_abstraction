import java.awt.*;
import java.awt.geom.*;
public class Circle implements Shape
{
    int x,y;

    @Override
    public void move(int x, int y){
        erase();
        this.x += x;
        this.y += y;
        display();
    }

    @Override
    public void display(){
        String color = "red";
        int diameter = 50;
        Canvas canvas = Canvas.getCanvas();
        canvas.draw(this, color, new Ellipse2D.Double(x, y, 
                diameter, diameter));
        canvas.wait(10);

    }

    private void erase()
    {
        Canvas canvas = Canvas.getCanvas();
        canvas.erase(this);

    }
}
