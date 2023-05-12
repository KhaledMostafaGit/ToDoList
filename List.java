import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class List extends JPanel {
	List() {
		GridLayout layout = new GridLayout(12, 1);
		layout.setVgap(5);
		this.setBackground(new Color(48, 25, 52));
		// this.setBackground(Color.cyan);
		this.setLayout(layout);
	}

	public void updateNumbers() {
		Component[] listItems = this.getComponents();
		for (int i = 0; i < listItems.length; i++) {
			if (listItems[i] instanceof Tasks) {
				((Tasks) listItems[i]).changeIndex(i + 1);
			}
		}
	}

	public void removeCompleted() {
		Component[] listItems = this.getComponents();
		for (Component listItem : listItems) {
			if (listItem instanceof Tasks) {
				if (((Tasks) listItem).checked == true) {
					remove((listItem));
				}
			}
		}
	}
}
