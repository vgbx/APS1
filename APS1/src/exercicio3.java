import com.senac.SimpleJava.Console;

public class exercicio3 {
	public class Pessoa {
		private String datadenascimento, signo, idade;

		public void run() {
		this.datadenascimento = "";
		this.signo = "";
		this.idade = "";

		}
		public Pessoa(String datadenascimento, String signo, String idade) {
		setdatadenascimento(datadenascimento);
		setsigno(signo);
		setidade(idade);
		}

		public String getdatadenascimento() {
		return datadenascimento;
		}
		public void setdatadenascimento(String datadenascimento) {
		this.datadenascimento = datadenascimento;
		}

		public String getsigno() {
		return signo;
		}
		public void setsigno(String signo) {
		this.signo = signo;
		}

		public String getidade() {
		    return idade;
		}
		public void setidade(String idade) {
		    this.idade = idade;
		}    
	}
}
