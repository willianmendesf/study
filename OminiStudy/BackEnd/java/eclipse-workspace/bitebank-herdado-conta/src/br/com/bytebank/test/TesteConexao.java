package br.com.bytebank.test;
import br.com.bytebank.modelo.Conexao;

public class TesteConexao {
	public static void main(String[] args) {
		
		
		try(Conexao conexao = new Conexao()){
			conexao.leDados();
		} catch (Exception ex) {
			ex.getMessage();
		}
		
		
		
		
//		Conexao con = null;
//		try {
//	    	con = new Conexao();
//	        con.leDados();
//	    } catch(IllegalStateException ex) {
//	        System.out.println("Deu erro na conexao");
//	    } finally {
//	    	if(con != null) {
//	    		con.close();	    		
//	    	}
//	    }
	}
}