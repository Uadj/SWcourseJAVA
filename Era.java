import java.util.Scanner;

public class Era {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int arr[] = new int[N+1];
		int result[] = new int[N+1];
		int count=0;
		for(int i=1; i<=N; i++) arr[i]=i;
		
		for(int k=2;k<=N;k++)
		{
			for(int j=k; j<=N;)
			{
					if(arr[j]!=0) {
						arr[j]=0; 
						count++;
						result[count]=j; 
//						System.out.print(result[count] + " ");
					}
				    j=j+k;
					if(j>N) break;
					
					
			}
		}
		
		
		System.out.print(result[M]);
		sc.close();
	}
		
}

