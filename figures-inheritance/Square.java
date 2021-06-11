import java.awt.*;
public class Square extends Shape
{
    @Override
    public void display(){
        int size = 50;
        String color = "yellow";
         Canvas canvas = Canvas.getCanvas();
            canvas.draw(this, color,
                        new Rectangle(x, y, size, size));
            canvas.wait(10);
        }
}
