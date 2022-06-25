package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LoadingFrame extends JFrame {
	private JPanel mainPanel = new JPanel();
	private Icon loadingIcon = new ImageIcon("img/loading-bar.gif");
	private Image programIcon = Toolkit.getDefaultToolkit().getImage("img/dictionary.png");
	private JLabel loadingLabel = new JLabel(loadingIcon);

	private void init() {
		Connection conn = null;
		Scanner sc = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost";
			conn = DriverManager.getConnection(url, "root", "1234");
			System.out.println("연결성공");
			sc = new Scanner(new File("sql/INIT.sql"));
			String query = "";
			while (sc.hasNext()) {
				query += sc.nextLine();
			}
			System.out.println(query);
			String queryList[] = query.split(";");
			for (int i = 0; i < queryList.length; i++) {
				PreparedStatement pstmt = conn.prepareStatement(query);
				System.out.println(queryList[i]);
				pstmt.execute(queryList[i]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				if (conn != null || !conn.isClosed()) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public LoadingFrame() {
		init();
		mainPanel.setBackground(Color.white);
		mainPanel.setLayout(new BorderLayout());
		mainPanel.add(loadingLabel, BorderLayout.CENTER);
		setIconImage(programIcon);
		setTitle("Goggles");
		setLayout(new BorderLayout());
		add(mainPanel, BorderLayout.CENTER);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1024, 768);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		new LoadingFrame();

	}
}
