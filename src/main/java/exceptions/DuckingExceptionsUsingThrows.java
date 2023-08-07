package exceptions;

class A{
    public void show() throws ClassNotFoundException {
//      try
//    	{
//    		Class.forName("Calc");
//    	}
//    	catch(ClassNotFoundException e)
//    	{
//    		System.out.println("Not able to find theh class");
//    	}

        Class.forName("Calc");
    }
}
public class DuckingExceptionsUsingThrows {
    public static void main( String[] arg ){

//        try
//    	{
//    		Class.forName("Class");
//    	}
//    	catch(ClassNotFoundException e)
//    	{
//    		System.out.println("Not able to find theh class");
//    	}


        A obj = new A();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
             System.out.println("class not found " + e);
        }
    }
}