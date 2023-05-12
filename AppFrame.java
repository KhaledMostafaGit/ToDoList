
import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class AppFrame extends JFrame {
    private TitleBar title;
    private List list;
    private ButtonPanel btnPanel;

	private JButton addTask;
	private JButton clearTask;
    AppFrame() {
        this.setSize(400, 700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
		// this.setBackground(new Color(48, 25, 52));
		// this.setBackground(Color.BLACK);
        title = new TitleBar();
        btnPanel = new ButtonPanel();
        list = new List();
        this.add(title, BorderLayout.NORTH);
        this.add(btnPanel, BorderLayout.SOUTH);
		this.add(list, BorderLayout.CENTER);

		addTask = btnPanel.getAdd();
		clearTask = btnPanel.getClear();

		addListeners();

	}

	public void addListeners() {
		addTask.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Tasks task = new Tasks();
				list.add(task);
				list.updateNumbers();

				task.getDone().addMouseListener(new MouseAdapter() {
					@Override
					public void mousePressed(MouseEvent e) {
						task.changeState();
						revalidate();
					}
				});
				revalidate();
			}
		});
		clearTask.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				list.removeCompleted();
				revalidate();
				repaint();
			}
		});
    }
}
