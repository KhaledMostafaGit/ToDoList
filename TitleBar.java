

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class TitleBar extends JPanel {
    // constructor
    TitleBar() {
		this.setPreferredSize(new Dimension(400, 60));
		this.setBackground(new Color(48, 25, 52));
        // this.setBackground(Color.BLACK);
		JLabel titlebartext = new JLabel("ToDo List");
        titlebartext.setPreferredSize(new Dimension(200, 70));
		titlebartext.setFont(new Font("San-serif", Font.BOLD, 28));
        titlebartext.setHorizontalAlignment(JLabel.CENTER);
		titlebartext.setForeground(Color.white);
        this.add(titlebartext);
    }
}
