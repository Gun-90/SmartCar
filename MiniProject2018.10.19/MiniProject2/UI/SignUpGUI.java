package MiniProject2.UI;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import java.util.regex.Pattern;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import MiniProject2.Company_Controller;
import MiniProject2.Vo.SeekerVO;

public class SignUpGUI extends JFrame {
	// DAO

	private Company_Controller cc = new Company_Controller();
	// Img

	private JPanel panel;

	/**
	 * ID중복체크버튼,입력한pw값 같은지 체크버튼,가입버튼,취소버튼
	 * 
	 */
	private JButton idCheckBtn, pwCheckBtn, agreeBtn, denyBtn;

	/**
	 * ID 입력칸, 나이 입력칸, 관심분야 입력칸, 사는지역 입력칸
	 */
	private JTextField inputIdField, inputage, inputField, inputArea;

	/**
	 * 첫번째 pw칸,두번째 pw칸
	 */
	private JPasswordField inputPw1Field, inputPw2Field;
	/**
	 * 회원가입창에 알림메시지,id,pw,최종학력,나이,관심분야,사는지역,상태알려주는 글
	 */
	private JLabel AlertLabel, idLabel, pw1Label, pw2Label, finalEduLabel, ageLabel, fieldLabel, areaLabel, belongLabel;

	/**
	 * 최종학력 콤보박스
	 */
	private JComboBox<String> FinalEduFieldCombo;
	private String[] finalEduFieldList = { "고등학교졸업", "2년제졸업", "3년제졸업", "4년제졸업", "4년제 졸업예정", "석사", "박사" };
	/**
	 * 상태체크 라디오버튼
	 */
	private JRadioButton belongRadio1, belongRadio2;
	private ButtonGroup belongGroup;
	/**
	 * id중복체크저장변수,pw유효성검사체크저장변수
	 */
	private boolean idCheck, pwCheck;

	/**
	 * fieldWidth(200),
	 */
	private int fieldWidth = 200;
	/**
	 * fieldHeight(30)
	 */
	private int fieldHeight = 30;
	/**
	 * btnWidth(110)
	 */
	private int buttonWidth = 110;
	/**
	 * btnHeight(35)
	 */
	private int buttonHeight = 35;
	/**
	 * 회원가입 화면 이미지
	 */
	private ImageIcon icon = new ImageIcon("./src/Test/panel_images/signinImg.PNG");

