package swing;

import javax.swing.*;

import javax.swing.JFrame;

public class MainWindow extends JFrame {
	
	private JMenuBar menuBar = new JMenuBar();
	private JMenu fileMenu = new JMenu("File");
	private JMenu editMenu = new JMenu("Edit");
	private JMenu helpMenu = new JMenu("Help");
	private JMenuItem newMenuItem = new JMenuItem("New");
	private JMenuItem saveMenuItem = new JMenuItem("Save");
	private JMenuItem saveAsMenuItem = new JMenuItem("Save As...");
	
	public MainWindow() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.add(menuBar);
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(helpMenu);
		fileMenu.add(newMenuItem);
		fileMenu.add(saveMenuItem);
		fileMenu.add(saveAsMenuItem);
	}
	
	public static void main(String[] args) {
		MainWindow window = new MainWindow();
		window.setSize(500, 300);
		window.setLocationRelativeTo(null);
		window.setVisible(true);
	}

}
