


import java.awt.List;


public class LinkedList {

	ListNode head;

	public void printList() {
		ListNode p = null;
		System.out.print("(");
		p = head;
		while (p != null) {
			System.out.print(p.data);
			p = p.link;
			if (p != null) {
				System.out.print(", ");
			}
		}
		System.out.println(")");
	}

	public void addLastNode(String x) {
		ListNode newNode = new ListNode();
		newNode.data = x;
		newNode.link = null;
		if (head == null) {
			head = newNode;
			return;
		}
		ListNode p = head;
		while (p.link != null) {
			p = p.link;
		}
		p.link = newNode;

	}
	
	public void addFirstNode(String x) {
		ListNode newNode = new ListNode();
		newNode.data = x;
		newNode.link = head;
		head = newNode;
	}

	public void insertNode(String x, String y) { // x �� �ڿ� y �� �߰�
		ListNode newNode = new ListNode();
		newNode.data = y;
		
		ListNode p = searchNode(x); // x -> searchNode(x)
		
		if(head == null) {
			head = newNode;
			newNode.link = null;
		}else if( p == null ) {
			newNode.link = head;
			head = newNode;
		}else {
			newNode.link = p.link;
			p.link = newNode;
		}
				
			}
		
			
	
		/*
		 * ���鸮��Ʈ�� ��� ����Ʈ�� �� ����
		 * 
		 * ���� ����Ʈ�� �ƴҰ�� x�� �����Ͱ� �ִ��� Ȯ�� x�� �����Ͱ� ������ x���� ������ ��� ������ ����
		 */
		
		// ��ĭ�� ä�켼��



	public ListNode searchNode(String x) {
		ListNode p = head;
		
		while(p != null) {
			if(x.equals(p.data)) {
				return p;
			}
			p = p.link;
		}
			return p;
		}

		/*
		 * ����Ʈ�� ���������� ��ȸ�ϸ鼭 �����͸� �ϳ��� ���ϰ� ���� ���� ������ return ������ return null
		 */
		
		//��ĭ�� ä�켼��

	public void deleteNext(String x) {
		ListNode p = searchNode(x); // x�� ���� �ִ� ��带 ã�� ���ο� ListNode p�� ����
		ListNode q = new ListNode(); // �����ϱ����� ListNode ����

		/*
		 * ���� ����Ʈ���� Ȯ���� ���鸮��Ʈ�̸� ������� ����Ʈ link�� null�̸� ù��° ��� ���� link�� null�� �ƴѰ��
		 */

		// ��ĭ�� ä�켼��
		if(head == null) {
			return;
		}
		if(p == null) {
			//q = head;
			head = head.link;
		}else {
			q = p.link;
			if(q == null) {
				return;
			}
		 p.link = q.link;
		}
	}

	public void reverse() {
		ListNode p = head;
		ListNode q = null;
		ListNode r = null;

		while (p != null) {
			r = q;
			q = p;
			p = q.link;
			q.link = r;
			/*
			 * 
			 *
			 */
			
			//��ĭ�� ä�켼��
		}
		head = q;
	}


	public void deleteLastNode() {
		ListNode previousNode, currentNode;
		if (head == null)
			return;
		if (head.link == null) {
			head = null;
			return;
		} else {
			previousNode = head; // head
			currentNode = head.link; // head.link
			/*
			 * currentNode.link�� null�϶����� �ݺ��ϸ鼭 previousNode�� ���� ���� �̵�
			 * currentNode�� ���� ���� �̵�
			 * 
			 * currentNode.link�� null�̵Ǹ� previousNode�� link�� null�� ����
			 */

			// ��ĭ�� ä�켼��
			while(currentNode.link != null) {
				previousNode = currentNode;
				currentNode = currentNode.link;
			}
			previousNode.link = null;
		}

	}

	public static LinkedList addList(LinkedList L1, LinkedList L2) {
		if (L1 == null)				// L1�� null�� ���
			/*
			 *	��ĭ�� ä�켼��	 
			 */
			return L2;
		else if (L2 == null)		// L2�� null�� ���
			/*
			 *	��ĭ�� ä�켼��	 
			 */
			return L1;
		else {						// �Ѵ� null�� �ƴѰ��
			/*
			 *	��ĭ�� ä�켼��	 
			 */
			ListNode p = L1.head;
			while(p.link != null) {
				p = p.link;
			}
			p.link = L2.head;
			return L1;
		}
	}

	public void SwapNode(LinkedList L, String x, String y) 
	{
		ListNode p = searchNode(x);
		ListNode q = searchNode(y);
		ListNode temp = new ListNode();
		temp.data = q.data;
		q.data = p.data;
		p.data = temp.data;
		
		// ��ĭ�� ä��ÿ� 
	}


	public static void main(String args[]) {

		LinkedList L = new LinkedList();
		LinkedList L1 = new LinkedList();
		LinkedList L2 = new LinkedList();

		L.addLastNode("Kim");
		L.printList();
		L.addLastNode("Lee");
		L.printList();
		L.addLastNode("Park");
		L.printList();

		L.addFirstNode("Amanda");
		L.printList();

		L.insertNode("Amanda", "Booby");
		L.printList();

		System.out.println(L.searchNode("Kim").data);

		L.deleteNext("Amanda");
		L.printList();

		L.reverse();
		L.printList();

		L.deleteLastNode();
		L.printList();

		L1.addLastNode("add-1");
		L1.addLastNode("add-2");
		L1.addLastNode("add-3");

		L2 = addList(L, L1);
		L2.printList();
		
	

	}
}
