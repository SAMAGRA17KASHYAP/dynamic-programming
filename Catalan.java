import java.util.*;
class Main
{
	int catalan(int n)
	{
		int res = 0;
		if(n <= 1)
		{
			return 1;
		}
		for(int i=0;i<n;i++)
		{
			res += catalan(i)+catalan(n-i-1);
		}
		return res;
	}
	static int catalanDP(int n)
	{
		int res = 0;
		int[] dp=new  int[n+1];
		dp[0]=1;
		dp[1]=1;
		for(int i=2;i<=n;i++)
		{
			for(int j=0;j<i;j++)
			dp[i]+=  dp[j]*dp[i-1-j];
		}
		System.out.println(Arrays.toString(dp));
		return dp[n];
	}
	static int catalanDPBin(int n)
	{
		int res =1;
		if(n<=1)
			return 1;
		int t= 2*n,num=1,den=1;
		for(int i=0;i<n;i++)
		{
			res = res * (t-i)/(i+1);
			
		}
		return res/(n+1);
	}
	public static void main(String[] argv)
	{
		catalanDP(19);
		for(int i=0;i<=19;i++)
		 System.out.println(catalanDPBin(i));
	}
}
