
import java.awt.List;

public class LinkedList {

	ListNode head; //ù��° ��� ����Ŵ

	public void printList() {
		ListNode p = null;
		System.out.print("(");
		p = head;// ��ĭ1 �� ä��� 
		while (p != null /* ��ĭ2 �� ä���*/ ) {
			System.out.print(p.data);
			p = p.link; //  ��ĭ3 �� ä��� 
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
		if(head == null){ //ù��°�� null�϶��� �����ϴϱ� ù ��忡����
			head = newNode;
			return; //if�� ��
		}
		ListNode p = head; 
		while(p.link != null){//head�� �� �̻� ���鸮��Ʈ�� �ƴϰ� �Ǵϱ� While�� (��尡 �ϳ� �̻�)
			p = p.link;
		}
		p.link = newNode;
		/*
		 * ���� ����Ʈ�� ��� ���� ���� ���� �״�� ����Ʈ�� ���� ���鸮��Ʈ�� �ƴ� ��� ������ ��带 ã�� �� ������
		 * ���link�� ����
		 */

		// ��ĭ�� ä�켼��

	}

	public void addFirstNode(String x) {
		ListNode newNode = new ListNode();
		newNode.data = x;
		newNode.link = head;
		head = newNode;
		/*
		 * ���ο� ��� ���� x ������ ���ο� ��忡 ���� ���ο� ��尡 L�� ù���� ��带 ����Ŵ L�� ���ο� ��带 ����Ŵ
		 */

		// ��ĭ�� ä�켼��
	}


	public static void main(String args[]) {

		LinkedList L = new LinkedList(); // ���Ḯ��Ʈ
		LinkedList L2 = new LinkedList(); // ������ ���
		LinkedList addedList = new LinkedList(); // �� ����Ʈ�� ������ ����Ʈ

		L.addLastNode("Kim"); // addLastNode();
		L.printList(); 
		
		L.addLastNode("Lee");
		L.printList(); 
		
		L.addLastNode("Park");
		L.printList(); // printList();
		
		L.addFirstNode("Amanda");
		L.printList();
		
		
	}
}
