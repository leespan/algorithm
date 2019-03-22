import java.util.Scanner;


public class sw1206 {
	public static void main(String args[])
	{
		Scanner stdin = new Scanner(System.in);
		int T;
		for(int i=0;i<10;i++)
		{
			T=stdin.nextInt();
			int a[]= new int[T];
			int count =0;
			for(int j=0; j<T;j++)
			{
				int b= stdin.nextInt();
				a[j]=b;
			}
			for(int k=2;k<T-2;k++ )
			{
				int max1=a[k];
				int max2=0;
				for(int l=k-2;l<=k+2;l++)
				{
					if(max1<=a[l])
						max1=a[l];
				}
					if(max1==a[k])
					{
						a[k]=0;
						for(int c=k-2;c<=k+2;c++)
						{
							if(max1<=a[c])
								max2=a[c];
						}
						count= count+(max1-max2);
					}
					else break;
			}
		}
	}
}
