class Main
{
	public static void main(String[] argv)
	{
		int[] coinArr ={2,5,3,6};
		int amt = Integer.parseInt(argv[0]);
		System.out.println(coinChange(coinArr,coinArr.length-1,amt));	
	}

	public static  int coinChange(int[] coins,int coinIndex,int amt)
	{
		if(amt == 0) return 1;
		if(amt<0) return 0;
		if(coinIndex < 0) return 0;
		return coinChange(coins,coinIndex,amt -coins[coinIndex])+coinChange(coins,coinIndex-1,amt)/*This coinIndex is not considered in solution*/;

	}
	

}
