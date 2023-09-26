import java.util.Random;
import java.util.Scanner;
public class FindBiggestNumberArrayList {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input_n; //입력받을 변수
		int[] array; //가장 큰 값을 찾을 대상 배열
		int result; //결과 저장에 사용
		long t0, t1; //시간 측정
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.print("문제의 크기를 입력하세요. (음수(-1) 입력시 종료) : ");
			
			input_n = sc.nextInt();
			if(input_n <= -1)
			{
				System.out.println("종료.");
				break;
			}
			
			array = RandomNumberGennerator(input_n);
			
			t0=System.currentTimeMillis();		
			result = FindMaxNumber_LinearSearch(array);
			t1=System.currentTimeMillis();
			System.out.println("가장 큰 값 : " + result + "  \ttime: " +(t1-t0));
		}
	}
	
	//배열에 랜덤숫자를 초기화해주는 메서드
	static int[] RandomNumberGennerator(int n)
	{
		int[] result = new int[n];		
		Random randomNumber = new Random();
		
		//System.out.println("생성된 배열 : ");
		for(int i = 0; i < n; i++)
		{			
			result[i] = randomNumber.nextInt(n);
			/* 생성된 배열 출력(test용)
			System.out.print(result[i] + " ");
			if(i%10 == 0)
				System.out.println();
			*/
		}
		System.out.println();
		return result;
	}
	
	//선형탐색으로 가장 큰 숫자를 찾는다.
	static int FindMaxNumber_LinearSearch(int[] array)
	{
		int max = Integer.MIN_VALUE;
		
		for(int i = 0; i < array.length; i++)
			if(array[i] > max)
				max = array[i];
		
		return max;
	}
}
//몇번째 값이 최대인지 찾기(위치 반환)