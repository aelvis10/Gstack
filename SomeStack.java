package genericstack;

public interface SomeStack<T> 
{
	public void push(T o);
	public T pop();
	public boolean isEmpty();
	public int getSize();

}
