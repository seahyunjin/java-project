package test;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.IOException;
import java.net.URI; 
import java.net.URISyntaxException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;


public class Project extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JLabel imgLabel = new JLabel();
	
	private JTextArea tf =new JTextArea(5,21);
	private JButton in = new JButton("��� �ð� ��������");
	private JTextArea ta = new JTextArea(5,20);
	ImageIcon icon;
	
	public Project() {
		
		setTitle("EPL app");
		bt();
		
		createMenu();
		
		getContentPane().add(imgLabel, BorderLayout.CENTER);
		setSize(1050,750); setVisible(true);
	
	}
	URL imageURL = getClass().getClassLoader().getResource("p1.png");
	URL imageURL2 = getClass().getClassLoader().getResource("p22.png");

	private void bt() {
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout(100));
		in.setFont(new Font("���",Font.ITALIC,20));
		in.setPreferredSize(new Dimension(400, 100));
		
		c.add(ta);
		c.add(tf);
		c.add(in);
		
		ta.setLineWrap(true);
		tf.setLineWrap(true);
		
		ta.append("EPL �� ����:��� ��¥�� 2021�� 3�� 2���̸� 20210302�� �Է��� �ּ���!!         "
				+ "ex) 2021�� 4�� 31���̸� 20210431 " );
		
		in.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent s) {
				String na = JOptionPane.showInputDialog("��� ��¥�� �Է��ϼ���");
				
			
			
				switch(na) {
				case "20201124" :
					tf.setText("������ ���� 2�� 30�п� ���� VS �縮��, ���� 5�ÿ� �����ư VS �������� ��Ⱑ �ֽ��ϴ�."); break;
				case "20201129" :
					tf.setText("������ ���� 12�ÿ� �ǽ�Ƽ VS ����, ���� 2�� 30�п� ����ư VS ����, ���� 5�ÿ� ����Ʈ��� VS ���ʵ�, ���� 11�ÿ� �������� VS ���� ��Ⱑ �ֽ��ϴ�.");break;
				case "20201130" :
					tf.setText("������ ���� 1�� 30�п� ÿ�� VS ��Ʈ��, ���� 4�� 15�п� �ƽ��� VS �����ư ��Ⱑ �ֽ��ϴ�.");break;
				case "20201201" :	
					tf.setText("������ ���� 2�� 30�п� ������ VS Ǯ��, ���� 5�ÿ� ����Ʈ�� VS �ƽ��� ���� ��Ⱑ �ֽ��ϴ�.");break;
				
				case "20201205" :
					tf.setText("������ ���� 12�ÿ� �ƽ��� ���� VS ��ĳ��, ���� 9�� 30�п� ���� VS ������ ��Ⱑ �ֽ��ϴ�.");break;
				case "20201206" :	
					tf.setText("������ ���� 12�ÿ� �ǽ�Ƽ VS Ǯ��, ���� 2�� 30�п� ����Ʈ�� VS ����, ���� 5�ÿ� ÿ�� VS ����, ���� 11�ÿ� ����Ʈ��� VS �Ӹ���, ���� 11�� 15�п� ���ʵ� VS ������ ��Ⱑ �ֽ��ϴ�.");break;
				case "20201207" :
					tf.setText("������ ���� 1�� 30�п� �ƽ��� VS ��Ʈ��, ���� 4�� 15�п� ����Ǯ VS �����ư ��Ⱑ �ֽ��ϴ�.");break;
				case "20201208" :
					tf.setText("������ ���� 5�ÿ� �����ư VS �������� ��Ⱑ �ֽ��ϴ�.");break;
				case "20201213" :
				    tf.setText("������ ���� 1�ÿ� ���� VS ��������, �Ӹ��� VS ��Ʈ��, ������ VS ÿ��, Ǯ�� VS ����Ǯ ��Ⱑ �ֽ��ϴ�.");break;
				case "20201214" : 
					tf.setText("������ ���� 1�ÿ� ������ VS �����ư, �ƽ��� VS ���� ��Ⱑ �ֽ��ϴ�.");break;
				case "20201216" :
					tf.setText("������ ���� 4�� 45�п� �ƽ��� VS ��������, �ƽ��� ���� VS ����, ���� VS ��ĳ��, �����ư VS ÿ�� ��Ⱑ �ֽ��ϴ�.");break;
				case "20201217" :
					tf.setText("������ ���� 5�ÿ� �ǽ�Ƽ VS ����Ʈ���, ����Ǯ VS ��Ʈ�� ��Ⱑ �ֽ��ϴ�.");break;
				case "20201220" :
		            tf.setText("������ ���� 1�ÿ� �������� VS �ǽ�Ƽ, ������ VS ��Ʈ��, ����Ʈ��� VS �ƽ������, ���� VS �����ư, ÿ�� VS ����Ʈ��, �縮�� VS ����Ǯ, ���� VS ����, ��ĳ�� VS Ǯ��, ������ VS �ƽ���, �����ư VS ���ʵ� ��Ⱑ �ֽ��ϴ�.");break;
				case  "20201227" :
		            {tf.setText("������ ���� 1�ÿ� �ƽ��� VS ÿ��, Ǯ�� VS ��������, ����Ǯ VS ����Ʈ���, �ƽ��� ���� VS �縮��, ���� VS ����, �ǽ�Ƽ VS ��ĳ��, ���ʵ� VS ������, �����ư VS ��Ʈ��, ������ VS ����, ����Ʈ�� VS �����ư ��Ⱑ �ֽ��ϴ�.");break;}
				case "20201229" :
		            {tf.setText("������ ���� 1�ÿ� ����Ʈ��� VS ����, Ǯ�� VS ��Ʈ��, �������� VS ����Ʈ��, ���� VS �����ư, ��ĳ�� VS ����Ǯ, ������ VS �ǽ�Ƽ, �����ư VS �ƽ���, ���� VS ���ʵ�, �Ӹ��� VS ������, ÿ�� VS �ƽ��� ���� ��Ⱑ �ֽ��ϴ�.");break;}
				case "20210103" :
		            {tf.setText("������ ���� 12�ÿ� �Ӹ��� VS ���ʵ�, ���� 2�� 30�п� �����ư VS �����ư, ���� 5�ÿ� ����Ʈ��� VS �ƽ��� ���� 11�� 15�п� ��ĳ�� VS ������ ��Ⱑ �ֽ��ϴ�.");break;}
				case"20210104" :
		            {tf.setText("������ ���� 1�� 30�п� ÿ�� VS �ǽ�Ƽ ��Ⱑ �ֽ��ϴ�.");break;}
				case"20210105" :
		            {tf.setText("������ ���� 5�ÿ� �������� VS ����Ǯ ��Ⱑ �ֽ��ϴ�.");break;}
				case "20210113" : 
		            {tf.setText("������ ���� 3�ÿ� ���ʵ� VS ��ĳ��, ���� 5�� 15�п� �����ư VS ������,���� VS ���� ");break;}
				case "20210114" :
					tf.setText("������ ���� 5�ÿ� ����Ǯ VS ����, �ǽ�Ƽ VS �����ư ��Ⱑ �ֽ��ϴ�."); break;		            
				case  "20210115" : 
			            {tf.setText("������ ���� 5�ÿ� �ƽ��� VS �Ӹ��� ��Ⱑ �ֽ��ϴ�.");break;}
				case "20210116" :
			            {tf.setText("������ ���� 3�ÿ� �����ư VS ����Ʈ��� ��Ⱑ �ֽ��ϴ�.");break;}
				case "20210117" :
			            {tf.setText("������ ���� 12�ÿ� ���� VS �����ư, ����Ʈ�� VS ����, ���� 2��30�п� Ǯ�� VS ÿ�� ���� 5�ÿ� ������ VS �������� ���� 11�ÿ� ���ʵ� VS ��Ʈ��");break;}
				case "20210118" : 
			            {tf.setText("������ ���� 1�� 30�п� ����Ǯ VS ���� ���� 4�� 15�п� �ǽ�Ƽ VS �Ӹ��� ");break;}
				case  "20210119" :
			            {tf.setText("������ ���� 5�ÿ� �ƽ��� VS ��ĳ�� ��Ⱑ �ֽ��ϴ�.");break;}
				case "20210120" :
			            {tf.setText("������ ���� 3�ÿ� ����Ʈ�� VS ����Ʈ���,���� 5�� 15�п� ������ VS ÿ�� ��Ⱑ �ֽ��ϴ�.");break;}
				case  "20210121" :
			            {tf.setText("������ ���� 3�ÿ� �ǽ�Ƽ VS �ƽ��� ����, ���� 5�� 15�п� Ǯ�� VS ���� ��Ⱑ �ֽ��ϴ�.");break;}
				case "20210123" :
			            {tf.setText("������ ���� 5�ÿ� ����Ǯ VS ���� ��Ⱑ �ֽ��ϴ�.");break;}
				case "20210124" : 
			            {tf.setText("������ ���� 5�ÿ� �ƽ��� ����VS ��ĳ�� ��Ⱑ �ֽ��ϴ�.");break;}
				case  "20210127" :
			            {tf.setText("������ ���� 3�ÿ� ��ĳ�� VS ����, �Ӹ��� VS ����Ʈ�� ���� 5�ÿ� ����Ʈ��� VS �ǽ�Ƽ, �������� VS �ƽ��� ��Ⱑ �ֽ��ϴ�.");break;}
				case "20210128" :
			            {tf.setText("������ ���� 3�ÿ� ÿ�� VS �����ư, ���� VS �ƽ��� ���� ���� 4�� 30�п� �����ư VS Ǯ�� ���� 5�� 15�п� ���� VS ���ʵ�, ������ VS ������ ��Ⱑ �ֽ��ϴ�.");break;}
				case "20210129 ": 
			            {tf.setText("������ ���� 5�ÿ� ��Ʈ�� VS ����Ǯ ��Ⱑ �ֽ��ϴ�.");break;}
			      case "20210130" :
			            {tf.setText("������ ���� 11�ÿ� ������ VS ��ĳ�� ��Ⱑ �ֽ��ϴ�.");break;}
			           case"20210131":
			            {tf.setText("������ ���� 12�ÿ� ����Ʈ��� VS Ǯ��, �ǽ�Ƽ VS ���ʵ�, �Ӹ��� VS �����ư ���� 2�� 30�п� �ƽ��� VS ����, ���� 5�ÿ� �������� VS �ƽ��� ����, ���� 9�ÿ� ÿ�� VS ���� ���� 11�ÿ� ������ VS ���� ��Ⱑ �ֽ��ϴ�.");break;}
			            case "20210201":
			            {tf.setText("������ ���� 1�� 30�п� ����Ʈ�� VS ����Ǯ, ���� 4�� 15�п� �����ư VS ��Ʈ�� ��Ⱑ �ֽ��ϴ�.");break;}
			            case "20210203": 
			            {tf.setText("������ ���� 3�ÿ� ���ʵ� VS ����Ʈ���, �����ư VS �ƽ��� ���� 5�� 15�п� ���� VS ��������, ��ĳ�� VS �Ӹ��� ��Ⱑ �ֽ��ϴ�.");break;}
			            case "20210204": 
			            {tf.setText("������ ���� 3�ÿ� Ǯ�� VS ������, ���� VS �ǽ�Ƽ ���� 4��30�п� ���� VS ������ ���� 5�� 15�п� ����Ǯ VS �����ư, �ƽ��� ���� VS ����Ʈ�� ��Ⱑ �ֽ��ϴ�.");break;}
			            case "20210205":
			            {tf.setText("������ ���� 5�ÿ� ��Ʈ�� VS ÿ�� ��Ⱑ �ֽ��ϴ�.");break;}
			            case "20210206": 
			            {tf.setText("������ ���� 9��30�п� �ƽ��� ���� VS �ƽ��� ��Ⱑ �ֽ��ϴ�.");break;}
			            case "20210207": 
			            {tf.setText("������ ���� 12�ÿ� ���� VS �����ư, ��ĳ�� VS �������� ���� 2�� 30�п� Ǯ�� VS ����Ʈ�� ���� 5�ÿ� ���� VS ������ ���� 9�ÿ� ��Ʈ�� VS ����Ʈ��� ���� 11�ÿ� �����ư VS ������ ��Ⱑ �ֽ��ϴ�.");break;}
			            case "20210208": 
			            {tf.setText("������ ���� 1�� 30�п� ����Ǯ VS �ǽ�Ƽ ���� 4�� 15�п� ���ʵ� VS ÿ�� ��Ⱑ �ֽ��ϴ�.");break;}
			            case "20210209": 
			            {tf.setText("������ ���� 5�ÿ� ���� VS �Ӹ��� ��Ⱑ �ֽ��ϴ�.");break;}
			            case "20210213":
			            {tf.setText("������ ���� 9�� 30�п� ������ VS ����Ǯ ��Ⱑ �ֽ��ϴ�.");break;}
			            case "20210214":
			            {tf.setText("������ ���� 12�ÿ� �Ӹ��� VS ���� ���� 2�� 30�п� �ǽ�Ƽ VS ��Ʈ�� ���� 5�ÿ�    �ٸ����γ� VS �˶󺣽� ���� 9�ÿ� �������� VS �����ư ���� 11�ÿ� ����Ʈ��� VS ���� ��Ⱑ �ֽ��ϴ�.");break;}
			            case "20210215":
			            {tf.setText("������ ���� 1�� 30�п� �ƽ��� VS ���� ���� 4�ÿ� ������ VS Ǯ�� ��Ⱑ �ֽ��ϴ�.");break;}
			            case "20210216":
			            {tf.setText("������ ���� 3�ÿ� ����Ʈ�� VS ���ʵ� ���� 5�ÿ� ÿ�� VS ��ĳ�� ��Ⱑ �ֽ��ϴ�.");break;}
			            case "20210218":
			            {tf.setText("������ ���� 3�ÿ� ���� VS Ǯ�� ���� 5�� 15�п� ������ VS �ǽ�Ƽ ��Ⱑ �ֽ��ϴ�.");break;}
			            case "20210220":
			            {tf.setText("������ ���� 5�ÿ� �����ư VS ���� ���� 9�� 30�п� �������� VS ÿ�� ��Ⱑ �ֽ��ϴ�.");break;}
			            case "20210221":
			            {tf.setText("������ ���� 12�ÿ� ���� VS ����Ʈ��� ���� 2�� 30�п� ����Ǯ VS ������ ���� 5�ÿ� Ǯ�� VS ���ʵ� ���� 9�ÿ� ����Ʈ�� VS ��Ʈ�� ���� 11�� 05�п� �ƽ������ VS ������ ��Ⱑ �ֽ��ϴ�.");break;}
			            case "20210222":
			            {tf.setText("������ ���� 1�� 30�п� �ƽ��� VS �ǽ�Ƽ ���� 4�ÿ� ���� VS ��ĳ�� ��Ⱑ �ֽ��ϴ�.");break;}
			            case "20210223": 
			            {tf.setText("������ ���� 5�ÿ� �����ư VS �Ӹ��� ��Ⱑ �ֽ��ϴ�.");break;}
			            case "20210224": 
			            {tf.setText("������ ���� 3�ÿ� ���� VS �������� ��Ⱑ �ֽ��ϴ�.");break;}
			            case "20210227":
			            {tf.setText("������ ���� 9�� 30�п� �ǽ�Ƽ VS ����Ʈ�� ��Ⱑ �ֽ��ϴ�.");break;}
			            case"20210228":
			            {tf.setText("������ ���� ����Ʈ��� VS �����ư ���� 2�� 30�п� ���� VS �ƽ������ ���� 5�ÿ� ��ĳ�� VS �����ư ���� 9�ÿ� �Ӹ��� VS Ǯ�� ������ VS �ƽ��� ���� 11�ÿ� ��Ʈ�� VS ���� ��Ⱑ �ֽ��ϴ�.");break;}
			            case "20210301": 
			            {tf.setText("������ ���� 1�� 30�п� ÿ�� VS ���� ���� 4�� 15�п� ���ʵ� VS ����Ǯ ��Ⱑ �ֽ��ϴ�.");break;}
			            case "20210302": 
			            {tf.setText("������ ���� 5�ÿ� ������ VS �������� ��Ⱑ �ֽ��ϴ�.");break;}
			            case"20210303": 
			            {tf.setText("������ ���� 5�ÿ� �ǽ�Ƽ VS �����ư ��Ⱑ �ֽ��ϴ�.");break;}
			            case "20210304": 
			            {tf.setText("������ ���� 3�ÿ� ���� VS ������ ���ʵ� VS �ƽ������ ���� 5�� 15�п� �Ӹ��� VS ���� ��Ⱑ �ֽ��ϴ�.");break;}
			            case "20210305":
			            {tf.setText("������ ���� 3�ÿ� ����Ʈ��� VS ������ Ǯ�� VS ��Ʈ�� ���� 5�� 15�п� ����Ǯ VS ÿ�� ��Ⱑ �ֽ��ϴ�.");break;}
			            case "20210306": 
			            {tf.setText("������ ���� 9�� 30�п� ���� VS �ƽ��� ��Ⱑ �ֽ��ϴ�.");break;}
			            case "20210307": 
			            {tf.setText("������ ���� 12�ÿ� ���ʵ� VS �������� ���� 2�� 30�п� �ƽ������ VS �����ư ���� 5�ÿ� �����ư VS ������ ���� 9�ÿ� �����ͺ�� VS ��ĳ�� ���� 11�ÿ� ����Ǯ VS Ǯ�� ��Ⱑ �ֽ��ϴ�.");break;}
			            case"20210308":
			            {tf.setText("������ ���� 1�� 30�п� �ǽ�Ƽ VS ���� ���� 4�� 15�п� ��Ʈ�� VS �Ӹ��� ��Ⱑ �ֽ��ϴ�.");break;}
			            case "20210309":
			            {tf.setText("������ ���� 3�ÿ� ÿ�� VS ������ ���� 5�ÿ� ����Ʈ�� VS ���� ��Ⱑ �ֽ��ϴ�.");break;}
			            case "20210311":
			            {tf.setText("������ ���� 3�ÿ� �ǽ�Ƽ VS �������� ��Ⱑ �ֽ��ϴ�.");break;}
			            case "20210313":
			            {tf.setText("������ ���� 5�ÿ� ��ĳ�� VS �ƽ������ ���� 9�� 30�п� ���� VS ÿ�� ��Ⱑ �ֽ��ϴ�.");break;}
			            case "20210314":
			            {tf.setText("������ ���� 12�ÿ� �Ӹ��� VS ����Ʈ��� ���� 2�� 30�п� ������ VS ���� ���� 5�ÿ� Ǯ�� VS �ǽ�Ƽ ���� 9�ÿ� �������� VS �����ư ���� 11�ÿ� ������ VS ���ʵ� ��Ⱑ �ֽ��ϴ�.");break;}
			           case "20210315": 
			            {tf.setText("������ ���� 1�� 30�п� �ƽ��� VS ��Ʈ�� ���� 4�� 15�п� ���� VS ����Ʈ�� ��Ⱑ �ֽ��ϴ�.");break;}
			            case "20210316":
			            {tf.setText("������ ���� 5�ÿ� �����ư VS ����Ǯ ��Ⱑ �ֽ��ϴ�.");break;}
			            case "20210320": 
			            {tf.setText("������ ���� 5�ÿ� Ǯ�� VS ���� ��Ⱑ �ֽ��ϴ�.");break;}
			            case "20210321":
			            {tf.setText("������ ���� 5�ÿ� �����ư VS ��ĳ�� ��Ⱑ �ֽ��ϴ�.");break;}
			            case "20210322":
			            {tf.setText("������ ���� 12�ÿ� ����Ʈ�� VS �ƽ��� ���� 4�� 30�п� �ƽ������ VS ��Ʈ�� ��Ⱑ �ֽ��ϴ�.");break;}
			            case "20210403":
			            {tf.setText("������ ���� 8�� 30�п� ÿ�� VS ����Ʈ��� ���� 11�ÿ� ���� VS ���ʵ� ��Ⱑ �ֽ��ϴ�.");break;}
			            case "20210404":
			            {tf.setText("������ ���� 1�� 30�п� ������ VS �ǽ�Ƽ ���� 4�ÿ� �ƽ��� VS ����Ǯ ���� 8�ÿ� �������� VS ���� ���� 10�� 05�п� ��ĳ�� VS ��Ʈ�� ��Ⱑ �ֽ��ϴ�.");break;}
			            case "20210405":
			            {tf.setText("������ ���� 12�� 30�п� �ƽ������ VS Ǯ�� ���� 3�� 30�п� ���� VS �����ư ��Ⱑ �ֽ��ϴ�.");break;}
			            case "20210406":
			            {tf.setText("������ ���� 2�ÿ� ������ VS �Ӹ��� ���� 4�� 15�п� �����ư VS ����Ʈ�� ��Ⱑ �ֽ��ϴ�.");break;}
			            case "20210410":
			            {tf.setText("������ ���� 4�ÿ� Ǯ�� VS �����ư ���� 8�� 30�п� �ǽ�Ƽ VS ���� ���� 11�ÿ� ����Ǯ VS �ƽ������ ��Ⱑ �ֽ��ϴ�.");break;}
			            case "20210411":
			            {tf.setText("������ ���� 1�� 30�п� �Ӹ��� VS ÿ�� ���� 8�ÿ� ���� VS ��ĳ�� ���� 10�� 05�п� ����Ʈ�� VS ������ ��Ⱑ �ֽ��ϴ�.");break;}
			           case "20210412":
			            {tf.setText("������ ���� 12�� 30�п� ��Ʈ�� VS ���� ���� 3�ÿ� ���ʵ� VS �ƽ��� ��Ⱑ �ֽ��ϴ�.");break;}
			            case "20210413":
			            {tf.setText("������ ���� 2�ÿ� ����Ʈ��� VS �������� ���� 4�� 15�п� �����ư VS ������ ��Ⱑ �ֽ��ϴ�.");break;}
			            case "20210417":
			            {tf.setText("������ ���� 4�ÿ� ������ VS ��Ʈ�� ���� 8�� 30�п� ��ĳ�� VS ����Ʈ�� ��Ⱑ �ֽ��ϴ�.");break;}
			            case "20210418":
			            {tf.setText("������ ���� 4�� 15�п� �����ư VS ���ʵ� ���� 9�� 30�п� �ƽ��� VS Ǯ�� ��Ⱑ �ֽ��ϴ�.");break;}
			            case "20210419":
			            {tf.setText("������ ���� 12�ÿ� ���� VS ���� ��Ⱑ �ֽ��ϴ�.");break;}
			            case "20210420":
			            {tf.setText("������ ���� 4�ÿ� ���� VS ����Ǯ ��Ⱑ �ֽ��ϴ�.");break;}
			            case "20210421":
			            {tf.setText("������ ���� 4�ÿ� ÿ�� VS �����ư ��Ⱑ �ֽ��ϴ�.");break;}
			            case "20210422":
			            {tf.setText("������ ���� 2�ÿ� ��Ʈ�� VS �������� ���� 4�� 15�п� �ƽ������ VS �ǽ�Ƽ ��Ⱑ �ֽ��ϴ�.");break;}
			            case "20210423":
			            {tf.setText("������ ���� 4�ÿ� ������ VS ����Ʈ��� ��Ⱑ �ֽ��ϴ�.");break;}
			            case"20210424":
			            {tf.setText("������ ���� 4�ÿ� �ƽ��� VS ������ ���� 8�� 30�п� ����Ǯ VS ��ĳ�� ��Ⱑ �ֽ��ϴ�.");break;}
			            case "20210425": 
			            {tf.setText("������ ���� 1�� 30�п� ����Ʈ�� VS ÿ�� ���� 4�ÿ� ���ʵ� VS �����ư ���� 8�ÿ� �����ư VS ���� ���� 10�ÿ� ���� VS ���� ��Ⱑ �ֽ��ϴ�.");break;}
			            case"20210426":
			            {tf.setText("������ ���� 3�ÿ� �ƽ������ VS ����Ʈ��� ��Ⱑ �ֽ��ϴ�.");break;}
			            case "20210427":
			            {tf.setText("������ ���� 4�ÿ� ������ VS �Ӹ��� ��Ⱑ �ֽ��ϴ�.");break;}
			            case "20210501":
			            {tf.setText("������ ���� 4�ÿ� �������� VS ������ ���� 8�� 30�п� �Ӹ��� VS �ǽ�Ƽ ���� 11�ÿ� �����ư VS ���� ��Ⱑ �ֽ��ϴ�.");break;}
			            case "20210502":
			            {tf.setText("������ ���� 1�� 30�п� ÿ�� VS Ǯ�� ���� 4�ÿ� ������ VS �ƽ������ ���� 10�ÿ� ��ĳ�� VS �ƽ��� ��Ⱑ �ֽ��ϴ�.");break;}
			            case "20210503":
			            {tf.setText("������ ���� 3�� 15�п� ��Ʈ�� VS ���ʵ� ��Ⱑ �ֽ��ϴ�.");break;}
			            case "20210504": 
			            {tf.setText("������ ���� 2�ÿ� ����Ʈ��� VS �����ư ���� 4�� 15�п� ���� VS ����Ʈ�� ��Ⱑ �ֽ��ϴ�.");break;}
			            case "20210508":
			            {tf.setText("������ ���� 4�ÿ� ������ VS ��ĳ�� ���� 8�� 30�п� ���� VS ��Ʈ�� ���� 11�ÿ� ���ʵ� VS �Ӹ��� ��Ⱑ �ֽ��ϴ�.");break;}
			            case "20210509":
			            {tf.setText("������ ���� 1�� 30�п� �ǽ�Ƽ VS ÿ�� ���� 4�� 15�п� ����Ǯ VS �������� ���� 8�ÿ� �����ư VS �����ư ���� 10�� 05�п� �ƽ������ VS ������Ⱑ �ֽ��ϴ�.");break;}
			            case"20210510":
			            {tf.setText("������ ���� 12�� 30�п� ����Ʈ�� VS ������ ���� 3�ÿ� �ƽ��� VS ����Ʈ��� ��Ⱑ �ֽ��ϴ�.");break;}
			            case"20210511":
			            {tf.setText("������ ���� 4�ÿ� Ǯ�� VS ���� ��Ⱑ �ֽ��ϴ�.");break;}
			            case "20210512":
			            {tf.setText("������ ���� 2�ÿ� ���� VS ������ ���� 4�� 15�п� �������� VS �Ӹ��� ��Ⱑ �ֽ��ϴ�.");break;}
			            case "20210513":
			            {tf.setText("������ ���� 4�� 15�п� ÿ�� VS �ƽ��� ��Ⱑ �ֽ��ϴ�.");break;}
			            case "20210514": 
			            {tf.setText("������ ���� 2�ÿ� �ƽ������ VS ������ ���� 4�� 15�п� ���� VS ����Ǯ ��Ⱑ �ֽ��ϴ�.");break;}
			            case "20210515":
			            {tf.setText("������ ���� 4�ÿ� ��ĳ�� VS �ǽ�Ƽ ���� 8�� 30�п� ���� VS ���� ���� 11�ÿ� �������� VS Ǯ�� ��Ⱑ �ֽ��ϴ�.");break;}
			            case "20210516":
			            {tf.setText("������ ���� 4�ÿ� �����ư VS ����Ʈ�� ���� 8�ÿ� �Ӹ��� VS �ƽ������ ���� 10�� 05�п� ��Ʈ�� VS �����ư ��Ⱑ �ֽ��ϴ�.");break;}
			            case "20210517": 
			            {tf.setText("������ ���� 12�� 30�п� ����Ʈ��� VS ����Ǯ ���� 3�ÿ� ������ VS ���ʵ� ��Ⱑ �ֽ��ϴ�.");break;}
			            case "20210519":
			            {tf.setText("������ ���� 2�ÿ� ���� VS Ǯ�� �������� VS ���� ���� 3�ÿ� �����ư VS �ǽ�Ƽ ���� 4�� 15�п� ÿ�� VS ������ ��Ⱑ �ֽ��ϴ�.");break;}
			            case "20210520":
			            {tf.setText("������ ���� 2�ÿ� ������ VS �����ư ��ĳ�� VS ���ʵ� ��Ʈ�� VS �ƽ������ ���� 3�ÿ� �Ӹ��� VS �ƽ��� ���� 4�� 15�п� ���� VS ����Ǯ ����Ʈ��� VS ����Ʈ�� ��Ⱑ �ֽ��ϴ�.");break;}
			            case "20210524":
			            {tf.setText("������ ���� 12�ÿ� �����ư VS ����, ����Ʈ�� VS ��������, ���ʵ� VS ����, ����Ǯ VS �Ӹ���, ������ VS ��Ʈ��, �ƽ������ VS ÿ��, �ǽ�Ƽ VS ������, ���� VS ����Ʈ���, Ǯ�� VS ��ĳ��, �ƽ��� VS �����ư ��Ⱑ �ֽ��ϴ�.");break;}

				}
			 
			}
		});

	}

	class newWindow extends JFrame {
	    /**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		newWindow() {
	        setTitle("���� ����");
	   
	        
	        JPanel NewWindowContainer = new JPanel();
	        setContentPane(NewWindowContainer);
	        JLabel NewLabel = new JLabel();
	        NewWindowContainer.add(NewLabel);
	        NewLabel.setIcon(new ImageIcon(imageURL2)); 
	        
	        setSize(1000,700);
	        setResizable(false);
	        setVisible(true);
	        
	    }
	}
	 
	class newWindow2 extends JFrame {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private JButton ti = new JButton("���� �ð� ��������");
	    newWindow2() {
	        setTitle("�����ð�");
	        	       
	        JPanel NewWindowContainer2 = new JPanel();
	        setContentPane(NewWindowContainer2);
	        JLabel NewLabel2 = new JLabel();
	        NewWindowContainer2.add(NewLabel2);
	        NewWindowContainer2.add(ti);
	        NewWindowContainer2.add("South",NewLabel2);

        
	        setSize(400,200);
	        setResizable(true);
	        setVisible(true);
	    	ti.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent s) {
					Object obi = s.getSource();
					
					if((JButton)obi==ti)
					{
						TimeZone time;
						Date date = new Date();
						DateFormat df = new SimpleDateFormat(
								"yyyy-MM-dd HH:mm:ss (z Z)");
						time = TimeZone.getTimeZone("Europe/London");
						df.setTimeZone(time);
						
						NewLabel2.setText(time.getDisplayName()+"       "+df.format(date));
								
					
					
				
					}
					
				}
			});
	    }
	}


	private void createMenu() {
		JMenuBar mb = new JMenuBar();
		JMenuItem[] menuItem = new JMenuItem[4];
		JMenuItem[] menuItem2 = new JMenuItem[3];
		JMenuItem[] menuItem3 = new JMenuItem[1];
		String[] itemTitle = {"HOME","spotv","����ǥ","Exit"};
		String[] itemTitle2 = {"HOME","����","��������"};
		String[] itemTitle3 = {"�����ð�"};
		JMenu screenMenu = new JMenu("MENU");
		JMenu screenMenu2 = new JMenu("MENU2");
		JMenu screenMenu3 = new JMenu("MENU3");
		screenMenu.setBackground(new Color(255,128,0));
		MenuActionListener listener = new MenuActionListener();
		for(int i=0; i<menuItem.length; i++) {
			menuItem[i] = new JMenuItem(itemTitle[i]);
			menuItem[i].addActionListener(listener);
			screenMenu.addSeparator();
			screenMenu.add(menuItem[i]);
		}
		for(int i=0; i<menuItem2.length; i++) {
			menuItem2[i] = new JMenuItem(itemTitle2[i]);
			menuItem2[i].addActionListener(listener);
			screenMenu2.addSeparator();
			screenMenu2.add(menuItem2[i]);
		}
		for(int i=0; i<menuItem3.length; i++) {
			menuItem3[i] = new JMenuItem(itemTitle3[i]);
			menuItem3[i].addActionListener(listener);
			screenMenu3.addSeparator();
			screenMenu3.add(menuItem3[i]);
		}
		mb.add(screenMenu);
		mb.add(screenMenu2);
		mb.add(screenMenu3);
		setJMenuBar(mb);
	}
	class MenuActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand();
	
			switch(cmd) {
				case "HOME" :
					imgLabel.setVisible(false); break;
				case "spotv" :
					try { Desktop.getDesktop().browse(new URI("https://www.spotvnow.co.kr/intro")); 
					} catch (IOException a) { 
						a.printStackTrace();
					}catch (URISyntaxException a) {
						a.printStackTrace(); }  break;
				case "����ǥ" :
					try { Desktop.getDesktop().browse(new URI("https://www.premierleague.com/tables")); 
					} catch (IOException a) { 
						a.printStackTrace();
					}catch (URISyntaxException a) {
						a.printStackTrace(); }  break;
				case "Exit" :
					System.exit(0); break;
				case "����" :
					imgLabel.setIcon(new ImageIcon(imageURL));  break;	
				case "��������" :
					new newWindow(); break;
				case "�����ð�" :
					new newWindow2(); break;
			}
		}
	}
	public static void main(String[] args) {
		new Project();
	}
}