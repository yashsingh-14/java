 class LableBreak {
    
    public static void main(String[] args) {
        System.out.println("===========Unlabled Break==============");

        for (int i = 1; i <= 3;i++){
            for (int j = 1; j <= 3; j++){
                if (i == 2) {
                    break; // exits the inner loop 
                }
                System.out.println("i = " + i +",j = "+j);
            }
        }
         System.out.println("===========Unlabled Break==============");
        outer:
          for (int i = 1; i <= 3;i++){
            for (int j = 1; j <= 3; j++){
                if (i == 2) {
                    break outer; // exits the outer loop labled
                }
                System.out.println("i = " + i +",j = "+j);

    }

}
}
 }

