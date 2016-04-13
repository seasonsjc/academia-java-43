class ImprimeMesesComWhile {

    public static void main (String[] args){
        int mes = 0;
        while (mes <= 12) {
            switch (mes) {
                case 1 :
                System.out.println("Mes de Janeiro");
                break;

                case 4 :
                System.out.println("Mes de Abril");
                break;

                case 2 :
                System.out.println("Mes de Fev");
                break;

                case 5 :
                System.out.println("Mes de Maio");
                break;
                case 3 :
                System.out.println("Mes de Março");
                break;
                case 6 :
                System.out.println("Mes de Junho");
                break;

                default:
                System.out.println("Mes Bla .... ");
            }

            mes++;
        }

    }
}
