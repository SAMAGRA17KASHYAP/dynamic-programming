class Main
{
	public static int getNumber(int n)
	{
		int i2=0,i3=0,i5=0;
		int[] arr = new int[n];
		arr[0]=1;
		int val_i2 = arr[0]*2;
				int val_i3= arr[0]*3;
int val_i5 = arr[0]*5;

		for(int i=1;i<n;i++)
		{
			int next_number = Math.min(val_i2,Math.min(val_i3,val_i5)) ;
			arr[i] = next_number;
			if(arr[i]==val_i2)
			{
				i2++;
				val_i2 = arr[i2]*2;
			}
			if(arr[i] == val_i3)
			{
				i3++;
				val_i3 = arr[i3] *3;
			}
			if(arr[i] == val_i5)
			{
				i5++;
				val_i5 = arr[i5]*5;
			}

		}
		System.out.println(java.util.Arrays.toString(arr));
		return arr[n-1];
	}
	public static void main(String[] str)
	{
		getNumber(10);
	}
}
