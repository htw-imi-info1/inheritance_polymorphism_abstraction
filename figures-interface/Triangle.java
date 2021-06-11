import java.awt.*;
import java.awt.*;

public class Triangle implements Shape
{
    int x = 100;
    int y = 100;
    @Override
    public void move(int x, int y){
        //   erase();
        this.x += x;
        this.y += y;
        display();
    }

    @Override
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
