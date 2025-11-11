class TwoDArrey {
    public static void main(String[]args){
        //Declaration and allocation of 3x3 2D Array
        int[][]matrix = new int[3][3];

        //Assigning values
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;

        matrix[1][0] = 4;
        matrix[1][2] = 5;
        matrix[2][2] = 6;

        matrix[2][0] = 7;
        matrix[2][1] = 8;
        matrix[2][2] = 9;

        // you could also do;
        //int [][]matrix = {
        //      [1,2,3],
        //      [4,5,6],
        //      [7,8,9]  
        //  };

        System.out.println("Length of Row "+matrix.length );
        System.out.println("Length of column "+matrix[0].length );
        System.out.println("=====================");

         System.out.println("Accessing 2D Array Through Index" );
        System.out.println("Elements at [1][2]="+matrix[1][2]);   // Output : 6
        System.out.println("=====================");

         System.out.println("Accessing 2D Array Through Nested for loop:" );
         for (int i = 0; i < matrix.length;i++) {
            for (int j = 0; j < matrix[i].length;j++){
                System.out.println(matrix[i][j]+ "");
            }
            System.out.println();
         }
         System.out.println("==================");


         System.out.println("Accessing 2D Array Through Enhanced For Loop:");
         for (int[]row : matrix){
            for (int value : row){
                System.out.println(value +"");
            }
            System.out.println();
         }
         System.out.println("====================");

         System.out.println("Accessing 2D Array of Strings:");
         String[][] names = {
            {"Alice","Bob","Charlie"},
            {"Alice1","Bob2","Charlie3"},
            {"Alice4","Bob5","Charlie6"},
         };
         for (String[] row : names){
            for (String name : row){
                System.out.println(name +"");

            }
            System.out.println();
         }
    }
}

