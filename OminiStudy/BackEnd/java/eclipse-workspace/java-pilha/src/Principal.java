public class Principal {

    public static void main(String[] args) {

    	try {
    	    System.out.println(1/0);
    	} catch(ArithmeticException ex) {
    	    ex.printStackTrace();
    	} catch(NullPointerException ex) {
    	    ex.printStackTrace();    
    	}
    }
}