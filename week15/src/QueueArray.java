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
 public int front;	//큐의 삭제 장소
 public int rear;	//큐의 삽입 장소
 public int count;	//큐의 원소 소
 public int queueSize;	//큐의(배열) 크기
 public int increment;	//배열 확장시의 배열의 크기
 public Object[] itemArray;	//객체 타입의 큐 원소를 위한 배열

 public ArrayQueue()	//무인자 큐 생성자
 {
	front = 0;
	rear = 0;
	count = 0;
	queueSize = 50;		//초기화 큐의 크기
	increment = 10;		//배열의 확장 단위
	itemArray = new Object[queueSize];
 }

 public boolean isEmpty()
 {
	  return (count==0);
 }
 
 public void enqueue(Object x)	//큐에 새로운 원소 삽입
 {
	if(count == queueSize) queueFull();		//원소가 꽉 촸을 때
	itemArray[rear]= x;						//새로운 원소 삽입
	rear = (rear+1)%queueSize;
	count++;
 }

 public void queueFull()	//배열이 만원일 때
 {
	int oldsize = queueSize;	//현재의 배열 크기를 기록
	queueSize += increment;		//새로운 배열 크기
	Object[] tempArray = new Object[queueSize];	//확장된 크기의 임시 배열
	for(int i=0; i<count; i++)	//임시 배열로 원소를 이동시킨다
	{
		tempArray[i] = itemArray[front];
		front = (front + 1) % oldsize;
	}
	itemArray = tempArray;
	front = 0;
	rear = count;
 }

 public Object dequeue()		//큐에서 원소를 삭제하고 반환한다
 {
	if(isEmpty()) return null;
	Object item = itemArray[front];	//큐가 공백이 아닐 때
	front = (front + 1) % queueSize;
	count--;
	return item;
 }

 public void remove()
 {
	if(isEmpty()) return;
	else count--;
 }

 public Object peek()	//큐에서 원소 값을 반환
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

	System.out.print("Queue에 삽입하는 것들 :");
	for(i=0; i<10; i++)
	{
		Integer data = new Integer(i);
		System.out.print(data + " ");
		Q.enqueue(data);
//		Q.enqueue(i);			// error !!!
	}
	System.out.println("\n Queue에서 삭제하는 것들 :");
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

