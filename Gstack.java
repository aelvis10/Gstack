package genericstack;

public  class Gstack <T> implements SomeStack<T>
{
	private T []arr;
	private int  top;
	
	@SuppressWarnings("unchecked")
	Gstack(T val)
	{
		this.arr=(T[])new Object[5];//we cant creat an object like this "arr=new arr T[size]
		this.top=0;                 //we must creat it and then cast it
	}
	public void push(T o) 
	{
		this.arr[top++]=o;
		
		
	}
	@Override
	public T pop() {
		
		return this.arr[--top];
	}
	public boolean isEmpty() 
	{
		
		return top==0;
	}
	@Override
	public int getSize() 
	{
		
		return this.arr.length;
	}
	public void  getInfos()
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
	}

}
