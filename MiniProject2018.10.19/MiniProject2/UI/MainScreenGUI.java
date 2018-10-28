package MiniProject2.UI;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import MiniProject2.Company_Controller;
import MiniProject2.Vo.CompanyInfoVO;

public class MainScreenGUI extends JFrame {

	/**
	 * 관리자일경우 True, 아닐경우 false
	 */
	private boolean type;
	/**
	 * 로그인 했을 때 나의 ID
	 */
	private final String MY_ID;
	private Company_Controller cc = new Company_Controller();
	private JPanel panel;
	private ImageIcon icon = new ImageIcon("./src/MiniProject2/panel_images/삼성.PNG");
	private StringBuffer sb = new StringBuffer();
	private JComboBox<String> searchCombo;
	private String[] searchComboList = { "시작일", "종료일", "회사명" };
	private JTextField searchInputField;
	private JTextArea contentField;
	private JButton searchBtn;
	/**
	 * 설명을 위한 변수
	 */
	private JLabel explain_Label;
	/**
	 * 200
	 */
	private int fieldWidth = 200;
	/**
	 * 30
	 */
	private int fieldHeight = 30;
	/**
	 * 110
	 */
	private int buttonWidth = 110;
	/**
	 * 30
	 */
	private int buttonHeight = 30;

	public MainScreenGUI(boolean type, String id) {
		// TODO Auto-generated constructor stub
		this.type = type;
		this.MY_ID = id;
		setTitle("MainScreen");
		setBounds(900, 300, 2000, 1200);
		panel = new JPanel() {
		};
		// 콤보박스
		searchCombo = new JComboBox<String>(searchComboList);

		// 입력창생성
		searchInputField = new JTextField();

		// 내용
		contentField = new JTextArea();

		// 버튼
		searchBtn = new JButton("검색");

		// 라벨
		explain_Label = new JLabel(" 회사 이름 및 로고를 클릭하시면 취업정보를 자세히 볼 수 있습니다.");

		/****************************** BOUNDS ********************************/

		// Combo
		searchCombo.setBounds(300, 100, fieldWidth / 2, fieldHeight*2);

		// Field_setBounds
		searchInputField.setBounds(420, 100, fieldWidth * 5, fieldHeight*2);
		searchInputField.setText("ex)시작일과 종료일은20181016로 입력해주세요");

		// Textarea
		contentField.setBounds(150, 300, fieldWidth * 8, fieldHeight * 20);
		contentField.setFont(new Font("휴먼편지체", Font.BOLD, 30));
		// Button_setBounds
		searchBtn.setBounds(1450, 100, buttonWidth, buttonHeight*2);

		// Label
		explain_Label.setBounds(200, 200, fieldWidth * 6, fieldHeight);
		explain_Label.setFont(new Font("휴먼편지체", Font.BOLD, 35));
		explain_Label.setForeground(Color.BLACK);

		/****************************** ADD ********************************/
		// Combo
		panel.add(searchCombo);

		// Field_add
		panel.add(searchInputField);

		// textarea_add
		panel.add(contentField);

		// Button_add
		panel.add(searchBtn);

		// Label_add
		panel.add(explain_Label);

		panel.setLayout(null);

		// panel_add
		add(panel);

		// Frame Setting
		setVisible(true);
		// x버튼으로 안꺼지게 막음
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		searchBtn.addActionListener(new SearchListener());
		searchInputField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				searchInputField.setText("");

			}
		});
	}

	public class SearchListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			contentField.setText("");
			String type = searchCombo.getSelectedItem().toString();

			List<CompanyInfoVO> list = new ArrayList<CompanyInfoVO>();
			if (type.equals("시작일")) {
				list = cc.getStartRecruitmentList(searchInputField.getText());
				Iterator<CompanyInfoVO> ic = list.iterator();
				while (ic.hasNext()) {
					CompanyInfoVO data = ic.next();
					contentField.append(data.getC_name() + " " + data.getC_field() + " " + data.getC_intro() + " "
							+ data.getC_recruitment_start() + " " + data.getC_recruitment_end() + " "
							+ data.getC_qualification() + " " + data.getC_area() + " " + data.getC_talent() + "\n");
					contentField.setEnabled(false);
				}

			} else if (type.equals("종료일")) {
				list = cc.getEndRecruitmentList(searchInputField.getText());
				Iterator<CompanyInfoVO> ic = list.iterator();
				while (ic.hasNext()) {
					CompanyInfoVO data = ic.next();
					contentField.append(data.getC_name() + " " + data.getC_field() + " " + data.getC_intro() + " "
							+ data.getC_recruitment_start() + " " + data.getC_recruitment_end() + " "
							+ data.getC_qualification() + " " + data.getC_area() + " " + data.getC_talent() + "\n");
				}
			} else {
				list = cc.getAllCompanyList(searchInputField.getText());
				Iterator<CompanyInfoVO> ic = list.iterator();
				while (ic.hasNext()) {
					CompanyInfoVO data = ic.next();
					contentField.append(data.getC_name() + " " + data.getC_field() + " " + data.getC_intro() + " "
							+ data.getC_recruitment_start() + " " + data.getC_recruitment_end() + " "
							+ data.getC_qualification() + " " + data.getC_area() + " " + data.getC_talent() + "\n");
				}
			}
			searchInputField.setText("");
			list.clear();
		}

	}

}
