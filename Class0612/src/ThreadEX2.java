import javax.swing.JOptionPane;

public class ThreadEX2 {

	public static void main(String[] args) {
		ThreadEX2_1 th1 = new ThreadEX2_1();
		th1.start();
		
		String input = JOptionPane.showInputDialog("�ƹ����̳� �Է��ϼ���");
		System.out.println("�Է��Ͻ� ����" + input + "�Դϴ�.");				
	}
}

class ThreadEX2_1 extends Thread{
	public void run() {
		for(int i = 10; i > 0; i--) {
			System.out.println(i);
			try {sleep(1000);} catch(Exception e) {}
		}
	}
}