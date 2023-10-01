
class ListNode {
	Object data;
	ListNode link;
}

public class ListQueue implements Queue {
	private ListNode front;// ť���� front ����
	private ListNode rear;// ť���� rear ����
	private int count;// ť�� ���Ҽ�

	public ListQueue() {// ListQueue�� ���� ���� ������
		front = null;
		rear = null;
		count = 0;
	}

	public boolean isEmpty() {// �������� �ƴ��� �˻�
		return (count == 0);
	}

	public void enqueue(Object x) {// ť�� ���� x�� �����Ѵ�
		ListNode newNode = new ListNode();
		newNode.data = x;
		newNode.link = null;

		if (count == 0) {// ť�� ������ ��
			front = rear = newNode;
		} else {// ������ �ƴ� ��		
			rear.link = newNode;// ��ĭ1�� ä��ÿ�: rear�� link�� newNode�� ����Ŵ
			rear = newNode;// ��ĭ2�� ä��ÿ�: rear�� newNode�� ����Ŵ
		}
		count++;
	}

	public Object dequeue() {// ť���� ���Ҹ� �����ϰ� ��ȯ
		if (count == 0)
			return null;
		Object item = front.data;// ��ĭ3�� ä��ÿ�: Object Ÿ���� ������ front�� data�� ����
		front = front.link;// ��ĭ4�� ä��ÿ�: front�� ���� ���Ҹ� ����Ŵ 
		if (front == null) {// ����Ʈ�� ��带 ���� �� ������ �� ���
			rear = null;
		}
		count--;
		return item;
	}

	public void remove() {// ť���� ���Ҹ� ����
		if (isEmpty())
			return;// ť���� ���� ������ �������� �ƴ��� �˻��Ͽ� ��ȯ�Ѵ�
		
		// ť���� ���Ҹ� �����ϴ� �κ��� �����Ͻÿ�.
		front = front.link;// ��ĭ5�� ä��ÿ�.
		if(front == null){
			rear = null;
		}// ��ĭ6�� ä��ÿ�: if�� ���
		// ��ĭ7�� ä��ÿ�.
	}

	public Object peek() {// ť���� �� ���Ҹ� Ž���Ѵ�

		if (count == 0)
			return null;// �� ���Ҽ��� 0���̸� null ��ȯ
		else
			return front.data;// �׷��� ������ data�� ��ȯ�Ѵ�.
	}
}
