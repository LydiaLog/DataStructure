

/*정렬된 연결 리스트 우선 순위 큐

당신이 축복의 통로입니다. */


interface PriorityKey
{
	int compareTo(PriorityKey value);
	String toString();
}

interface PQmethods
{
	int currentSize();
	void insert(PriorityKey newKey);
	void pQfull();
	PriorityKey delete();
}

class PriorityItem implements PriorityKey
{
	private int key;

	PriorityItem(int names) {
		key = names;
	}

	public String toString() {
		// 빈칸 1
	}

	public int compareTo(PriorityKey value) {
	    //
		//  빈칸들을 채우시오 
		//
	}
}

class PriorityQ implements PQmethods
{
	private int count;
	private int size;
	private int increment;
	private PriorityKey[] itemArray;

	public PriorityQ()	{
		count = 0;
		size = 20;
		increment = 5;
		itemArray = new PriorityKey[size];
	}

	public int currentSize() {
		return count;
	}

	public void insert(PriorityKey newKey) {
		if(count==size)  pQfull();
		else itemArray[count++] = newKey;
	}

	public void pQfull() {
		size += increment;
		PriorityKey[] tempArray = new PriorityKey[size];

		for (int i=0; i < count ; i++ )
			tempArray[i] = itemArray[i];

		itemArray = tempArray;
	}

	public PriorityKey delete() {
		if(count==0) return null;
		else {
			int maxPosition = 0;

			//
			//  빈칸들을 채우시오 
			//
			//
			
			}
			itemArray[maxPosition] = itemArray[--count];

			return maxItem;
		}
	}
}

class PQapp1
{
	public static void main(String[] args) 
	{
		PQapp1 pQapp = new PQapp1();
		int n = 10;
		PriorityKey[] a = new PriorityKey[n];

		for (int i=0; i < n ; i++ )	{
			a[i] = new PriorityItem((3*i - 13) * ( 3*i - 13));
			System.out.print(a[i] + ",");
		}
		System.out.println();
		
		pQapp.pQsort(a); //배열 정열

		System.out.println(" -------- 정열 후 ---------");

		for (int i=0 ; i < n ; i++ ) {
			System.out.print(a[i] + ",");
		}
		System.out.println();
	}

	void pQsort(PriorityKey[] a)
	{
		int i;
		int n = a.length;
		PriorityQ pQ = new PriorityQ();

		for (i=0 ; i < n ; i++ )
			pQ.insert(a[i]);
		for (i=n-1 ; i >= 0 ; i-- )
			a[i] = pQ.delete();
	}
}
