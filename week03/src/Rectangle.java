class Rectangle {
    private int x;   // 사각형의 x좌표
    private int y;   // 사각형의 y좌표
    private int width;   // 사각형의 가로	
    private int height;   // 사각형의 세로
    
    public Rectangle() {
        x = y = width = height = 0;
    }
    public Rectangle(int x, int y, int width, int height) {
         this.x = x; 
    	 this.y = y; // 빈칸을 채우시오 , y를 초기화 하시오 
    	 this.width = width;// 빈칸을 채우시오 , width를 초기화 하시오 
    	 this.height = height;// 빈칸을 채우시오 , height를 초기화 하시오  
    	 
    	 
    }
    public void draw() {
        System.out.println("Rectangle: " + x + ", " + y + ", "
                            + width + ", " + height);
} 
    public static void main(String args[]) {
        Rectangle r1 = new Rectangle(); // 빈칸을 채우시오   // r1을 생성한다. 묵시적 생성자
        Rectangle r2 = new Rectangle(0, 8, 100, 150);// 빈칸을 채우시오    // r2(0, 8, 100, 150)을 생성한다. 명시적 생성자
        
        r1.draw();// 객체 r1의 draw()를 호출하시오 
        r2.draw();// 객체 r2의 draw()를 호출하시오 
    }	
}