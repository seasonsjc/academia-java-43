/**
 * Classe com o objetivo de praticar arrays de tipos primitivos e reference.
 * 
 * @author Melissa
 */
class ParametrosMain {
  /**
   * Método para que esta classe possa ser executada com o utilitário java.
   * 
   * @param args
   *          - argumentos para o método main
   */
  public static void main(String[] args) {
      if(args.length < 5) {
          System.out.println("O uso correto da classe é");
          System.out.println("java ParametrosMain <nome> <data nascimento> <rg> <sexo> <salario>");
      } else {
	String nome = args[0];
	String dataNascimento = args[1];
	String rg = args[2];
	String salario = args[3];
	String sexo = args[4];
	String textNome = "O(a) Senhor(a) " + nome;
	String textNasc = ", nascido(a) em " + dataNascimento;
	String textRg = " portador(a)do rg de numero " + rg + ", \n";
	String textSexo = " do sexo " + sexo;
	String textTrabalho = ", está registrado(a) com o salário de R$ " + salario
	    + ".";
	System.out.println(textNome + textRg + textNasc + textSexo + textTrabalho);
      }
  }
}
