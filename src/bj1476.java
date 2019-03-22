import java.util.Scanner;


public class bj1476 {
	public static void main(String args[])
	{
	Scanner stdin = new Scanner(System.in);
	int E=stdin.nextInt();
	int S=stdin.nextInt();
	int M=stdin.nextInt();
	int year=1;
	int e=1,s=1,m=1;
	for(;;){
		if(e==E && s==S && m==M){
			break;
		}
		else{
			e++;
			s++;
			m++;
			year++;
		}
		if(e==16) e=1;
		if(s==29) s=1;
		if(m==20) m=1;
	}
	System.out.print(year);
	}
}
