import java.awt.*;
import java.awt.geom.*;
public class Circle extends Shape
{
  

   // @Override
    public void display(){
        String color = "red";
        int diameter = 50;
        Canvas canvas = Canvas.getCanvas();
        canvas.draw(this, color, new Ellipse2D.Double(x, y, 
                diameter, diameter));
        canvas.wait(10);

    }


}
