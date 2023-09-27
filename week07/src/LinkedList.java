
import java.awt.List;

public class LinkedList {

	ListNode head; //첫번째 노드 가리킴

	public void printList() {
		ListNode p = null;
		System.out.print("(");
		p = head;// 빈칸1 을 채우라 
		while (p != null /* 빈칸2 을 채우라*/ ) {
			System.out.print(p.data);
			p = p.link; //  빈칸3 을 채우라 
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
		if(head == null){ //첫번째만 null일때만 실행하니까 첫 노드에서만
			head = newNode;
			return; //if문 끝
		}
		ListNode p = head; 
		while(p.link != null){//head가 더 이상 공백리스트가 아니게 되니까 While만 (노드가 하나 이상)
			p = p.link;
		}
		p.link = newNode;
		/*
		 * 공백 리스트의 경우 새로 들어온 값을 그대로 리스트에 저장 공백리스트가 아닐 경우 마지막 노드를 찾은 후 마지막
		 * 노드link에 삽입
		 */

		// 빈칸을 채우세요

	}

	public void addFirstNode(String x) {
		ListNode newNode = new ListNode();
		newNode.data = x;
		newNode.link = head;
		head = newNode;
		/*
		 * 새로운 노드 생성 x 데이터 새로운 노드에 저장 새로운 노드가 L의 첫번쨰 노드를 가리킴 L이 새로운 노드를 가리킴
		 */

		// 빈칸을 채우세요
	}


	public static void main(String args[]) {

		LinkedList L = new LinkedList(); // 연결리스트
		LinkedList L2 = new LinkedList(); // 연결할 노드
		LinkedList addedList = new LinkedList(); // 두 리스트를 연결한 리스트

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
