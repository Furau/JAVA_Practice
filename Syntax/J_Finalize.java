class J_Book
{
	private String m_name;
	J_Book(String name){
		m_name=name;
	}
	protected void finalize(){
		System.out.println("Book,\""+m_name+"\""+" is destroyed!");
	}
}

public class J_Finalize
{
	public static void main(String args[]){
		J_Book book = new J_Book("Gone with Wind");
		new J_Book("Java How to Program");
		new J_Book("Roman Holiday");
		System.gc();
	}
}