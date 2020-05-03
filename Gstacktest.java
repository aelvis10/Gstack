package genericstack;


public class Gstacktest {

	public static void main(String[] args) {
	Gstack <Integer> st = new Gstack<>(5);
		
		st.push(0);
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		while(true)
		{
			System.out.println(st.pop());
		}
	}

}
