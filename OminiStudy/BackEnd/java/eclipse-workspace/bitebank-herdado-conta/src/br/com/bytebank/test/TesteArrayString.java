package br.com.bytebank.test;

public class TesteArrayString {

	public static void main(String[] args) {
				
		System.out.println("Funcionou!");
		
		try {
			for(int i = 0; i <= args.length; i++) {
				System.out.println(args[i]);
			}
		} catch (Exception ex) {
			return;
		}
		
	}

}
