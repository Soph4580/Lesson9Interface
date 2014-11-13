import TurtleGraphics.*;

public class Wheel extends Circle{

	private int spokes;
	public Wheel(){
		super();
		spokes=0;}

public Wheel (double xloc, double yloc, double r, int s){
	super(xloc, yloc, r);
	spokes=0;}

public void draw(Pen p){
	super.draw(p);   //Draws the rim
	//Draw spokes
	for (int i=1; i<=spokes; i++)
{
	p.up();
	p.move(xpos, ypos);
	p.setDirection(i*360/spokes);
	p.down();
	p.move(radius);}
}

public void setSpokes(int s){
spokes=s;}

public String toString(){
	
}
}