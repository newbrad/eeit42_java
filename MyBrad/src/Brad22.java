public class Brad22 {
    public static void main(String[] args) {
        // 1 + 2 + ... + n = ?
        int n = 100;
        int a = 1, sum = 0;
        while (a<=n){
            sum += a++;
        }
        System.out.printf("1 + 2 + ... + %d = %d", n, sum);

    }
}
