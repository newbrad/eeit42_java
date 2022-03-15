package tw.brad.tutor;

import java.rmi.AlreadyBoundException;

import javax.swing.undo.CannotRedoException;

public class Brad53 {

	public static void main(String[] args) {
		Bird b1 = new Bird();
		try {
			b1.setLegV2(2);
		}catch(Exception e) {
			
		}
	}

}

class Bird {
	private int leg;
	void setLegV1(int leg) {
		if (leg >= 0 && leg <=2) {
			this.leg = leg;
		}
	}
	void setLegV2(int leg) throws Exception {
		if (leg >= 0 && leg <=2) {
			this.leg = leg;
		}else {
			throw new Exception();
		}
	}

}
