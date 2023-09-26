class Rectangle {
    private int x;   // �簢���� x��ǥ
    private int y;   // �簢���� y��ǥ
    private int width;   // �簢���� ����	
    private int height;   // �簢���� ����
    
    public Rectangle() {
        x = y = width = height = 0;
    }
    public Rectangle(int x, int y, int width, int height) {
         this.x = x; 
    	 this.y = y; // ��ĭ�� ä��ÿ� , y�� �ʱ�ȭ �Ͻÿ� 
    	 this.width = width;// ��ĭ�� ä��ÿ� , width�� �ʱ�ȭ �Ͻÿ� 
    	 this.height = height;// ��ĭ�� ä��ÿ� , height�� �ʱ�ȭ �Ͻÿ�  
    	 
    	 
    }
    public void draw() {
        System.out.println("Rectangle: " + x + ", " + y + ", "
                            + width + ", " + height);
} 
    public static void main(String args[]) {
        Rectangle r1 = new Rectangle(); // ��ĭ�� ä��ÿ�   // r1�� �����Ѵ�. ������ ������
        Rectangle r2 = new Rectangle(0, 8, 100, 150);// ��ĭ�� ä��ÿ�    // r2(0, 8, 100, 150)�� �����Ѵ�. ����� ������
        
        r1.draw();// ��ü r1�� draw()�� ȣ���Ͻÿ� 
        r2.draw();// ��ü r2�� draw()�� ȣ���Ͻÿ� 
    }	
}