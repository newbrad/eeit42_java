import javax.swing.JFrame;

public class Brad01 extends JFrame{
    public Brad01(){
        super("我的視窗城市");
        setVisible(true);
        setSize(640, 480);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args){
        new Brad01();
    }    
}
