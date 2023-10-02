
public class hanoi {
public static void main(String[] args){
	int numTowers=20;
	if(args.length>0)numTowers=Integer.parseInt(args[0]);
	hanoi(numTowers,'A','B','C');
	}
	static void hanoi(int n, char x,char y, char z){
		if(n==1)
			System.out.println(n+"th"+x+"-->"+y);
		else{
			hanoi(n-1,x,z,y);
			System.out.println(n+"th"+x+"-->"+y);
			hanoi(n-1,z,y,x);
		}
	}
}
