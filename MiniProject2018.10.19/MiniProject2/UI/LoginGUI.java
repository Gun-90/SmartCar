package MiniProject2.UI;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import MiniProject2.Company_Controller;

public class LoginGUI extends JFrame {
	// DAO
	private Company_Controller cc = new Company_Controller();
	// Img
	private ImageIcon icon = new ImageIcon("./src/MiniProject2/panel_images/login_img.PNG");
	private JPanel panel;

	// Field
	public JTextField inputId;
	public JPasswordField inputPw;

	// �˸� ��
	public JLabel alertLabel, idLabel, pwLabel;

	// Button
	public JButton loginBtn, signUpBtn, exitBtn;

	public LoginGUI() {
		setTitle("�α��� â");

		// imgPanel����
		panel = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				// TODO Auto-generated method stub
				g.drawImage(icon.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		panel.setLayout(null);
		// Field ����
		inputId = new JTextField();
		inputPw = new JPasswordField();

		// ��ư ����
		loginBtn = new JButton("�α���");
		signUpBtn = new JButton("ȸ������");
		exitBtn = new JButton("�����ϱ�");

		// �˸� �� ����
		alertLabel = new JLabel("ȸ��");
		alertLabel.setFont(new Font("�޸�����ü", Font.TYPE1_FONT, 20));
		alertLabel.setForeground(Color.BLACK);

		idLabel = new JLabel("ID : ");
		idLabel.setFont(new Font("�޸�����ü", Font.TYPE1_FONT, 20));
		idLabel.setForeground(Color.WHITE);

		pwLabel = new JLabel("PW : ");
		pwLabel.setFont(new Font("�޸�����ü", Font.TYPE1_FONT, 20));
		pwLabel.setForeground(Color.WHITE);

		// Field ��ġ
		inputId.setBounds(230, 180, 200, 25);
		inputPw.setBounds(230, 230, 200, 25);

		// ��ư ��ġ
		loginBtn.setBounds(470, 180, 100, 50);
		signUpBtn.setBounds(190, 290, 160, 40);
		exitBtn.setBounds(380, 290, 160, 40);

		// �� ��ġ,ũ��
		alertLabel.setBounds(100, 130, 500, 50);
		idLabel.setBounds(100, 180, 150, 40);
		pwLabel.setBounds(100, 230, 150, 40);

		// field
		panel.add(inputId);
		panel.add(inputPw);

		// btn
		panel.add(loginBtn);
		panel.add(exitBtn);
		panel.add(signUpBtn);

		// label
		panel.add(alertLabel);
		panel.add(idLabel);
		panel.add(pwLabel);

		add(panel);

		setBounds(300, 200, 750, 560);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// ��ư �׼�
		loginBtn.addActionListener(new LoginListener());
		signUpBtn.addActionListener(new ActionSignUp());
		exitBtn.addActionListener(new ExitListener());
	}

	public boolean idExistenceCheck(String id) {
		// TODO Auto-generated method stub

		return cc.idCheck(id);
	}

	public boolean pwCheck(String pw) {
		// TODO Auto-generated method stub
		return cc.pwCheck(pw);
	}

	public boolean stateCheck(String id) {
		// TODO Auto-generated method stub
		return cc.authorityCheck(id);
	}

	class LoginListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String id = inputId.getText();
			if (idExistenceCheck(id)) {
				if (pwCheck(new String(inputPw.getPassword()))) {
					JOptionPane.showMessageDialog(null, "�α��� ����");

					if (stateCheck(id)) {
						new MainScreenGUI(true, id);
					} else {
						new MainScreenGUI(false, id);
					}
					dispose();
				} else {
					JOptionPane.showMessageDialog(null, "��й�ȣ�� Ʋ���ϴ�.");
				}
			} else {
				JOptionPane.showMessageDialog(null, "�������� �ʴ� ID�Դϴ�.");
			}
		}

	}

	class ActionSignUp implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) { // ȸ�������̸� ���⼭ SignUpŬ���� ȣ���ؼ�.
			new SignUpGUI();
		}
	}

	class ExitListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			dispose();
		}

	}

}