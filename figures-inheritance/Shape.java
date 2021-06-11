

public abstract class Shape
{
    int x, y;
  
    public void move(int x, int y){
        this.x += x;
        this.y += y;
        display();
    }
    
   abstract public void display();

}
