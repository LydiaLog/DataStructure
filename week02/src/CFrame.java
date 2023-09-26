
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

class CApp extends JFrame {
  public Rectangle r1 = new Rectangle(50,50,100,150);
  
  CApp() {
	  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  this.setLocationRelativeTo(null);
	  this.setSize(500,500);
	  this.setVisible(true);
  }
  
  class Rectangle extends JPanel{
	    private int x;   // �簢���� x��ǥ
	    private int y;   // �簢���� y��ǥ
	    private int width;   // �簢���� ����	
	    private int height;   // �簢���� ����

	    public Rectangle() {
	        x = y = width = height = 0;
	    }
	    public Rectangle(int x, int y, int width, int height) {
	        this.x = x;   this.y = y;   
	        this.width = width;   this.height = height;
	    }
	
	    public void draw() {
	        System.out.println("Rectangle: " + x + ", " + y 
	        		           + ", "+ width + "," + height);
	    } 
	
	    public void draw(Graphics g)
	    {
	       g.setColor(Color.RED);
	      // �����쿡 ���� ����� (50,50)�̰� ���� width, ���̰� height pixels�� �簢���� �׸��� �޼ҵ带 �����϶�.   		   	   		   	   		   
	   	  //	
		}
   } // End of Rectangle
     
       public void paint(Graphics g){
        r1.draw();  
        // �����쿡 ���� 100, ���̰� 150 pixels�� �簢���� �׷��� 
       }
 } // End of CApp() 
  
 public class CFrame {
	  public static void main(String[] args) {
		   new CApp();
	  }
  }  
