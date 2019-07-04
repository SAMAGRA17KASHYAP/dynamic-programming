class Main
{
	public static void main(String[] args)
	{
		if(args.length == 0)
			throw new IllegalArgumentException("illegal");
		int n = Integer.parseInt(args[0]);
		int i=1,count=0;
		while(n!=count)
		{
			if(isUgly(i))
			{
				count++;
			}
			i++;
		}
		System.out.println(i-1);
	}
	public static  boolean isUgly(int num)
	{
		if(num == 1)
			return true;
		while(num%2 == 0 )
		{
			num = num / 2;
		}
		while(num%3 == 0)
		{
			num = num / 3;
		}
		while(num%5 == `0)
		{
			num = num / 5;
		}

		return num == 1; 

	}
	//
	//5 3 2
	//0 0 0 1
	//0 0 1 2
	//0 1 0 3
	//0 0 2 4
	//1 0 0 5
	//0 1 1 6
	//0 0 3 8
	//0 2 0 9
	//1 0 1 10
}
