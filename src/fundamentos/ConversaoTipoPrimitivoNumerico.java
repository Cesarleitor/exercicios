
package fundamentos;



public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
		
		double a = 1; // implícita
		System.out.println(a);
		
		float b = (float) 1.123456788888;  //explícita (CAST)
	    System.out.println(b);
	    
	    int c = 340;  //explícita
	    byte d = (byte) c;
	    System.out.println(d);
	    
	    double e = 1.9999999;
	    int f = (int) e;
	    System.out.println(f);
	    
		
	}
}
