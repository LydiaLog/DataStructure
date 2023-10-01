/*
interface Queue
{
 boolean isEmpty();
 void enqueue(Object x);
 //Object pop();
 void remove();
 Object peek();
}
*/

class ListNode 
{
 Object data;
 ListNode link;
}

class ListQueue implements Queue{
  private ListNode front;//큐에서 front 원소
  private ListNode rear;//큐에서 rear 원소
  private int count;// 큐의 원소수
 
  public ListQueue(){//ListQueue에 대한 무인 생성자
    front = null;
    rear = null;
    count = 0;
    }

 public boolean isEmpty(){//공백인지 아닌지 검사
   return (count == 0);
  }

 public void enqueue(Object x){//큐에 원소 x를 삽입한다
  ListNode newNode  = new ListNode();
  newNode.data = x;
  newNode.link = null;
  
  if(count ==0){//큐가 공백일 때
    front = rear = newNode;
    }
  else {//공백이 아닐 때 
    rear.link = newNode;
    rear = newNode;
  }

  count++;
 }

 public Object dequeue(){//큐에서 원소를 삭제하고 반환
    if(count == 0) return null;
    Object item = front.data;
    front = front.link;
    if(front == null){//리스트이 노드를 삭제 후 공백이 된 경우
      rear = null;
    }

   count--;
   return item;

  }

 public void  remove(){//큐에서 원소를 삭제 
   if(isEmpty()) return;//큐에서 원소 삭제시 공백인지 아닌지 검사하여 반환한다
   front = front.link;
   if(front==null)  rear = null;
   }

 public Object peek(){//큐에서 톰 원소를 탐색한다
  
  if(count ==0) return null;//톱 원소수가 0개이면 null 반환
  else return front.data;//그렇지 않으면 data를 반환한다.
  }
}

public class QueueList{
  public static void main(String args[]){
   int i ;
    ListQueue Q = new ListQueue();
    System.out.println("큐에서 삽입하는 것..\n");   

    for(i=0; i<19; i++)
     {
      Integer data = new Integer(i);
      System.out.println(data+" ");
      Q.enqueue(data);
     }
    
    System.out.println("\n"+ Q.peek());
    System.out.println("큐에서 삭제하는 것..\n");
    for(i=0; i<19; i++)
     {
       System.out.print(Q.dequeue()+" ");
     }
   }
}



     

     
 

  

   
  
