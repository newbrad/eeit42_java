public class Brad19 {
    public static void main(String[] args) {
        int[][] a = new int[3][4];
        int[][] b = new int[3][];
        System.out.println(a[0][0]);
        System.out.println(a.length); 
        System.out.println(a[0].length);
        b[0] = new int[4];
        b[1] = new int[2];
        b[2] = new int[5];
        b[0][2] = 111; b[1][1] = 345; b[2][3]= 789;

        for (int[] vv : b){
            for(int v : vv){
                System.out.print(v + "  ");
            }
            System.out.println();    
        }

    }
}
