package app;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;

import DAO.DeptDAO;
import service.DeptService;
import service.DeptServiceImpl;
import vo.DeptVO;

public class MyApp {
	public static void main(String[] args) {
		DeptFrame df = new DeptFrame();
	}
}

class DeptFrame {
	JFrame f = new JFrame("Dept ~~~~");
	JButton list,insert,getdept;
	TextField deptno,dname,loc;
	TextArea window;
	
	DeptService service = new DeptServiceImpl(new DeptDAO());
	DeptFrame(){
		list = new JButton("LIST");
		insert = new JButton("부서등록");
		getdept = new JButton("부서조회");
		Panel p1 = new Panel();
		p1.add(list);
		p1.add(insert);
		p1.add(getdept);
		f.add(p1,BorderLayout.SOUTH);
		
		Panel p2 = new Panel(new GridLayout(1, 3));
		p2.add(deptno = new TextField("Deptno"));
		p2.add(dname = new TextField("부서명"));
		p2.add(loc = new TextField("LOC"));
		f.add(p2, BorderLayout.NORTH);
		
		f.add(window=new TextArea(15, 50));
		window.setFont(new Font(null, 1, 16));
		
		f.setSize(400, 400);
		f.setVisible(true);
		
		list.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				List<DeptVO> list = service.getAllDept();
				Iterator<DeptVO> id = list.iterator();
				window.setText("");
				while (id.hasNext()) {
					DeptVO data =  id.next();
					window.append(data.toString()+"\n");
				}
			}
		});
		insert.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
				service.insertDept(Integer.parseInt(deptno.getText()), 
						           dname.getText(), 
						           loc.getText());
				}catch (NumberFormatException e1) {
					window.setText("부서번호는 숫자로 입력 요망");
					
				}catch (Exception e1) {
					window.setText("등록에 문제 발생");
				}
			}
		});
		deptno.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				deptno.setText("");
			}
		});
		dname.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				dname.setText("");
			}
		});
		loc.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				loc.setText("");
			}
		});
	}
	
}













