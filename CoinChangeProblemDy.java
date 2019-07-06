import  java.util.Arrays;
class Main
{
	public static void main(String[] argv)
	{
		int arr[] = {1, 2, 3};
        int m = arr.length;
        int n = 4;
        System.out.println(coinChange(arr, n));
	}

	public static int  coinChange(int[] coins,int n)
	{
		int[] table = new int[n+1];
		table[0] = 1;
		for(int i=0;i<coins.length;i++)
		{
			for(int j=coins[i];j<=n;j++)
			{
				table[j] = table[j] + table[j- coins[i]];
			}
			System.out.println(Arrays.toString(table));
		}
		return table[n];
	}
}

