
public class ArrayQueue implements Queue {
	public int front; // ť�� ���� ���
	public int rear; // ť�� ���� ���
	public int count; // ť�� ���� ��
	public int queueSize; // ť��(�迭) ũ��
	public int increment; // �迭 Ȯ����� �迭�� ũ��
	public Object[] itemArray; // ��ü Ÿ���� ť ���Ҹ� ���� �迭

	public ArrayQueue() // ������ ť ������
	{
		front = 0;
		rear = 0;
		count = 0;
		queueSize = 50; // �ʱ�ȭ ť�� ũ��
		increment = 10; // �迭�� Ȯ�� ����
		itemArray = new Object[queueSize];
	}

	public boolean isEmpty() {
		return (count == 0);// ��ĭ 1�� ä��ÿ� 
	}

	public void enqueue(Object x) // ť�� ���ο� ���� ����
	{
		rear = (rear + 1) % queueSize;// ��ĭ1�� ä��ÿ� rear ����
		if (count == queueSize)
			queueFull(); // ���Ұ� �� á�� ��
		itemArray[rear] = x;// ��ĭ2�� ä��ÿ�  // ���ο� ���� ����

		count++;
	}

	public void queueFull() // �迭�� ������ ��
	{
		int oldsize = queueSize; // ������ �迭 ũ�⸦ ���
		queueSize += increment; // ���ο� �迭 ũ��
		Object[] tempArray = new Object[queueSize]; // Ȯ��� ũ���� �ӽ� �迭
		for (int i = 0; i < count; i++) // �ӽ� �迭�� ���Ҹ� �̵���Ų��
		{
			front = (front + 1) % oldsize;// ��ĭ3 front 1 ����
			tempArray[i] = itemArray[front];// ��ĭ4  tempArray�� itemArray�� �ϳ��� ���ҿ� ����
		}
		itemArray = tempArray;
		front = 0;
		rear = count;
	}

	public Object dequeue() // ť���� ���Ҹ� �����ϰ� ��ȯ�Ѵ�
	{
		if (isEmpty())
			return null;
		front = (front + 1) % queueSize;// ��ĭ5 �� ä��ÿ� 
		Object item = itemArray[front]; // ť�� ������ �ƴ� ��
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

	public Object peek() // ť���� ���� ���� ��ȯ
	{
		if (isEmpty())
			return null;
		else
			return itemArray[front];// ��ĭ6 �� ä��ÿ� 
	}

	public void print() {
		for (int i = 0; i < queueSize; i++)
			System.out.println("itemArray[" + i + "]: " + itemArray[i]);
	}
}
