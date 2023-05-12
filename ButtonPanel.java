

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class ButtonPanel extends JPanel {
    private JButton add;
    private JButton clear;

	Border emptyborder = BorderFactory.createEmptyBorder();
    ButtonPanel() {
		this.setPreferredSize(new Dimension(400, 60));
		// this.setBackground(Color.RED);
		this.setBackground(new Color(48, 25, 52));
		add = new JButton(" Add Task ");
		// add.setBorder(emptyborder);
		add.setBorder(BorderFactory.createLineBorder(Color.black));
		add.setFont(new Font("ARIAL", Font.PLAIN, 20));
		// add.setVerticalAlignment(alignment);
		this.add(add);
		this.add(Box.createHorizontalStrut(20));
		clear = new JButton(" Clear Completed ");
		clear.setBorder(BorderFactory.createLineBorder(Color.black));
		clear.setFont(new Font("ARIAL", Font.PLAIN, 20));
		// add.setVerticalAlignment(alignment);
		this.add(clear);
    }

	public JButton getAdd() {
		return add;
}

	public JButton getClear() {
		return clear;
	}
}
