


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

	public void insertNode(String x, String y) { // x 값 뒤에 y 값 추가
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
		 * 공백리스트의 경우 리스트에 값 저장
		 * 
		 * 공백 리스트가 아닐경우 x의 데이터가 있는지 확인 x의 데이터가 있을때 x값을 가지는 노드 다음에 삽입
		 */
		
		// 빈칸을 채우세요



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
		 * 리스트의 마지막까지 순회하면서 데이터를 하나씩 비교하고 비교한 값중 있으면 return 없으면 return null
		 */
		
		//빈칸을 채우세요

	public void deleteNext(String x) {
		ListNode p = searchNode(x); // x의 값이 있는 노드를 찾아 새로운 ListNode p에 저장
		ListNode q = new ListNode(); // 삭제하기위한 ListNode 생성

		/*
		 * 공백 리스트인지 확인후 공백리스트이면 에러출력 리스트 link가 null이면 첫번째 노드 삭제 link도 null이 아닌경우
		 */

		// 빈칸을 채우세요
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
			
			//빈칸을 채우세요
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
			 * currentNode.link가 null일때까지 반복하면서 previousNode를 다음 노드로 이동
			 * currentNode를 다음 노드로 이동
			 * 
			 * currentNode.link가 null이되면 previousNode의 link를 null로 저장
			 */

			// 빈칸을 채우세요
			while(currentNode.link != null) {
				previousNode = currentNode;
				currentNode = currentNode.link;
			}
			previousNode.link = null;
		}

	}

	public static LinkedList addList(LinkedList L1, LinkedList L2) {
		if (L1 == null)				// L1이 null인 경우
			/*
			 *	빈칸을 채우세요	 
			 */
			return L2;
		else if (L2 == null)		// L2가 null인 경우
			/*
			 *	빈칸을 채우세요	 
			 */
			return L1;
		else {						// 둘다 null이 아닌경우
			/*
			 *	빈칸을 채우세요	 
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
		
		// 빈칸을 채우시오 
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
