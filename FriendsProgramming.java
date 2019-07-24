class Main
{
	static int getCount(int n)
	{
		int[] dp = new int[n+1];
		for(int i=0;i<=n;i++)
		{
			if(i<=2)
				dp[i] = i;
			else
				dp[i] = dp[i-1] + (i-1) *dp[i-2];
		}
		return dp[n];

	}
	static int getCountWithoutExtraSpace(int n)
	{
		if(n<=2) return n;
		int a = 1;
		int b = 2;
		int c = 0;
		for(int i=3;i<=n;i++)
		{
			c = b + (i-1) * a; 
			a = b;
			b = c;

		}
		return c;
	}

	public static void main(String[] argv)
	{
		for(int i=0;i<=10;i++)
		{
			System.out.print(getCount(i)+"::::::"+getCountWithoutExtraSpace(i));
		System.out.println();
		}
	}
}
