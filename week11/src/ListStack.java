


public class ListStack implements Stack
{
	private ListNode top;
	
	public boolean IsEmpty()
	{
		return (top==null);
	}
	
	public void push(Object x)
	{
		ListNode newNode = new ListNode();// 后沫阑 盲快技夸
		newNode.data = x;// 后沫阑 盲快技夸
		newNode.link = top;// 后沫阑 盲快技夸
		top = newNode;// 后沫阑 盲快技夸
	}
	
	public Object pop()
	{
		if(IsEmpty())
			return null;
		else
		{
			Object item = top.data;// 后沫阑 盲快技夸
			top = top.link;// 后沫阑 盲快技夸
			return item;// 后沫阑 盲快技夸
			
		}
	}
	
	public void delete()
	{
		if(IsEmpty())// 后沫阑 盲快技夸
			return;// 后沫阑 盲快技夸
		else
			top = top.link;// 后沫阑 盲快技夸
	}
	
	public Object peek()
	{
		if(IsEmpty())// 后沫阑 盲快技夸
			return null;// 后沫阑 盲快技夸
		else 
			return top.data;// 后沫阑 盲快技夸
	}
	
	public void print()
	{
	System.out.println("Stack狼 郴侩篮 酒贰客 鞍嚼聪促.");
	ListNode p = top;
	
	while ( p != null)
	{
	   System.out.println(" " + p.data);
	   p = p.link;
	}
	System.out.println("Stack狼 郴侩篮 场涝聪促.");
	System.out.println();
	}
}

