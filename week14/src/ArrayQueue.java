
public class ArrayQueue implements Queue {
	public int front; // 큐의 삭제 장소
	public int rear; // 큐의 삽입 장소
	public int count; // 큐의 원소 소
	public int queueSize; // 큐의(배열) 크기
	public int increment; // 배열 확장시의 배열의 크기
	public Object[] itemArray; // 객체 타입의 큐 원소를 위한 배열

	public ArrayQueue() // 무인자 큐 생성자
	{
		front = 0;
		rear = 0;
		count = 0;
		queueSize = 50; // 초기화 큐의 크기
		increment = 10; // 배열의 확장 단위
		itemArray = new Object[queueSize];
	}

	public boolean isEmpty() {
		return (count == 0);// 빈칸 1을 채우시오 
	}

	public void enqueue(Object x) // 큐에 새로운 원소 삽입
	{
		rear = (rear + 1) % queueSize;// 빈칸1을 채우시오 rear 증가
		if (count == queueSize)
			queueFull(); // 원소가 꽉 찼을 때
		itemArray[rear] = x;// 빈칸2을 채우시오  // 새로운 원소 삽입

		count++;
	}

	public void queueFull() // 배열이 만원일 때
	{
		int oldsize = queueSize; // 현재의 배열 크기를 기록
		queueSize += increment; // 새로운 배열 크기
		Object[] tempArray = new Object[queueSize]; // 확장된 크기의 임시 배열
		for (int i = 0; i < count; i++) // 임시 배열로 원소를 이동시킨다
		{
			front = (front + 1) % oldsize;// 빈칸3 front 1 증가
			tempArray[i] = itemArray[front];// 빈칸4  tempArray에 itemArray를 하나의 원소에 복사
		}
		itemArray = tempArray;
		front = 0;
		rear = count;
	}

	public Object dequeue() // 큐에서 원소를 삭제하고 반환한다
	{
		if (isEmpty())
			return null;
		front = (front + 1) % queueSize;// 빈칸5 을 채우시오 
		Object item = itemArray[front]; // 큐가 공백이 아닐 때
		count--; 
		return item;
	}

	public void remove() {
		if (isEmpty())
			return;
		else
		{
			front = (front + 1) % queueSize;
			count--;	
		}
	}

	public Object peek() // 큐에서 원소 값을 반환
	{
		if (isEmpty())
			return null;
		else
			return itemArray[front];// 빈칸6 을 채우시오 
	}

	public void print() {
		for (int i = 0; i < queueSize; i++)
			System.out.println("itemArray[" + i + "]: " + itemArray[i]);
	}
}
