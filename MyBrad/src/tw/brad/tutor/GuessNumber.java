package tw.brad.tutor;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GuessNumber extends JFrame implements ActionListener{
	private JTextField input;
	private JButton guess;
	private JTextArea log;
	private String answer;
	private int counter;
	
	public GuessNumber() {
		super("猜數字遊戲");
		setLayout(new BorderLayout());
		
		input = new JTextField();
		guess = new JButton("猜");
		log = new JTextArea();
		
		add(log, BorderLayout.CENTER);
		
		JPanel top = new JPanel(new BorderLayout());
		add(top, BorderLayout.NORTH);
		
		top.add(guess, BorderLayout.EAST);
		top.add(input, BorderLayout.CENTER);
		
//		guess.addActionListener(new MyListener());
//		guess.addActionListener(this);
//		guess.addActionListener(new MyListenerV2());
		guess.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				doGuess();
				//openFile();
			}
		});
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		newGame();
	}
	
	class MyListenerV2 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.out.println("3");
			System.out.println(createAnswer(4));
		}
	}
	
//	private void openFile() {
//		JFileChooser jfc = new JFileChooser();
//		if (jfc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
//			File openFile = jfc.getSelectedFile();
//			try {
//				FileReader reader = new FileReader(openFile);
//				int c;
//				while ((c = reader.read()) != -1) {
//					log.append((char)c + "");
//				}
//			}catch(Exception e) {
//				
//			}
//		}
//	}
	
	private void doGuess() {
		// TODO 還沒寫完
		counter++;
		String gText = input.getText();
		// 
		String result = checkAB();
		log.setText(String.format("%d. %s => %s\n", 
				counter, gText, result));
		// 清除 input
		
		// if (?A?B .equals("3A0B")) => showResultDialog(true);
		// if (counter == 10) =>showResultDialog(false);
	}
	
	private String createAnswer() {
		return createAnswer(3);
	}
	public static String createAnswer(int dig) {
        int[] poker = new int[10];
        boolean isRepeat;
        int temp;
        for (int i=0; i<poker.length; i++){
            do {
                temp = (int)(Math.random()*10);

                // 檢查機制 
                isRepeat = false;
                for (int j=0; j<i; j++){
                    if (temp == poker[j]){
                        isRepeat = true;
                        break;
                    }
                }
            }while(isRepeat);

            poker[i] = temp;
        }
        StringBuffer sb = new StringBuffer();
        for (int i=0; i<dig; i++) {
        	sb.append(poker[i]);
        }
		return sb.toString();
	}
	
	private String checkAB() {
		// TODO checkAB
		String gtext = input.getText();
		int a, b; a = b = 0;
		for (int i=0; i<answer.length(); i++) {
			if (answer.charAt(i) == gtext.charAt(i)) {
				a++;
			}else if (answer.indexOf(gtext.charAt(i)) != -1) {
				b++;
			}
		}
		return String.format("%dA%dB", a,b);
	}
	
	private void showResultDialog(boolean isWin) {
		JOptionPane.showMessageDialog(null, isWin?"WINNER":"Loser");
	}
	
	private void newGame() {
		// TODO .......
		// counter = 0
		// input, log => clear
		answer = createAnswer(3);
		System.out.println(answer);
	}
	
	public static void main(String[] args) {
		new GuessNumber();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("2");
		System.out.println(createAnswer(4));
	}

}

class MyListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		System.out.println("1");
		System.out.println(GuessNumber.createAnswer(4));
	}
}

