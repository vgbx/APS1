import com.senac.SimpleJava.Console;

public class exercicio2 {
	class Conta {
		  int numero;
		  String dono;
		  double saldo;
		  double limite;

		}
	class Programa {
		  public void main(String[] args) {
		    Conta minhaConta;
		    minhaConta = new Conta();

		    minhaConta.dono = "Duke";
		    minhaConta.saldo = 1000.0;

		Console.println("Saldo atual: " + minhaConta.saldo);
		  }
		}
	     
	   }
	 