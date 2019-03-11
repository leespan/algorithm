import java.util.Scanner;

public class sw6485 
{
	public static void main(String args[])
	{
		Scanner stdin = new Scanner(System.in);
		int a[]=new int[5000];
		int C[]=new int[500];
		int T= stdin.nextInt();
		for(int i = 0; i<T; i++ )
		{
			int N= stdin.nextInt();
			for(int j=0; j<N; j++)
			{
				int A=stdin.nextInt();
				int B=stdin.nextInt();
				for(int k=(A-1); k<B; k++)
				{
					a[k]++;
				}
			}
			int P=stdin.nextInt();
			for(int L=0; L<P; L++)
			{
				int c= stdin.nextInt();
				C[L]=c;
			}
			System.out.print("#"+T+" ");
			for(int l=0; l<P; l++)
			{
				System.out.print(a[C[l]-1]+" ");
			}
		}
	}
}
