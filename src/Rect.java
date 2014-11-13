import TurtleGraphics.Pen;

public class Rect implements Shape {
    
    private double xpos, ypos, width, length;
    
    public Rect(){
    xpos=0;
    ypos=0;
    width=1;
    length=1;
    }
    
    public Rect(double x, double y, double w, double l)
    {
        xpos= x;
        ypos= y;
        width= w;
        length= l;
    }
    
    public double area() {
        return width*length;
    }

   
    public void draw(Pen p) {
        p.up();
        p.move(xpos, ypos);
        p.down();
        p.setDirection(0);
        p.move(width);
        p.turn(-90);
        p.move(length);
        p.turn(-90);
        p.move(width);
        p.turn(-90);
        p.move(length);
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
       length*=factor;
       width*=factor;
    }
    public String toString(){
        String str = "This is a RECTANGLE\n";
        str+="XLOC: " + xpos + "\tYLOC: " + ypos + "\n";
        str+="Width: " + width + "\nHeight: " + length + "\n";
        str+="Area: " + area();
        return str;
    }
    
}
