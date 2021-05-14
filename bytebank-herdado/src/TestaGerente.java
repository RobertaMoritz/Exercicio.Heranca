
public class TestaGerente {

	public static void main(String[] args) {
		 Gerente roberta = new Gerente();
		 
		 roberta.setNome("Roberta");
		 roberta.setCpf("03300635969");
		 roberta.setSalario(5000);
		 
		 
		 System.out.println(roberta.getNome());
		 System.out.println(roberta.getCpf());
		 System.out.println(roberta.getSalario());

		 roberta.setSenha(1111);
		 
		 boolean autenticou = roberta.autentica(1111);

	        System.out.println(autenticou);
	}

}
