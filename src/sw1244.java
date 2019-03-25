import java.util.Scanner;

public class sw1244 {
	public static void main(String args[])
	{
		Scanner stdin = new Scanner(System.in);
		int T=stdin.nextInt();
		
		for(int i=0; i<T; i++)
		{
			int b=stdin.nextInt();
			int c=stdin.nextInt();
			int n=0;
			int temp =b;
			while(temp!=0) {
				n++;
				temp/=10;
			}
			int[] a= new int[n];
			for(int j=n-1;j>=0;j--) {
				a[j]=b%10;
				b/=10;
			}//여기까지가 배열에 숫자넣음
			while(c!=0) {
				int tmp=0,swp;
				int max=-1;
			for(int k=0; k<n; k++)
			{
				for(int l=n-1;l>k;l--)
				{
					if(max<a[l]) {
						max=a[l];
						tmp=l;
					}
					if(a[k]<max) {
						swp=a[k];
						a[k]=a[tmp];
						a[tmp]=swp;
					}
				}
			}
			c--;
			}
			for(int u=0;u<n;u++)
				System.out.print(a[u]);
			System.out.println();
		}
	}
}
