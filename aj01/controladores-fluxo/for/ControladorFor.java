class ControladorFor {

    public static void main(String[] args) {

        boolean active = true;

        if ( ! active  ) return;

        for (int i = 0; i < 10 ; i++ ) {

            if ( i == 0) {
                System.out.print(i);
                continue;
            }



            System.out.print( "," + i);
        }

    }

}
