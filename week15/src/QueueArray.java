interface Queue
{
 boolean isEmpty();
 void enqueue(Object x);
 Object dequeue();
 void remove();
 Object peek();
}

class ArrayQueue implements Queue
{
 public int front;	//ť�� ���� ���
 public int rear;	//ť�� ���� ���
 public int count;	//ť�� ���� ��
 public int queueSize;	//ť��(�迭) ũ��
 public int increment;	//�迭 Ȯ����� �迭�� ũ��
 public Object[] itemArray;	//��ü Ÿ���� ť ���Ҹ� ���� �迭

 public ArrayQueue()	//������ ť ������
 {
	front = 0;
	rear = 0;
	count = 0;
	queueSize = 50;		//�ʱ�ȭ ť�� ũ��
	increment = 10;		//�迭�� Ȯ�� ����
	itemArray = new Object[queueSize];
 }

 public boolean isEmpty()
 {
	  return (count==0);
 }
 
 public void enqueue(Object x)	//ť�� ���ο� ���� ����
 {
	if(count == queueSize) queueFull();		//���Ұ� �� �u�� ��
	itemArray[rear]= x;						//���ο� ���� ����
	rear = (rear+1)%queueSize;
	count++;
 }

 public void queueFull()	//�迭�� ������ ��
 {
	int oldsize = queueSize;	//������ �迭 ũ�⸦ ���
	queueSize += increment;		//���ο� �迭 ũ��
	Object[] tempArray = new Object[queueSize];	//Ȯ��� ũ���� �ӽ� �迭
	for(int i=0; i<count; i++)	//�ӽ� �迭�� ���Ҹ� �̵���Ų��
	{
		tempArray[i] = itemArray[front];
		front = (front + 1) % oldsize;
	}
	itemArray = tempArray;
	front = 0;
	rear = count;
 }

 public Object dequeue()		//ť���� ���Ҹ� �����ϰ� ��ȯ�Ѵ�
 {
	if(isEmpty()) return null;
	Object item = itemArray[front];	//ť�� ������ �ƴ� ��
	front = (front + 1) % queueSize;
	count--;
	return item;
 }

 public void remove()
 {
	if(isEmpty()) return;
	else count--;
 }

 public Object peek()	//ť���� ���� ���� ��ȯ
 {
	if(isEmpty()) return null;
	else return itemArray[front];
 }	
}

public class QueueArray
{

 public static void main(String args[])	
 {
	int i;
//	Queue Q = new Queue();      // error !!!
	ArrayQueue Q = new ArrayQueue();

	System.out.print("Queue�� �����ϴ� �͵� :");
	for(i=0; i<10; i++)
	{
		Integer data = new Integer(i);
		System.out.print(data + " ");
		Q.enqueue(data);
//		Q.enqueue(i);			// error !!!
	}
	System.out.println("\n Queue���� �����ϴ� �͵� :");
	for(i=0; i<10; i++)
	{
		System.out.println(Q.dequeue() + " ");
/*
		if (!Q.isEmpty())
		{
			System.out.println(" not empty ");
		}
*/
	}
  
  //System.out.println();
 } // end of main

} // end of QueueArray

