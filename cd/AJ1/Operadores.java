/**
 * Classe com o objetivo de praticar a utilização dos operadores com tipos
 * primitivos.
 * 
 * @author Melissa
 */
public class Operadores {
  /**
   * Método para que esta classe possa ser executada com o utilitário java.
   * 
   * @param args
   *          - argumentos para o método main
   */
  public static void main(String[] args) {
	String nome = "Carolina Pereira";
	int idade = 20;
	String rg = "34.654.789-9";
	char sexo = 'F';
	double salario = 1500.0;
	int anoAtual = 2009;
	double aliquota = 0.20;
	int anoNascimento;
	String sexoPorExtenso;
	double impostoDevido;
	System.out.print("O(a) Senhor(a) " + nome + ", nascido(a) no ano de ");
	System.out.println(anoNascimento + ", portador(a) do RG de número " + rg);
	System.out.print(", do sexo " + sexoPorExtenso);
	System.out.print(", está registrado(a) com o salário de R$ " + salario);
	System.out.println(" e pagara R$ " + impostoDevido + " de imposto.");
  }
}
