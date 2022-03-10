public class Brad99 {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 3;
        int start = 1;

        for (int k = 0; k < rows; k++){
            for (int j = 1; j<=9; j++){
                for(int i = start; i<= (start+cols-1); i++){

                    int newi = i + k * cols;
                    int r = newi * j;
                    System.out.printf("%d x %d = %d\t", newi, j, r);

                }
                System.out.println();    
            }
            System.out.println("----");

        }



    }
}
