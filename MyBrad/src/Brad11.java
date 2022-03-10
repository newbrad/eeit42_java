import java.util.Scanner;

public class Brad11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        scanner.close();        

        if (year % 4 == 0){
            if (year % 100 == 0){
                if (year % 400 == 0){
                    // 29
                }else{
                    // 28
                }
            }else{
                // 29
            }
        }else{
            // 28
        }

        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
            // 29
        }else{
            // 28
        }

    }
}
