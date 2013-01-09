package swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

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
	
	private JLabel nameLabel = new JLabel("Name");
	private JTextField nameTextField = new JTextField(20);
	private JButton submitButton = new JButton("Submit");
	private JCheckBox qualifiedCheckBox = new JCheckBox("Qualified");
	private JCheckBox completedCheckBox = new JCheckBox("Completed");
	
	private JRadioButton primaryRadioButton = new JRadioButton("Primary");
	private JRadioButton secondaryRadioButton = new JRadioButton("Secondary");
	private JRadioButton thirdLevelRadioButton = new JRadioButton("Third Level");
	private ButtonGroup buttonGroup = new ButtonGroup();
	private ButtonGroup checkBoxButtonGroup = new ButtonGroup();
	
	
	
	public MainWindow() {
		this.setLayout(new FlowLayout());
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
		this.add(nameLabel);
		this.add(nameTextField);
		//this.add(submitButton);
		this.add(qualifiedCheckBox);
		this.add(completedCheckBox);
		checkBoxButtonGroup.add(qualifiedCheckBox);
		checkBoxButtonGroup.add(completedCheckBox);
		qualifiedCheckBox.setSelected(true);
		this.add(primaryRadioButton);
		this.add(secondaryRadioButton);
		this.add(thirdLevelRadioButton);
		buttonGroup.add(primaryRadioButton);
		buttonGroup.add(secondaryRadioButton);
		buttonGroup.add(thirdLevelRadioButton);
		primaryRadioButton.setSelected(true);
	}
	
	public static void main(String[] args) {
		String lookAndFeel = UIManager.getSystemLookAndFeelClassName();
		try {
			UIManager.setLookAndFeel(lookAndFeel);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		MainWindow window = new MainWindow();
		window.setSize(500, 300);
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		window.playSequenceOfEvents();
	}
	
	private void playSequenceOfEvents() {
		JOptionPane.showMessageDialog(this, "The app started up ok");
		int response = JOptionPane.showConfirmDialog(this, "Do you want to continue?", "Continue?", JOptionPane.YES_NO_OPTION);
		if(response == JOptionPane.YES_OPTION) {
			System.out.println("You clicked YES");
		}
		else if(response == JOptionPane.NO_OPTION) {
			System.out.println("You clicked NO");
		}
		String answer = JOptionPane.showInputDialog(this, "What's the capital of France?");
		if(answer != null) {
			System.out.println(answer);
		}
		
	}

}
