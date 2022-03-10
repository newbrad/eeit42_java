public class Brad16 {
    public static void main(String[] args) {
        int a;
        int[] ary;
        a = 10;
        ary = new int[3];
        System.out.println(a);
        System.out.println(ary[0]);
        System.out.println(ary[1]);
        System.out.println(ary[2]);
        System.out.println("ary len: " + ary.length);
        ary[0] = 123; ary[1] = 321; ary[2] = 777;
        for (int i=0; i<ary.length; i++){
            System.out.println(ary[i]);
        }

    }
}
