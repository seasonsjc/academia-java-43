class PagaConta {

    public static void main (String[] args) {

        // <tipo> <nome> [= valor ];

        String loja = "Carne das Lojas CEM";
        String produto = "TV de Led";
        double valorTotalCompra = 2300.00;
        int totalParcelas = 18;

        // Saber qual eh o valor de Cada Parcela
        double valorParcela = valorTotalCompra / totalParcelas;

        // Adicionar 0.123 de juros nas parcelas
        double valorParcelaComJuros = valorParcela * 1.123;

        // Imprimir o total + juros do carne
        double valorTotalParcelaComJuros = valorParcelaComJuros * totalParcelas;
        System.out.println ("Total valorTotalParcelaComJuros :_( "
                                            + valorTotalParcelaComJuros );

        // Pagar um numero X de Parcelas
        int totalParcelasPagas = 5;

        // Avaliar se o carne esta totalmente quitado
        valorTotalParcelaComJuros -= valorParcelaComJuros * totalParcelasPagas;
        System.out.println ("Saldo Contrato :_( "
                                            + valorTotalParcelaComJuros );

        if (valorTotalParcelaComJuros == 0) {
            System.out.println ("Ufa ... ja foi um rim ... ");
        }

        boolean desejaQuitar = true;
        int numParcelas = 10;

        if ( valorTotalParcelaComJuros > 0 && desejaQuitar  ) {
            System.out.println ("Saldo é de " + valorTotalParcelaComJuros);
        } else {
            System.out.println ("Ainda falta ... um montao ... de "
                                    + valorTotalParcelaComJuros);
        }





    }



}
