package Second;
//import PQmethods;
//import PriorityKey;

/* 
 * ������ �迭�� �̿� �켱���� ť
 */ 
//
interface PriorityKey{
	int compareTo(PriorityKey value);
	String toString();
}  

interface PQmethods //�켱���� ť �޼ҵ�
{
	int currentSize();
	void insert(PriorityKey newKey);
	PriorityKey delete();
} 
//

class PriorityItem implements PriorityKey{ //��Ʈ���� �켱 ���� ������ ���� Ŭ���� 
	private String key;
	
	PriorityItem(String k){
		key = k;
	}

	public String toString(){
		// ��ĭ�� ä��ÿ� 
	}
	
	public int compareTo(PriorityKey value){
		//
		//  ��ĭ���� ä��ÿ� 
		//
		//
	}
}//end class PriorityItem 



class PriorityQ implements PQmethods{ //������ �迭�� ������ �켱���� ť
	private int count;
	private int size;
	private int increment;
	private PriorityKey[] itemArray;
	
	public PriorityQ(){
		count = 0;
		size = 20;
		increment =5;
		itemArray = new PriorityKey[size];
	}

	public int currentSize(){
		return count;
	}
	
	public void insert(PriorityKey newKey){
		if(count == size) pQfull();
		else itemArray[count++] = newKey;
	}
	
	public void pQfull(){
		size += increment;
		PriorityKey[] tempArray = new PriorityKey[size];
		
		for(int i=0; i<count; i++){
			tempArray[i] = itemArray[i];
		}
		
		itemArray = tempArray;		
	}
	
	public PriorityKey delete(){
		if(count == 0) return null;
		else{
			int maxPosition = 0;
			
			//
			// ��ĭ���� ä��ÿ� 
			//
			//
			
			itemArray[maxPosition] = itemArray[--count];
			return maxItem;
			
			}	
	}	
} //end class PriorityQ

public class PQapp2 {

	public static void main(String[] args) {
		PQapp2 pQapp = new PQapp2();
		
		String Names[] = {"Kim", "Cho", "Lee", "Koh", "Pak", "Han", "Yoo"};
		int n = Names.length;
		
		PriorityKey[] a = new PriorityKey[n];
		
		for(int i=0; i<n; i++){
			a[i] = new PriorityItem(Names[i]);
			System.out.print(a[i] + ", ");
		}
		
		System.out.println("\n-----���� �� -----");

		pQapp.pQsort(a); //�迭 a�� ����
		
		for(int i=0; i<n; i++){
			System.out.print(a[i] + ", ");
		}
	}// end main
	
	void pQsort(PriorityKey[] a){
		int i;
		int n = a.length;
		PriorityQ pQ = new PriorityQ();
		
		for(i=0; i<n; i++)
			pQ.insert(a[i]);
		
		for(i=n-1; i>=0; i--)
			a[i]=pQ.delete();
	}
}
