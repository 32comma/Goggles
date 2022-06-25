package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainFrame extends JFrame {
	private JPanel mainPanel = new JPanel();
	private Image programIcon = Toolkit.getDefaultToolkit().getImage("img/dictionary.png");
	private JTextField searchField = new JTextField();
	private Icon logoPng = new ImageIcon("img/dictionary_64.png");
	private JLabel logoLabel = new JLabel(logoPng);
	private JLabel gogglesLabel = new JLabel("Goggles");
	private JButton searchButton = new JButton("검색");
	private JButton searchScreenButton = new JButton("검색화면");

	public MainFrame() {
		setIconImage(programIcon);
		setTitle("Goggles");
		setResizable(false);
		mainPanel.setBackground(Color.white);
		setLayout(new BorderLayout());
		mainPanel.setLayout(null);
		logoLabel.setBounds(920, 641, 64, 64);
		mainPanel.add(logoLabel);
		gogglesLabel.setFont(new Font("나눔바른펜", Font.PLAIN, 23));
		gogglesLabel.setBounds(468, 243, 81, 33);
		mainPanel.add(gogglesLabel);

		searchField.setBounds(271, 305, 388, 23);
		mainPanel.add(searchField);
		searchField.setColumns(10);

		searchButton.setFont(new Font("나눔바른펜", Font.PLAIN, 12));
		searchButton.setBounds(657, 305, 95, 23);
		JButton favoriteButton = new JButton("즐겨찾기");
		favoriteButton.setBounds(861, 56, 95, 23);
		mainPanel.add(favoriteButton);

		searchButton.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {

			}

		});

		searchScreenButton.setBounds(754, 56, 95, 23);
		mainPanel.add(searchScreenButton);
		mainPanel.add(searchButton);
		add(mainPanel, BorderLayout.CENTER);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1024, 768);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MainFrame();
	}
}
