import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Tasks extends JPanel {
	private JLabel index;
	private JTextField taskname;
	private JButton done;
	public boolean checked;

	Tasks() {
		this.setPreferredSize(new Dimension(40, 20));
		this.setBackground(new Color(170, 152, 169));
		this.setLayout(new BorderLayout());

		checked = false;
		index = new JLabel("");
		index.setPreferredSize(new Dimension(20, 20));
		index.setHorizontalAlignment(JLabel.CENTER);
		this.add(index, BorderLayout.WEST);
		taskname = new JTextField("Task Here");
		taskname.setBorder(BorderFactory.createEmptyBorder());
		taskname.setBackground(new Color(170, 152, 169));

		this.add(taskname, BorderLayout.CENTER);
		done = new JButton("Done");
		done.setPreferredSize(new Dimension(40, 20));
		done.setBorder(BorderFactory.createEmptyBorder());
		done.setBackground(new Color(230, 230, 250));
		this.add(done, BorderLayout.EAST);
	}

	public JButton getDone() {
		return done;
	}


	public void changeIndex(int num) {
		this.index.setText(num + "");
		revalidate();
	}

	public void changeState() {
		this.setBackground(Color.white);
		taskname.setBackground(Color.white);
		checked = true;
	}

}
