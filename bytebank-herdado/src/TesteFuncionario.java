
public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario roberta = new Funcionario();
		
		roberta.setNome("Roberta");
		roberta.setCpf("03300635969");
		roberta.setSalario(5000);
		
		System.out.println(roberta.getNome());
		System.out.println(roberta.getCpf());
		System.out.println(roberta.getBonificacao());
		

	}

}
