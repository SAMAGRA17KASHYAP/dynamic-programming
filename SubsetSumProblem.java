class Main
{
	public static void main(String[] argv)
	{
	int arr[] = {1, 2, 3}; 
        int m = arr.length; 
        int n = 11; 
        System.out.println(subSetProblem(arr, m-1, n));
	}
	public static  boolean subSetProblem(int[] arr,int m,int n)
	{
		if(n==0)
			return true;
		if(m<0)
			return false;
		return subSetProblem(arr,m-1,n-arr[m])|| subSetProblem(arr,m-1,n); 
	}
}
