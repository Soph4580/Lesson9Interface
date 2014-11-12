import TurtleGraphics.*;
import TerminalIO.*;
import java.awt.Color;

public class ShapeMaker {

   
    public static void main(String[] args) {
        
       Pen p = new StandardPen(new SketchPadWindow (400,400));
       Shape s1;
       double x, y, r;
       double l, w;
       int choice;
       KeyboardReader kr = new KeyboardReader();
       
       //Choose circle or rectangle
       while (true){
           choice= kr.readInt("Enter 1 for a rectangle or 2 for a circle: ");
           if (choice==1||choice==2)break;
       }
       if(choice==1){
           w= kr.readDouble ("Enter the width of the rectangle: ");
           l= kr.readDouble ("Enter the height of the rectangle: ");
           s1= new Rect(0,0,w,l);
       }
       else{
           r= kr.readDouble ("ENter the radius of the circle: ");
           s1= new Circle(0,0,r);
       }
       
       while(true){
           s1.draw(p);
           x= kr.readDouble("New x: ");
           y= kr.readDouble("New y: ");
           //Erase & move
           p.setColor(Color.white);
           s1.draw(p);
           s1.wave(x, y);
           p.setColor(Color.BLUE);
           s1.draw(p);
           
       }
    }
    
}
