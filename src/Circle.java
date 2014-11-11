import TurtleGraphics.*;

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
        double side = 2.0*Math.PI*radius/120.0;
        p.up();
        p.move(xpos+radius, ypos-side/2.0);
        p.setDirection(90);
        p.down();
        
        for(int x=0; x<120; x++){
            p.move(side);
            p.turn(3);
        }
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
