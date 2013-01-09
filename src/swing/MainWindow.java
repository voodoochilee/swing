package swing;

import javax.swing.*;


public class MainWindow extends JFrame {
	
	private JMenuBar menuBar = new JMenuBar();
	private JMenu fileMenu = new JMenu("File");
	private JMenu editMenu = new JMenu("Edit");
	private JMenu helpMenu = new JMenu("Help");
	private JMenuItem newMenuItem = new JMenuItem("New");
	private JMenuItem saveMenuItem = new JMenuItem("Save");
	private JMenuItem saveAsMenuItem = new JMenuItem("Save As...");
	private JMenuItem cutMenuItem = new JMenuItem("Cut");
	private JMenuItem copyMenuItem = new JMenuItem("Copy");
	
	
	public MainWindow() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setJMenuBar(menuBar);
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(helpMenu);
		fileMenu.add(newMenuItem);
		fileMenu.add(saveMenuItem);
		fileMenu.add(saveAsMenuItem);
		editMenu.add(cutMenuItem);
		editMenu.add(copyMenuItem);
	}
	
	public static void main(String[] args) {
		MainWindow window = new MainWindow();
		window.setSize(500, 300);
		window.setLocationRelativeTo(null);
		window.setVisible(true);
	}

}
