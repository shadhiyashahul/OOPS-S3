import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class test implements ActionListener
{
	JLabel l;
	JTextField t;
	JButton b;
	test(){
		JFrame f = new JFrame("TEXT");
		l = new JLabel("WRITE");
		t = new JTextField(20);
		b = new JButton("SUBMIT");
		JPanel p = new JPanel(new GridLayout(3,1));
		p.add(l); 
		p.add(t); 
		p.add(b); 
		b.addActionListener(this);
		f.add(p);
		f.setSize(400,400);
		f.show();
	}
	public void actionPerformed(ActionEvent e){
		String s = e.getActionCommand();
		if(s.equals("SUBMIT")){
			String a = t.getText();
			l.setText(a);
		}
	}
	public static void main (String args[]){
	
		test t = new test();
	}
}	
	
