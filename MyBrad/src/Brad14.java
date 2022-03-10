public class Brad14 {
    public static void main(String[] args) {
        int a = 1;
        for ( init(); a <= 10 ; drawLine()){
            System.out.println(a++);
        }

        System.out.println("=> " + a);
    }

    public static void init(){
        System.out.println("Brad");
    }
    public static void drawLine(){
        System.out.println("-------");
    }
}
