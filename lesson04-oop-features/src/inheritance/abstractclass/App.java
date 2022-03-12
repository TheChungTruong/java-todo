package inheritance.abstractclass;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

public class App {
	public static void main(String[] args) {
		EmailService es1 = new BusinessEmailServiceImpl();
		es1.login();
		EmailService se  = new StandardEmailServicelmpl();
		se.login();
		 EmailService service = new EmailService() {
			
			@Override
			void login() {
				// TODO Auto-generated method stub
				System.out.println("Anonymous class >> login ...");
			}
		};
		service.login();
		JButton button = new JButton("stop");
		button.addMouseListener(new MouseListener() {

			

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			

		
			
			
		});
	}

}