import java.applet.Applet;
import java.awt.Graphics;

public class helloWorld extends Applet
{
   public void paint (Graphics g)
   {
      g.drawString ("Hello World", 150, 150);
   }
}
/*
public static main(argv[]){

    HelloWorldApplet hello = new HelloWorldApplet();

    Graphics g = new Graphics();

    hello.paint(g);
}
*/