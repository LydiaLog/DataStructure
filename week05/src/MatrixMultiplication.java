import java.util.Random;
import java.util.Scanner;
public class MatrixMultiplication {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input_i, input_j, input_k; //입력받을 변수
		int[][] matrix01,matrix02; //서로 곱할 매트릭스
		int[][] result; //결과 저장에 사용
		long t0,t1; //시간 측정
		Scanner sc = new Scanner(System.in);
		
		System.out.print("행 입력 : ");
		input_i = sc.nextInt();
		//열 입력시, 두번째 매트릭스의 행도 같이 정해짐
		System.out.println("열 입력 : ");
		input_j = sc.nextInt();
		System.out.println("뒷열 입력 : ");
		input_k = sc.nextInt();
		
		matrix01 = RandomNumberGennerator(input_i, input_j);
		matrix02 = RandomNumberGennerator(input_j, input_k);
		
		t0=System.currentTimeMillis();		
		result = MatrixMultiplication(matrix01,matrix02);
		t1=System.currentTimeMillis();
		// 출력용(test)
		/*
		for(int i = 0; i < m.length; i++)
		{
			for(int j = 0; j < m[i].length; j++)
			{			
				System.out.print(m[i][j] + "\t");
			}
			System.out.println();
		}
		*/
		System.out.println("time: " +(t1-t0));
		
		sc.close();
	}
	
	//배열에 랜덤숫자를 초기화해주는 메서드
	static int[][] RandomNumberGennerator(int n, int m)
	{
		int[][] result = new int[n][m];		
		Random randomNumber = new Random();
		
		//System.out.println("생성된 배열 : ");
		for(int i = 0; i < result.length; i++)
			for(int j = 0; j < result[i].length; j++)
			{			
				result[i][j] = randomNumber.nextInt(100);
				/*
				 * 생성된 배열 출력(test용)
				System.out.print(result[i] + " ");
				if(i%10 == 0)
					System.out.println();
				*/
			}
		System.out.println();
		return result;
	}
	
	//두 배열을 서로 곱함
	static int[][] MatrixMultiplication(int[][] matrix01, int[][] matrix02) 
	{
        int[][] result = new int[matrix01.length][matrix02[0].length];
        
       for(int i = 0; i < matrix01.length; ++i)
    	   for(int j = 0; j < matrix02[0].length; ++j)
    		   for(int k = 0; k < matrix01[0].length; ++k)
    			   result[i][j] = matrix01[i][j] + matrix02[j][k] * matrix02[k][j];
    			   

        return result;
    }
	
}
