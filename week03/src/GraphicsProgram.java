
import java.awt.*;
abstract class Shape
 {
    protected Color color;
    protected int     m_x;
    protected int     m_y;

    public Shape(Color c,int x,int y)
    {
       color = c;  //color
       m_x   = x;  //x 
       m_y   = y;  //y
    }   
	//�����Լ�
    abstract public void draw();
 }
//���
class CRectangle extends Shape
{
   private int width;
   private int height;
   public CRectangle(Color c,int x,int y,int width,int height)
   {
       super(c,x,y);
	   this.width  =  width;
	   this.height = height;
   }  
   public void draw()
   {
     System.out.println("Rectangle :" + m_x + ", " + m_y + ", " + width + ", " 
                         + height );     
   }
};
//���
class Circle extends Shape
{
   private int radius;
   public Circle(Color c,int x,int y,int radius)
   {
      super(c,x,y);
  	  this.radius = radius;
   }

   public void draw()
   {
      System.out.println("Circle" + " : "+ m_x + ", " + m_y + ", " + radius);     
   }
};


public class GraphicsProgram
{
   public  static void main(String args[])
   {
      Shape s1 = new CRectangle(Color.red, 0, 5, 200, 300);   
      Shape s2 = new Circle(Color.green, 10, 30, 100); // ��ĭ�� ä����. s2�� Circle�� �����϶�. ����̰�, ���� �߽��� (10, 30)�̰� �������� 100 �̴�. 
      Shape s3 = new Triangular(Color.gray, 10, 10, 0, 20, 20, 20); //�ﰢ�� �����

	  s1.draw();
	  s2.draw();
	  s3.draw();
   }
};
class Triangular extends Shape
{
	private int x1, y1, x2, y2;
	public Triangular(Color c, int x, int y, int x1, int y1, int x2, int y2) { 
		super(c, x, y);
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	public void draw() {
		System.out.println("Triangular" + " : " + m_x + ", " + m_y + ", " + x1 + ", " + y1 + ", " + x2 + ", " + y2);
	}
};