	public SignUpGUI() {
		// Frame Setting
		setTitle("회원가입");
		setBounds(1000, 0, 680, 1000);

		// 배경이미지 삽입
		panel = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				// TODO Auto-generated method stub
				g.drawImage(icon.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		/****************************** NEW ********************************/
		// 입력창생성

		inputIdField = new JTextField(); // 아이디 입력. - 중복체크 버튼 옆에 넣고.
		inputPw1Field = new JPasswordField(); // 패스워드 입력.
		inputPw2Field = new JPasswordField(); // 패스워드 재확인.
		inputage = new JTextField();
		inputField = new JTextField();
		inputArea = new JTextField();

		// 콤보박스
		FinalEduFieldCombo = new JComboBox<String>(finalEduFieldList);

		// 라디오
		belongRadio1 = new JRadioButton("GUEST");
		belongRadio2 = new JRadioButton("MANAGER");
		belongGroup = new ButtonGroup();

		// 중복체크 및 가입,거절 버튼 생성.
		idCheckBtn = new JButton("중복체크");
		pwCheckBtn = new JButton("PW 확인");
//		mailChkBtn = new JButton("확인");
		agreeBtn = new JButton("가입");
		denyBtn = new JButton("취소");

		// 라벨 생성
		AlertLabel = new JLabel("");
		idLabel = new JLabel("* ID ");
		pw1Label = new JLabel("* PW ");
		pw2Label = new JLabel("* PW 확인 ");
		finalEduLabel = new JLabel("학력 ");
		ageLabel = new JLabel("나이 ");
		fieldLabel = new JLabel("관심분야 ");
		areaLabel = new JLabel("* 주소 ");
		belongLabel = new JLabel("상태 체크");

		/****************************** BOUNDS ********************************/
		// Field_setBounds
		inputIdField.setBounds(240, 200, fieldWidth, fieldHeight);
		inputPw1Field.setBounds(240, 260, fieldWidth, fieldHeight);
		inputPw2Field.setBounds(240, 320, fieldWidth, fieldHeight);
		inputage.setBounds(370, 440, fieldWidth / 3, fieldHeight);
		inputField.setBounds(240, 500, fieldWidth, fieldHeight * 2);
		inputArea.setBounds(240, 620, fieldWidth, fieldHeight);

		// Combo
		FinalEduFieldCombo.setBounds(240, 380, fieldWidth, fieldHeight);

		// Radio
		belongRadio1.setBounds(240, 680, fieldWidth / 2, fieldHeight);
		belongRadio1.setSelected(true);
		belongGroup.add(belongRadio1);

		belongRadio2.setBounds(340, 680, fieldWidth / 2, fieldHeight);
		belongRadio2.setSelected(false);
		belongGroup.add(belongRadio2);

		// Button_setBounds
		idCheckBtn.setBounds(460, 200, buttonWidth, buttonHeight);
		pwCheckBtn.setBounds(460, 295, buttonWidth, buttonHeight);
		agreeBtn.setBounds(120, 830, (int) (buttonWidth * 1.7), buttonHeight + 11);
		denyBtn.setBounds(340, 830, (int) (buttonWidth * 1.7), buttonHeight + 11);

		// Label_setting
		AlertLabel.setBounds(100, 150, fieldWidth * 3, fieldHeight);
		AlertLabel.setFont(new Font("휴먼편지체", Font.BOLD, 20));
		AlertLabel.setForeground(Color.WHITE);// new

		idLabel.setBounds(130, 200, fieldWidth * 2, fieldHeight);
		idLabel.setFont(new Font("휴먼편지체", Font.BOLD, 20));
		idLabel.setForeground(Color.WHITE);

		pw1Label.setBounds(130, 260, fieldWidth * 2, fieldHeight);
		pw1Label.setFont(new Font("휴먼편지체", Font.BOLD, 20));
		pw1Label.setForeground(Color.WHITE);
		
		pw2Label.setBounds(130, 320, fieldWidth * 2, fieldHeight);
		pw2Label.setFont(new Font("휴먼편지체", Font.BOLD, 20));
		pw2Label.setForeground(Color.WHITE);

		finalEduLabel.setBounds(130, 380, fieldWidth * 2, fieldHeight);
		finalEduLabel.setFont(new Font("휴먼편지체", Font.BOLD, 20));
		finalEduLabel.setForeground(Color.WHITE);

		ageLabel.setBounds(130, 440, fieldWidth * 2, fieldHeight);
		ageLabel.setFont(new Font("휴먼편지체", Font.BOLD, 20));
		ageLabel.setForeground(Color.WHITE);

		fieldLabel.setBounds(130, 500, fieldWidth * 2, fieldHeight);
		fieldLabel.setFont(new Font("휴먼편지체", Font.BOLD, 20));
		fieldLabel.setForeground(Color.WHITE);

		areaLabel.setBounds(130, 620, fieldWidth * 2, fieldHeight);
		areaLabel.setFont(new Font("휴먼편지체", Font.BOLD, 20));
		areaLabel.setForeground(Color.WHITE);

		belongLabel.setBounds(130, 680, fieldWidth * 2, fieldHeight);
		belongLabel.setFont(new Font("휴먼편지체", Font.BOLD, 20));
		belongLabel.setForeground(Color.WHITE);

		/****************************** ADD ********************************/

		// Field_add
		panel.add(inputIdField);
		panel.add(inputPw1Field);
		panel.add(inputPw2Field);
		panel.add(inputage);
		panel.add(inputField);
		panel.add(inputArea);

		// Combo
		panel.add(FinalEduFieldCombo);

		// Radio
		panel.add(belongRadio1);
		panel.add(belongRadio2);

		// Button_add
		panel.add(idCheckBtn);
		panel.add(pwCheckBtn);
		panel.add(agreeBtn);
		panel.add(denyBtn);

		// Label_add
		panel.add(AlertLabel);
		panel.add(idLabel);
		panel.add(pw1Label);
		panel.add(pw2Label);
		panel.add(finalEduLabel);
		panel.add(ageLabel);
		panel.add(fieldLabel);
		panel.add(areaLabel);
		panel.add(belongLabel);

		// panel_setting
		panel.setLayout(null);

		// panel_add
		add(panel);

		// Frame Setting
		setVisible(true);
		// x버튼으로 안꺼지게 막음
		setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);

		// addAction
		idCheckBtn.addActionListener(new IdCheck());
		pwCheckBtn.addActionListener(new PwCheck());
		agreeBtn.addActionListener(new AgreeCheck());
		denyBtn.addActionListener(new DenyCheck());
	}

	/**
	 * ID중복체크리스너 클래스
	 * 
	 * @author Limdaehyun
	 *
	 */
	class IdCheck implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			/**
			 * id 유효성검사(글자가 영문 소문자로,4~12글자수만)
			 */
			String regexID = "^[a-z0-9]{4,11}$";
			String idField = inputIdField.getText();
			boolean checkID = Pattern.matches(regexID, idField); // Id 유효성검사
																	// 참,거짓체크

