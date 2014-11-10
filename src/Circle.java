
import TurtleGraphics.Pen;

public class Circle implements Shape {

     private double xpos, ypos, radius;
   
    public Circle(){
    xpos=0;
    ypos=0;
    radius=1;
    }
    
    public Circle(double x, double y, double r)
    {
        xpos=x;
        ypos=y;
        radius=r;
    }
     
    
     public double area() {
        return Math.PI*radius*radius;
    }

    
    public void draw(Pen p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public double xpos() {
        return xpos;
    }

    
    public double ypos() {
      return ypos;
    }

    
    public void wave(double xloc, double yloc) {
          xpos= xloc;
            ypos= yloc;
    }

    public void stretchyBy(double factor) {
       radius*=factor;
    }
    public String toString(){
        String str = "This is a CIRCLE\n";
        str+="XLOC: " + xpos + "\tYLOC: " + ypos + "\n";
        str+="Radius: " + radius + "\n";
        str+="Area: " + area();
        return str;
    }
    
}
