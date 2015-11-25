 public class J_Exception1
 {
	 public static void mb_catchException()
	 {
		 try
		 {
			 System.out.println("Try Block");
			 throw new Exception();
		 }
		 catch(Exception e)
		 {
			 System.out.println("Catch Block");
			 e.printStackTrace();
		 }
		 finally
		 {
			 System.out.println("Finally Block");
		 }
	 }
	 public static void main(String args[])
		 {
			 mb_catchException();
		 }
 }