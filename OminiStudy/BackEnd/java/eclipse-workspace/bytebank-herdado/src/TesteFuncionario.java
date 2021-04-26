
public class TesteFuncionario {

	public static void main(String[] args) {

		Gerente funcionario = new Gerente("Pedro Alberto", "222.222.222-22");
		funcionario.setSalario(9365.00);
		
		System.out.println(funcionario.getBonificacao());

	}

}
