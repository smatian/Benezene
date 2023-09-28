import gpdraw.*;
public class benzene{
    public static void main (String[] args) {
        DrawingTool pen; //name an object
        SketchPad poster;
       
        poster = new SketchPad(500,500);
        pen = new DrawingTool(poster);
        //hexagon
    pen.up();
    pen.move(0,200);
    pen.down();
    pen.move(173.2,100);
    pen.move(173.2,-100);
    pen.move(0,-200);
    pen.move(-173.2,-100);
    pen.move(-173.2,100);
    pen.move(0,200);
    pen.up();
   
    //circle
    pen.move(0,0);
    pen.down();
    pen.drawCircle(132);
}
}
