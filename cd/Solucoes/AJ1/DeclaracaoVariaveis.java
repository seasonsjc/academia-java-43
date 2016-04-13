/**
 * Classe com o objetivo de fixar a declaração, inicialização e utilização de
 * variáveis de tipos primitivos e String.
 * 
 * @author Globalcode
 */
public class DeclaracaoVariaveis {
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
	System.out.print("O(a) Senhor(a) " + nome + ", de " + idade);
	System.out.println(" anos, portador(a) do RG de número " + rg + ", ");
	System.out.print("do sexo " + sexo);
	System.out.println(", está registrado(a) com o salário de R$ " + salario);
  }
}
