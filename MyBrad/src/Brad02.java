public class Brad02 {
    public static void main(String[] args) {
        // 強型別 => 宣告先
        // 整數 byte(2^8: -128 ~ 127), 
        // short(2^16), int(2^32), long(2^64)
        byte var1;
        var1 = 100;
        System.out.println(var1);

        byte var2;  // [a-zA-Z$_][a-zA-Z0-9$_]* and 不可以是關鍵字
        var2 = -128;
        System.out.println(var2);
    }
}
