import java.util.Scanner;

public class Brad04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("1 => ");
        int var1 = scanner.nextInt();
        System.out.print("2 => ");
        int var2 = scanner.nextInt();

        int r1 = var1 + var2;
        int r2 = var1 - var2;
        int r3 = var1 * var2;
        int r4 = var1 / var2;
        int r5 = var1 % var2;
        
        System.out.printf("%d + %d = %d\n", var1, var2, r1 );
        System.out.printf("%d - %d = %d\n", var1, var2, r2 );
        System.out.printf("%d x %d = %d\n", var1, var2, r3 );
        System.out.printf("%d / %d = %d ...... %d\n", var1, var2, r4, r5 );
        System.out.printf("%d %% %d = %d ...... %d\n", var1, var2, r4, r5 );
        System.out.printf("%d %s %d = %d ...... %d\n",
             var1, "%", var2, r4, r5 );
        scanner.close();
    }
}
