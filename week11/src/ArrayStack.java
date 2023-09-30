

public class ArrayStack implements Stack
	{
		private int top;
		private int stackSize;
		private int increment;

		private Object[] itemArray;

		public ArrayStack()
		{
			top = -1;
			stackSize = 50;
			increment = 10;
			itemArray = new Object[stackSize];
		}

		public boolean IsEmpty() // ������ ����ִ��� �˻�
		{
			return top == -1;// ��ĭ�� ä�켼��
		}

		public void push(Object x) // x���Ҹ� ������ �鿡 ����
		{
			if(top == stackSize - 1)// ��ĭ�� ä�켼�� 
				stackFull();// ������ �����̶��
					 // ������ ���¸� ó��

			itemArray[++top] = x;	 // �迭�� top+1 ��ġ�� ���� x ���� 
		}

		public void stackFull() // ������ ������ ��
		{
			//System.out.println ("The size of the stack is increased.");
			stackSize += increment;// ��ĭ�� ä�켼��
			Object[] tempArray = new Object[stackSize];// ��ĭ�� ä�켼��
			for(int i = 0; i <= top; i++)// ��ĭ�� ä�켼��
				tempArray[i] = itemArray[i];// ��ĭ�� ä�켼��

			itemArray = tempArray;
		}

		public Object pop()
		{
			if(IsEmpty())
		    	return null;// ��ĭ�� ä�켼��             // ������ ������� ��� ó��
			else 
				return itemArray[top--];// ��ĭ�� ä�켼��
			
		}

		public void delete() // ������ �� ���Ҹ� ����
		{
			if(IsEmpty())
				return;
			else top--;// ��ĭ�� ä�켼��
			// ��ĭ�� ä�켼��
		}

		public Object peek() // ������ �� ���Ҹ� �˻�
		{
			if(IsEmpty())
				return null;// ��ĭ�� ä�켼��
			else 
				return itemArray[top];// ��ĭ�� ä�켼��
		}
		
		public void print()
		{
			System.out.print("Stack push : ");
			for(int i = 0; i <= top; i++)
			{
				System.out.print(itemArray[i] + "   ");
			}
			System.out.println("");
		}
	
	}