			// ID입력칸 공백인지 조사 >> 공백일시 불가메시지
			if (inputIdField.getText().isEmpty()) {
				AlertLabel.setText("아이디는 공백이 될수 없습니다.");
				idCheck = false;

			}
			// 유효성검사해서 통과하지 못하면 글을 다시입력하라고함
			else if (checkID == false) {
				AlertLabel.setText("ID는 영문 소문자로, 4~12자로 입력해야합니다!");
				inputIdField.setText("");
				idCheck = false;
			} else {
				// id중복체크 중복일시 true
				if (!cc.idCheck(inputIdField.getText())) {

					JOptionPane.showMessageDialog(null, "사용 가능한 ID 입니다!");
					AlertLabel.setText("모든 입력란에 채워주시고 확인받으세요!!");
					idCheck = true;
					inputIdField.setEnabled(false);
					idCheckBtn.setEnabled(false);

				} else {
					JOptionPane.showMessageDialog(null, "이미 존재하는 ID 입니다.");
					AlertLabel.setText("모든 입력란에 채워주시고 확인받으세요!!");
					inputIdField.setText("");
					idCheck = false;
				}
			}
		}
	}

	/**
	 * PW일치 체크리스너
	 * 
	 * @author Limdaehyun
	 *
	 */
	class PwCheck implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// pw 유효성검사(영어, 숫자만 입력할수있게)
			String regexPw = "^[a-zA-Z0-9]{8,12}$";
			String a = new String(inputPw1Field.getPassword());
			String b = new String(inputPw2Field.getPassword());
			int size = a.length();
			boolean checkPw1 = Pattern.matches(regexPw, a); // Pw 유효성검사 참,거짓체
			boolean checkPw2 = Pattern.matches(regexPw, b);

			if (a.length() == 0 || b.length() == 0) {
				AlertLabel.setText("비밀번호를 입력하셔야 합니다.");
				inputPw1Field.setText("");
				inputPw2Field.setText("");
				pwCheck = false;

			} else if (checkPw1 == false || checkPw2 == false) {
				AlertLabel.setText("영숫자 및 특수문자로, 8~12자로 입력해야합니다.!");
				inputPw1Field.setText("");
				inputPw2Field.setText("");
				pwCheck = false;
			} else if (a.length() != b.length()) {
				pwCheck = false;
				JOptionPane.showMessageDialog(null, "비밀번호 불일치 합니다.");
				AlertLabel.setText("비밀번호를 다시 입력해주세요.");
				inputPw1Field.setText("");
				inputPw2Field.setText("");
			} else if (a.length() == b.length()) {
				boolean pw_check = true;
				for (int i = 0; i < size; i++) {
					if (a.charAt(i) != b.charAt(i)) {
						pwCheck = false;
						JOptionPane.showMessageDialog(null, "비밀번호 불일치 합니다.");
						AlertLabel.setText("비밀번호를 다시 입력해주세요.");
						inputPw1Field.setText("");
						inputPw2Field.setText("");
						pw_check = false;
						break;
					}
				}
				if (pw_check) {
					pwCheck = true;
					JOptionPane.showMessageDialog(null, "비밀번호가 일치합니다.");
					AlertLabel.setText("");
					inputPw1Field.setEnabled(false);
					inputPw2Field.setEnabled(false);
					pwCheckBtn.setEnabled(false);
				}

			}
		}

	}

	// 회원가입 처리
	class AgreeCheck implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			SeekerVO vo = new SeekerVO();
			if (!idCheck && !pwCheck && inputArea.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "필수항목을 입력해주세요.");
			} else {
				vo = new SeekerVO(inputIdField.getText(), new String(inputPw1Field.getPassword()),
						FinalEduFieldCombo.getSelectedItem().toString(), Integer.parseInt(inputage.getText()),
						inputField.getText(), inputArea.getText(), radioBtnSelected());
				// 관리자면 company등록

				cc.seekerRegister(vo);

				JOptionPane.showMessageDialog(null, "회원가입을 성공하셨습니다.");
				dispose();
			}
		}

		private int radioBtnSelected() {
			// TODO Auto-generated method stub
			Enumeration<AbstractButton> enums = belongGroup.getElements();
			String temp = null;
			while (enums.hasMoreElements()) {
				JRadioButton belongRadio = (JRadioButton) enums.nextElement();

				if (belongRadio.isSelected()) { // 받아낸 라디오버튼의 체크 상태를 확인한다. 체크되었을경우 true 반환.
					temp = belongRadio.getText().trim(); // getText() 메소드로 문자열 받아낸다.
					break;
				}
			}
			if (temp.equals("GUEST")) {
				return 0;
			} else {
				return 1;
			}

		}
	}

	// 회원가입 취소
	class DenyCheck implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			dispose();
		}
	}

}
