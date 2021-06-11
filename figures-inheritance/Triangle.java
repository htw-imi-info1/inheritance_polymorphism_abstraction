import java.awt.*;
public class Triangle extends Shape
{

    //@Override
    public void display(){

        String color = "blue";
        int width = 50;
        int height = 50;

        Canvas canvas = Canvas.getCanvas();
        int[] xpoints = { x, x + (width/2), x - (width/2) };
        int[] ypoints = { y, y + height, y + height };
        canvas.draw(this, color, new Polygon(xpoints, ypoints, 3));
        canvas.wait(10);

    }
}
