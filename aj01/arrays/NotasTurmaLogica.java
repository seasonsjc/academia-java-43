class NotasTurmaLogica {

    public static void main(String[] args) {

        String[] nomes = new String[10];
        float[] notas = new float[10];

        System.out.println("Nomes " + nomes);
        System.out.println("Tamanho de Nomes " + nomes.length );
        System.out.println("Nomes[1] " + nomes[1]);

        System.out.println("Notas " + notas);
        System.out.println("Notas[1] " + notas[1]);

        System.out.println ("Aluno " + nomes[0] + " - " + notas[0]);

        notas[0] = 6.5F;
        notas[1] = 6.7F;
        System.out.println ("Aluno " + nomes[1] + " - " + notas[1]);

        for (int i = 0 ; i < nomes.length ; i++ ) {
            nomes[i] = "Aluno Matricula - 00" + ( i +20 );
            notas[i] = 6.5F + 0.2F*i;
        }

        for (int i = 0 ; i < 10 ; i++ ) {
            System.out.println ( nomes[i] + " - " + notas[i]);
        }


    }

}
