import java.util.Random;
import java.util.Scanner;
public class FindBiggestNumberArrayList {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input_n; //�Է¹��� ����
		int[] array; //���� ū ���� ã�� ��� �迭
		int result; //��� ���忡 ���
		long t0, t1; //�ð� ����
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.print("������ ũ�⸦ �Է��ϼ���. (����(-1) �Է½� ����) : ");
			
			input_n = sc.nextInt();
			if(input_n <= -1)
			{
				System.out.println("����.");
				break;
			}
			
			array = RandomNumberGennerator(input_n);
			
			t0=System.currentTimeMillis();		
			result = FindMaxNumber_LinearSearch(array);
			t1=System.currentTimeMillis();
			System.out.println("���� ū �� : " + result + "  \ttime: " +(t1-t0));
		}
	}
	
	//�迭�� �������ڸ� �ʱ�ȭ���ִ� �޼���
	static int[] RandomNumberGennerator(int n)
	{
		int[] result = new int[n];		
		Random randomNumber = new Random();
		
		//System.out.println("������ �迭 : ");
		for(int i = 0; i < n; i++)
		{			
			result[i] = randomNumber.nextInt(n);
			/* ������ �迭 ���(test��)
			System.out.print(result[i] + " ");
			if(i%10 == 0)
				System.out.println();
			*/
		}
		System.out.println();
		return result;
	}
	
	//����Ž������ ���� ū ���ڸ� ã�´�.
	static int FindMaxNumber_LinearSearch(int[] array)
	{
		int max = Integer.MIN_VALUE;
		
		for(int i = 0; i < array.length; i++)
			if(array[i] > max)
				max = array[i];
		
		return max;
	}
}
//���° ���� �ִ����� ã��(��ġ ��ȯ)