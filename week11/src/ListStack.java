


public class ListStack implements Stack
{
	private ListNode top;
	
	public boolean IsEmpty()
	{
		return (top==null);
	}
	
	public void push(Object x)
	{
		ListNode newNode = new ListNode();// ��ĭ�� ä�켼��
		newNode.data = x;// ��ĭ�� ä�켼��
		newNode.link = top;// ��ĭ�� ä�켼��
		top = newNode;// ��ĭ�� ä�켼��
	}
	
	public Object pop()
	{
		if(IsEmpty())
			return null;
		else
		{
			Object item = top.data;// ��ĭ�� ä�켼��
			top = top.link;// ��ĭ�� ä�켼��
			return item;// ��ĭ�� ä�켼��
			
		}
	}
	
	public void delete()
	{
		if(IsEmpty())// ��ĭ�� ä�켼��
			return;// ��ĭ�� ä�켼��
		else
			top = top.link;// ��ĭ�� ä�켼��
	}
	
	public Object peek()
	{
		if(IsEmpty())// ��ĭ�� ä�켼��
			return null;// ��ĭ�� ä�켼��
		else 
			return top.data;// ��ĭ�� ä�켼��
	}
	
	public void print()
	{
	System.out.println("Stack�� ������ �Ʒ��� �����ϴ�.");
	ListNode p = top;
	
	while ( p != null)
	{
	   System.out.println(" " + p.data);
	   p = p.link;
	}
	System.out.println("Stack�� ������ ���Դϴ�.");
	System.out.println();
	}
}

