import TurtleGraphics.*;

public interface Shape {
    public double area();
    public void draw(Pen p);
    public double xpos();
    public double ypos();
    public void wave(double xloc, double yloc);
    public void stretchyBy(double factor);
    public String toString();
    
    
}
