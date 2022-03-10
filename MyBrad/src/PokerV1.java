public class PokerV1 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int[] poker = new int[52];
        for (int i=0; i<poker.length; i++){
            int temp = (int)(Math.random()*52);

            // 檢查機制 
            boolean isRepeat = false;
            for (int j=0; j<i; j++){
                if (temp == poker[j]){
                    isRepeat = true;
                    break;
                }
            }

            // isRepeat => true/false
            if (!isRepeat){
                poker[i] = temp;
            }else{
                i--;
            }
        }
        System.out.println("ms : " + (System.currentTimeMillis()-start));
        // 驗證
        for(int v : poker){
            System.out.println(v);
        }



    }
}
