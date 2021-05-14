
public class Gerente extends Funcionario {

	int Senha;
	
	public int getSenha() {
		return Senha;
	}

	public void setSenha(int senha) {
		Senha = senha;
	}

	public boolean autentica(int senha) {
		
		if (this.Senha == senha) {
			return true;
		}
		else { return false;
		}
	}
	
	}


 