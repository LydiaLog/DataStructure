package Second;
//import PQmethods;
//import PriorityKey;

/* 
 * 무정렬 배열을 이용 우선순위 큐
 */ 
//
interface PriorityKey{
	int compareTo(PriorityKey value);
	String toString();
}  

interface PQmethods //우선순위 큐 메소드
{
	int currentSize();
	void insert(PriorityKey newKey);
	PriorityKey delete();
} 
//

class PriorityItem implements PriorityKey{ //스트링을 우선 순위 값으로 갖는 클래스 
	private String key;
	
	PriorityItem(String k){
		key = k;
	}

	public String toString(){
		// 빈칸을 채우시오 
	}
	
	public int compareTo(PriorityKey value){
		//
		//  빈칸들을 채우시오 
		//
		//
	}
}//end class PriorityItem 



class PriorityQ implements PQmethods{ //무정렬 배열로 구현한 우선수위 큐
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
			// 빈칸들을 채우시오 
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
		
		System.out.println("\n-----정렬 후 -----");

		pQapp.pQsort(a); //배열 a를 정렬
		
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
