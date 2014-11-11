import TurtleGraphics.*;
import TerminalIO.*;

public class ShapeMaker {

   
    public static void main(String[] args) {
        
        Shape s;
        Pen p= new WigglePen ();
        s = new Circle(10, 10, 5);
        System.out.println(s);
        s.wave(0,0);
        s.stretchyBy(2);
        System.out.println(s);
        s=new Rect(0,0,50,25);
        System.out.println(s);
        s.draw(p);
    }
    
}
