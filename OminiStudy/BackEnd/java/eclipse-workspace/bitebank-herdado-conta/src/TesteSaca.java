
public class TesteSaca {

	public static void main(String[] args) {
		
		ContaCorrente c = new ContaCorrente(123,123);
		c.deposita(200.0);
		c.saca(252.20);
		
		System.out.println(c.getSaldo());
	}

}
