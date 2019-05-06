import java.util.Scanner;

public class bj1149 {
	public static void Main(String args[])
	{
		Scanner stdin = new Scanner(System.in);
		int a= stdin.nextInt();
		int min=1001;
		int b[][]=new int[a][3];
		int dp[]=new int[3];
		for(int i=0;i<a;i++)
		{
			for(int j=0;i<3;j++)
			{
				b[i][j]=stdin.nextInt();
				if(i==0)
				{
					dp[j]=b[i][j];
				}
			}			
		}
		for(int i=1; i<a; i++)
		{
			for(int j=0; j<3; j++)
			{
				for(int k=0; k<3;k++)
					if(min>dp[k] && j!=k)
						min=dp[k];
				dp[j]=b[i][j]+min;
			}
		}
		for(int i=0; i<3; i++) {
			if(min>dp[i])
				min=dp[i];
		}
		System.out.println(min);
	}
}
