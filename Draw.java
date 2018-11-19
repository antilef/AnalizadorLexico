//Panel de Dibujo
import java.awt.*;
import javax.swing.*;
import java.awt.image.BufferStrategy; 
import java.awt.Graphics2D;  

public class Draw extends JFrame {

  //Variables
  boolean debug = true;
  int Dibujar = 0;
  Color colorActual = Color.BLUE;
  private final BufferStrategy bf;  
  int x1 = 20;
  int x2 = 20;
  int x3;
  int y1 = 20;
  int y2 = 20;
  int y3;
  int r;
  int xfix;
  int yfix;

  //Constructor
  public Draw()
  {
    //Tamaño
    int width = 600;
    int height = 400;
    
    //Titulo
    this.setTitle("Draw");
    setSize( width, height );

    //Fondo
    this.setBackground(Color.WHITE);

    //Salir
    this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    setVisible( true );

    //Fix de Area de Dibujo
    Insets insets = this.getInsets();
      int wreal = width - (insets.left + insets.right);
      int hreal = height - (insets.top + insets.bottom);
      xfix = (int)((width - wreal)/2);
      yfix = (int)((height - hreal)- xfix);
      Debug(xfix+" "+yfix);
    System.out.println("Cargando Entorno Grafico...");
    System.out.println("Ingrese Programa:");

    //Doble Buffer
    createBufferStrategy(2);
    bf = this.getBufferStrategy();
    
  }

  public void Debug(String out)
  {
    if(this.debug)    
      System.out.println("Debug: "+out);
  }

  //Cambia el Color
  public void setColor(String color)
  {
    Debug("Color");
    if(color.equals("rojo")) this.colorActual = Color.RED;
    else if(color.equals("verde")) this.colorActual = Color.GREEN;
    else if(color.equals("azul")) this.colorActual = Color.BLUE;
    else if(color.equals("amarillo")) this.colorActual = Color.YELLOW;
    else System.out.println("Error - Color no existe");
    this.repaint();
  }

  //Dibuja una Linea
  public void draw(String direccion, int movimiento)
  {
    Debug("Linea");
    switch (direccion){
      case "arr":
        this.y2 = -1*movimiento;
        this.x2=0;
        break;
      case "aba":
        this.y2 = movimiento;
        this.x2=0;
        break;
      case "der":
        this.x2 = movimiento;
        this.y2=0;
        break;
      case "izq":
        this.x2 = -1*movimiento;
        this.y2=0;
        break;
    }
    this.Dibujar = 1;
    this.repaint();
  }

  public void setPos(int x,int y){
    this.x1=x;
    this.y1=y;
  }


  //Paint Doble Buffer
  @Override  
  public void paint(Graphics g) {  
    Graphics2D g2 = null;  

    try {  
      g2 = (Graphics2D) bf.getDrawGraphics();  

      paint(g2);

      bf.show();  
    }
    catch(Exception e)
    {	
      Debug("Cargando...");
    }

  } 

  public void paint( Graphics2D g2 )
  {
    //Setea el Color
    g2.setColor(this.colorActual);
    //Antialiasing
    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    //Gruesor del borde de las lineas
    g2.setStroke(new BasicStroke(2.0f));

    //Acciones de Dibujar
    switch(this.Dibujar)
    {
      case 1: g2.drawLine(this.x1, this.y1, this.x1+this.x2,this.y1+ this.y2);x1=x1+x2; y1=y1+y2; break;
      case 2: System.out.println("No se puede dibijar ;(");
    }
    this.Dibujar = 0;

  } 

} 