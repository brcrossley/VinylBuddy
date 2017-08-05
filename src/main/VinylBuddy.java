package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VinylBuddy extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	
	public int scrW, scrH ,innerW, innerH;
	public VinylBuddy() {
		//setting up frame
		JFrame frame = new JFrame("VinylBuddy");
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		JLabel title = new JLabel("Welcome to VinylBuddy!");
		
		//adding all elements to panel
		panel.add(title);
		//adding panel to frame
		frame.add(panel);
		frame.setSize(800,800);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setResizable(true);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new VinylBuddy();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
	}

}
