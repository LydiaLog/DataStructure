

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

		public boolean IsEmpty() // 스택이 비어있는지 검사
		{
			return top == -1;// 빈칸을 채우세요
		}

		public void push(Object x) // x원소를 스택의 톱에 삽입
		{
			if(top == stackSize - 1)// 빈칸을 채우세요 
				stackFull();// 스택이 만원이라면
					 // 만원인 상태를 처리

			itemArray[++top] = x;	 // 배열의 top+1 위치에 원소 x 삽입 
		}

		public void stackFull() // 스택이 만원일 때
		{
			//System.out.println ("The size of the stack is increased.");
			stackSize += increment;// 빈칸을 채우세요
			Object[] tempArray = new Object[stackSize];// 빈칸을 채우세요
			for(int i = 0; i <= top; i++)// 빈칸을 채우세요
				tempArray[i] = itemArray[i];// 빈칸을 채우세요

			itemArray = tempArray;
		}

		public Object pop()
		{
			if(IsEmpty())
		    	return null;// 빈칸을 채우세요             // 스택이 비어있을 경우 처리
			else 
				return itemArray[top--];// 빈칸을 채우세요
			
		}

		public void delete() // 스택의 톱 원소를 삭제
		{
			if(IsEmpty())
				return;
			else top--;// 빈칸을 채우세요
			// 빈칸을 채우세요
		}

		public Object peek() // 스택의 톱 원소를 검색
		{
			if(IsEmpty())
				return null;// 빈칸을 채우세요
			else 
				return itemArray[top];// 빈칸을 채우세요
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

