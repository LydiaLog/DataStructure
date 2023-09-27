

class ListNode {
	String data;		// ListNode Data
	ListNode link;	 	// ListNode Link

	public ListNode() {
		data = null;
		link = null;
	}

	public ListNode(String val) {
		data = val;
		link = null;
	}

	public ListNode(String val, ListNode p) {
		data = val;
		link = p;
	}
}