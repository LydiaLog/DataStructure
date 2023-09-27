
public class SparseMatrix {
	int Nrows, Ncols, Nterms, idx;
	Triple[] a;
	
	public SparseMatrix(int rows) {
		Nrows = rows;
		Ncols = rows;
		Nterms = (3*rows)-2;
		idx = 0;
		a = new Triple[Nterms];
		
		for(int i=0; i<Nrows; i++) {
			for(int j=0; j<Ncols; j++) {
				if(i==j) {
					int rand = (int)(Math.random()*98)+1;
					if(j-1>=0) a[idx++] = new Triple(j-1,i,rand);
					rand = (int)(Math.random()*98)+1;
					a[idx++] = new Triple(i,j,rand);
					rand = (int)(Math.random()*98)+1;
					if(j+1<Nrows) a[idx++] = new Triple(j+1,i,rand);
				}
			}
		}
	}
	
	public void displayMatrix() {
		System.out.println("Number of rows, columns : " + Nrows);
		System.out.println("Number of non-zero terms : " + Nterms);
		
		for(int i=0; i<Nterms; i++) {
			System.out.println("["+i+"]" + "	" + a[i].col + "	" + a[i].row
					+ "	" + a[i].value);
		}
		System.out.println("");
	}
	
	public void displayMatrixAll() {
		System.out.println("Number of rows, columns : " + Nrows);
		System.out.println("Number of non-zero terms : " + Nterms);
		
		for(int i=0; i<Nrows; i++) {
			for(int j=0; j<Ncols; j++) {
				boolean isTerm = false;
				for(int k=0; k<Nterms; k++) {
					if(a[k].row == j && a[k].col == i) {
						if(a[k].value < 10) System.out.print("0");
						System.out.print(a[k].value);
						isTerm = true;
						break;
					}
				}
				if(!isTerm) System.out.print("00");
				System.out.print(" ");			
			}
			System.out.println("");
		}
		System.out.println("");
	}
	
	public void displayMemory() {
		System.out.println(" 변형된 희소 행렬의 사용 메모리양 : " + (3*(Nterms+1))*4 +" Byte");
	}
	
	public void displayMemoryAll() {
		System.out.println("2차원 행렬 A[i,j]의 사용 메모리양 : " + (Nrows*Nrows)*4 + " Byte");
	}
	
	public SparseMatrix transpose() {   // 1st method
		int i, j;
		int[] RowTerms = new int[Ncols];
		int[] RowBegins = new int[Ncols];
		SparseMatrix b = new SparseMatrix(Ncols);
		if(Nterms > 0) {
			for(i=0; i<Ncols; i++) RowTerms[i] = 0;
			for(i=0; i<Nterms; i++) RowTerms[a[i].row]++;
			RowBegins[0] = 0;
			for(i=1; i<Ncols; i++) RowBegins[i] = RowBegins[i-1]+RowTerms[i-1];
			for(i=0; i<Nterms; i++) {
				j = RowBegins[a[i].row]++;
				b.a[j] = new Triple(a[i].col, a[i].row, a[i].value);
			}
		}
		return b;
	}
	
	public SparseMatrix transposeS() {   //2nd method (traditional method)
		SparseMatrix b = new SparseMatrix(Ncols);
		if(Nterms > 0) {
			int q = 0;
			for(int p=0; p<Nrows; p++) {
				for(int i=0; i<Nterms; i++) {
					if(a[i].row == p) {
						b.a[q].row = a[i].col;
						b.a[q].col = a[i].row;
						b.a[q].value = a[i].value;
						q++;
					}
				}
			}
		}
		return b;
	}

}
