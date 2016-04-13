class ImprimeMeses {

    public static void main (String[] args){

        int numMes = 1;
        switch (numMes) {
            case 4 :
            case 1 :
            System.out.println("Mes de Abril ou Janeiro");
            break;

            case 2 :
            System.out.println("Mes de Fev");
            break;
            case 5 :
            System.out.println("Mes de Maio");
            //break;
            case 3 :
            System.out.println("Mes de Março");
            System.out.print("..");
            System.out.print("...");
            System.out.print("....");
            System.out.print(".....");
            break;
            case 6 :
            System.out.println("Mes de Junho");
            break;
            default:
            System.out.println("Mes Bla .... ");


        }

    }

}
