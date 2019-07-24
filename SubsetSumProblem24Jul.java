class Main
{
	public static boolean isSubSetSum(int[] set,int n,int sum)
	{
		if(sum == 0)
			return true;
		if(sum != 0 && n == 0)
			return false;
		if(sum<set[n-1])
			return isSubSetSum(set,n-1,sum);
		else
			return isSubSetSum(set,n-1,sum -set[n-1])||isSubSetSum(set,n-1,sum);
	}
	public static void main(String[] argv)
	{
int set[] = {3, 34, 4, 12, 5, 2}; 
  int sum = 9;
  System.out.println(isSubSetDyn(set,set.length,sum));
	}

	public static  boolean isSubSetDyn(int[] set,int n,int sum)
	{
		boolean[][] subset = new boolean[n+1][sum+1];
		
		for(int i=0;i<=n;i++)
		{
			subset[i][0] = true;
		}
		for(int j=1;j<=sum;j++)
		{
			subset[0][j] = false;
		}
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=sum;j++)
			{
				if(j<set[i-1])
				{
					subset[i][j] = subset[i-1][j];
				}
				if(j>=set[i-1])
				{
					subset[i][j] = subset[i-1][j] || subset[i-1][j-set[i-1]];
				}
			}
		}
		return subset[n][sum];
	}	
}
