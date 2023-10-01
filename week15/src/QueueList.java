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
  private ListNode front;//ť���� front ����
  private ListNode rear;//ť���� rear ����
  private int count;// ť�� ���Ҽ�
 
  public ListQueue(){//ListQueue�� ���� ���� ������
    front = null;
    rear = null;
    count = 0;
    }

 public boolean isEmpty(){//�������� �ƴ��� �˻�
   return (count == 0);
  }

 public void enqueue(Object x){//ť�� ���� x�� �����Ѵ�
  ListNode newNode  = new ListNode();
  newNode.data = x;
  newNode.link = null;
  
  if(count ==0){//ť�� ������ ��
    front = rear = newNode;
    }
  else {//������ �ƴ� �� 
    rear.link = newNode;
    rear = newNode;
  }

  count++;
 }

 public Object dequeue(){//ť���� ���Ҹ� �����ϰ� ��ȯ
    if(count == 0) return null;
    Object item = front.data;
    front = front.link;
    if(front == null){//����Ʈ�� ��带 ���� �� ������ �� ���
      rear = null;
    }

   count--;
   return item;

  }

 public void  remove(){//ť���� ���Ҹ� ���� 
   if(isEmpty()) return;//ť���� ���� ������ �������� �ƴ��� �˻��Ͽ� ��ȯ�Ѵ�
   front = front.link;
   if(front==null)  rear = null;
   }

 public Object peek(){//ť���� �� ���Ҹ� Ž���Ѵ�
  
  if(count ==0) return null;//�� ���Ҽ��� 0���̸� null ��ȯ
  else return front.data;//�׷��� ������ data�� ��ȯ�Ѵ�.
  }
}

public class QueueList{
  public static void main(String args[]){
   int i ;
    ListQueue Q = new ListQueue();
    System.out.println("ť���� �����ϴ� ��..\n");   

    for(i=0; i<19; i++)
     {
      Integer data = new Integer(i);
      System.out.println(data+" ");
      Q.enqueue(data);
     }
    
    System.out.println("\n"+ Q.peek());
    System.out.println("ť���� �����ϴ� ��..\n");
    for(i=0; i<19; i++)
     {
       System.out.print(Q.dequeue()+" ");
     }
   }
}



     

     
 

  

   
  
