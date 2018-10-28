package test;

public class Java {
	ImageIcon img = new ImageIcon("./src/Test/panel_images/login_img.png");
    setTitle("«œ¿’");
    setBounds(100, 100, 800, 800);
    JPanel panel = new JPanel() {
       @Override
       protected void paintComponent(Graphics g) {
          // TODO Auto-generated method stub
          g.drawImage(img.getImage(), 0, 0, null);
          setOpaque(false);
          super.paintComponent(g);
       }
    };
    int x = 100;
    int y = 100;
    int x1 = 120;
    int y1 = 120;
    ArrayList<JLabel> label = new ArrayList<JLabel>();
    for (int i = 0; i < 5; i++) {
       JLabel lb = new JLabel(img);
       lb.setBounds(x * i, y * i, x1, y1);
       label.add(lb);
    }
    for (int i = 0; i < label.size(); i++) {
       panel.add(label.get(i));
    }

    System.out.println(11111);

    System.out.println(222);

    panel.setLayout(null);
    add(panel);
    setVisible(true);
    setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);

}
