import java.util.Random;
import java.util.Scanner;
public class MatrixMultiplication {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input_i, input_j, input_k; //�Է¹��� ����
		int[][] matrix01,matrix02; //���� ���� ��Ʈ����
		int[][] result; //��� ���忡 ���
		long t0,t1; //�ð� ����
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� �Է� : ");
		input_i = sc.nextInt();
		//�� �Է½�, �ι�° ��Ʈ������ �൵ ���� ������
		System.out.println("�� �Է� : ");
		input_j = sc.nextInt();
		System.out.println("�޿� �Է� : ");
		input_k = sc.nextInt();
		
		matrix01 = RandomNumberGennerator(input_i, input_j);
		matrix02 = RandomNumberGennerator(input_j, input_k);
		
		t0=System.currentTimeMillis();		
		result = MatrixMultiplication(matrix01,matrix02);
		t1=System.currentTimeMillis();
		// ��¿�(test)
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
	
	//�迭�� �������ڸ� �ʱ�ȭ���ִ� �޼���
	static int[][] RandomNumberGennerator(int n, int m)
	{
		int[][] result = new int[n][m];		
		Random randomNumber = new Random();
		
		//System.out.println("������ �迭 : ");
		for(int i = 0; i < result.length; i++)
			for(int j = 0; j < result[i].length; j++)
			{			
				result[i][j] = randomNumber.nextInt(100);
				/*
				 * ������ �迭 ���(test��)
				System.out.print(result[i] + " ");
				if(i%10 == 0)
					System.out.println();
				*/
			}
		System.out.println();
		return result;
	}
	
	//�� �迭�� ���� ����
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
