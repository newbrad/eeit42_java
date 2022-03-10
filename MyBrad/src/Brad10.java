import java.util.Scanner;

public class Brad10 {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // int score = scanner.nextInt();
        // scanner.close();

        double temp = Math.random();
        System.out.println(temp);

        double temp2 = temp * 101 + 0;
        int score = (int)temp2;
        System.out.println(score);

        if (score >= 90){
            System.out.println("A");
        }else if (score >= 80){
            System.out.println("B");
        }else if (score >= 70){
            System.out.println("C");
        }else if (score >= 60){
            System.out.println("D");
        }else{
            System.out.println("E");
        }
        
        
        
        System.out.println("Game Over");
    }
}
