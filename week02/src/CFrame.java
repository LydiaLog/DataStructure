
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
	    private int x;   // 사각형의 x좌표
	    private int y;   // 사각형의 y좌표
	    private int width;   // 사각형의 가로	
	    private int height;   // 사각형의 세로

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
	      // 윈도우에 좌측 상단이 (50,50)이고 폭이 width, 높이가 height pixels인 사각형을 그리는 메소드를 정의하라.   		   	   		   	   		   
	   	  //	
		}
   } // End of Rectangle
     
       public void paint(Graphics g){
        r1.draw();  
        // 윈도우에 폭이 100, 높이가 150 pixels인 사각형을 그려아 
       }
 } // End of CApp() 
  
 public class CFrame {
	  public static void main(String[] args) {
		   new CApp();
	  }
  }  
