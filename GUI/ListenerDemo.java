//Simple window and button GUI
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ListenerDemo{
	private JPanel controlPanel;
	private JPanel panel;
	private JFrame frame;
	private JButton button;
	
	//constructor
	public ListenerDemo(){
		frame = new JFrame("ListenerDemo");
		frame.setSize(500,400);
		frame.setLayout(new GridLayout(3, 1));
		
		controlPanel = new JPanel();
		controlPanel.setLayout(new FlowLayout());
		frame.add(controlPanel);
		
		//add close window event
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent){
            			System.exit(0);
         		}      
		});
		
		//show objects
		show();
		
		frame.setVisible(true);
	}
	
	//main
	public static void main(String[] args){
		ListenerDemo demo = new ListenerDemo();
	}
	
	//show button
	private void show(){
	
		//panel for button
      		panel = new JPanel();
	  
		//create button and add to panel
      		button = new JButton("OK");
		button.addActionListener(new ButtonListener());
      		panel.add(button);
      		controlPanel.add(panel);
		frame.setVisible(true);
	}
	
	//ActionListener for button
	class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			button.setText("Works!");
		}
	}
}
