
import java.io.*;

class ListNode {
	Object data;
	ListNode link;
	public ListNode() {
		data = null;
		link = null;
	}
}

class GenList {
	private ListNode head;
	void insertData(Object x) {
		ListNode newNode = new ListNode();
		newNode.data = x;
		newNode.link = head;
		head = newNode;
	}

	void printGL() {
		System.out.print("(");
		ListNode p = head;
		while (p != null) {
			if(p.data instanceof GenList) {
				((GenList)p.data).printGL();
			} else {
				System.out.print(p.data);
			}
			if((p = p.link) != null) {
				System.out.print(", ");
			}
		}
		System.out.print(")");
	}

	void searchNode(Object x) {
		ListNode p = head;

		while(p!=null) {
/*			
			ºóÄ­À» Ã¤¿ì½Ã¿À 
*/			
			p = p.link;
		}
	}

	int depthList() {
		ListNode p = head;

		int max = 0, d;
		if (p == null)
			return max;
/*
		ºóÄ­À» Ã¤¿ì½Ã¿À 
*/		
		return max+1;
	}
}

public class GenListPrint {
	public static void main(String[] args) {
		GenList p = new GenList();
		p.insertData (new Integer(82));
		p.insertData ("Korea");
		GenList q = new GenList();
		q.insertData (p);
		q.insertData ("Seoul");
		GenList r = new GenList();
		r.insertData (p);
		r.insertData ("Busan");
		GenList L = new GenList();
		L.insertData (r);
		L.insertData (q);
		L.insertData ("City");
		L.printGL();
		System.out.println();

		//L.searchNode("Busan");

		//System.out.println("List ÀÇ  ±íÀÌ´Â  "+ L.depthList());
	}
}