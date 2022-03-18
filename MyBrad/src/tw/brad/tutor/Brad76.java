package tw.brad.tutor;

import java.util.Timer;
import java.util.TimerTask;

public class Brad76 {
	public static void main(String[] args) {
		Timer timer = new Timer();
		MyTask myTask = new MyTask();
		MyStop myStop = new MyStop(timer);
		
		timer.schedule(myTask, 0, 1*1000);
		timer.schedule(myStop, 10*1000);
		
		System.out.println("Main");
	}
}

class MyTask extends TimerTask {
	int i;
	@Override
	public void run() {
		System.out.println(i++);
		//cancel();
	}
}
class MyStop extends TimerTask {
	private Timer timer;
	MyStop(Timer timer){this.timer = timer;}
	@Override
	public void run() {
		System.out.println("finish");
		timer.cancel();
	}
}


