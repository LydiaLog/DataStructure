

public class Stack_Test {
	public static void main(String args[]) {
//
		System.out.println("-------------Array---------------");
		Stack S = new ArrayStack();
		S.push("carrot");
		S.print();
		S.push("orange");
		S.print();
		S.push("raisins");
		S.print();
		S.push("pickles");
		S.print();
		S.push("bananas");
		S.print();
		S.push("sssss");
		S.print();
		S.delete();
		S.print();

		System.out.println();
		System.out.println("Stack.peek() : " + S.peek());
		System.out.println("Stack.pop():" + S.pop());
		System.out.println("Stack.pop():" + S.pop());
		System.out.println("Stack.pop():" + S.pop());
		System.out.println("Stack.pop():" + S.pop());
		System.out.println();
//
//
		
		System.out.println("-------------List---------------");
		ListStack s = new ListStack();
		s.push("apple");
		System.out.println("Stack peek() : " + s.peek());
		s.push("melon");
		System.out.println("Stack peek() : " + s.peek());
		s.push("kiwi");
		System.out.println("Stack peek() : " + s.peek());
		s.push("tomato");
		System.out.println("Stack peek() : " + s.peek());
		
		System.out.println();
		s.print();
		System.out.println("Stack.pop() : " + s.pop());
		System.out.println("Stack.pop() : " + s.pop());
		System.out.println("Stack.pop() : " + s.pop());
		System.out.println("Stack.pop() : " + s.pop());
		s.push("mango");
		s.push("raspberry");
		s.print();
		
		System.out.println("Stack.pop() : " + s.pop());
		System.out.println("Stack.pop() : " + s.pop());
		System.out.println("Stack.pop() : " + s.pop());
			
		s.push("1234");
		s.push("5678");
		s.print();
		s.delete();
		System.out.println("Stack.delete() : " + s.pop());
//
	}

}
