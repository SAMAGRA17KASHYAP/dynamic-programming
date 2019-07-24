class Main
{
	public static int friendsPair(int n)
	{
		int[] dp = new int[n+1];
		for(int i=0;i<=n;i++)
		{
			if(i<=2)
				dp[i] = i;
			else
				dp[i] = dp[i-1] + (i-1) * dp[i-2];
		}
		return dp[n];
	}
	public static void main(String[] argv)
	{
		int n=4;
		System.out.println(friendsPair(n));
	}
}
