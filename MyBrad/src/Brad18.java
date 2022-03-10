
public class Brad18 {
    public static void main(String[] args) {
        int[] p = new int[7];
        for(int i=0; i<1000000; i++){
            int point = (int)(Math.random()*9+1);   // 1 - 6
            if (point>=1 && point<=9){
                p[ point>6?point-3:point ]++;
            }else{
                p[0]++;
            }
        }
        for (int i=1; i<p.length; i++){
            System.out.printf("%d點出現%d次\n", i, p[i]);
        }       
        if (p[0]>0)System.out.printf("問題點出現%d次\n", p[0]); 
        System.out.println("----");

        // for-each
        for (int v : p){
            System.out.println(v);
        }

    }
}
