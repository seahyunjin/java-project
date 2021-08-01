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
	private JButton in = new JButton("경기 시간 가져오기");
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
		in.setFont(new Font("고딕",Font.ITALIC,20));
		in.setPreferredSize(new Dimension(400, 100));
		
		c.add(ta);
		c.add(tf);
		c.add(in);
		
		ta.setLineWrap(true);
		tf.setLineWrap(true);
		
		ta.append("EPL 앱 사용법:경기 날짜가 2021년 3월 2일이면 20210302로 입력해 주세요!!         "
				+ "ex) 2021년 4월 31일이면 20210431 " );
		
		in.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent s) {
				String na = JOptionPane.showInputDialog("경기 날짜를 입력하세요");
				
			
			
				switch(na) {
				case "20201124" :
					tf.setText("오늘은 새벽 2시 30분에 번리 VS 펠리스, 새벽 5시에 울버햄튼 VS 사우샘프턴 경기가 있습니다."); break;
				case "20201129" :
					tf.setText("오늘은 새벽 12시에 맨시티 VS 번리, 새벽 2시 30분에 에버튼 VS 리즈, 새벽 5시에 웨스트브롬 VS 셰필드, 저녁 11시에 사우샘프턴 VS 맨유 경기가 있습니다.");break;
				case "20201130" :
					tf.setText("오늘은 새벽 1시 30분에 첼시 VS 토트넘, 새벽 4시 15분에 아스널 VS 울버햄튼 경기가 있습니다.");break;
				case "20201201" :	
					tf.setText("오늘은 새벽 2시 30분에 레스터 VS 풀럼, 새벽 5시에 웨스트햄 VS 아스톤 빌라 경기가 있습니다.");break;
				
				case "20201205" :
					tf.setText("오늘은 새벽 12시에 아스톤 빌라 VS 뉴캐슬, 저녁 9시 30분에 번리 VS 에버턴 경기가 있습니다.");break;
				case "20201206" :	
					tf.setText("오늘은 새벽 12시에 맨시티 VS 풀럼, 새벽 2시 30분에 웨스트햄 VS 맨유, 새벽 5시에 첼시 VS 리즈, 저녁 11시에 웨스트브롬 VS 팰리스, 저녁 11시 15분에 셰필드 VS 레스터 경기가 있습니다.");break;
				case "20201207" :
					tf.setText("오늘은 새벽 1시 30분에 아스널 VS 토트넘, 새벽 4시 15분에 리버풀 VS 울버햄튼 경기가 있습니다.");break;
				case "20201208" :
					tf.setText("오늘은 새벽 5시에 브라이튼 VS 사우샘프턴 경기가 있습니다.");break;
				case "20201213" :
				    tf.setText("오늘은 새벽 1시에 리즈 VS 웨스스햄, 팰리스 VS 토트넘, 에버턴 VS 첼시, 풀럼 VS 리버풀 경기가 있습니다.");break;
				case "20201214" : 
					tf.setText("오늘은 새벽 1시에 레스터 VS 브라이튼, 아스널 VS 번리 경기가 있습니다.");break;
				case "20201216" :
					tf.setText("오늘은 새벽 4시 45분에 아스널 VS 사우샘프턴, 아스톤 빌라 VS 번리, 리즈 VS 뉴캐슬, 울버햄튼 VS 첼시 경기가 있습니다.");break;
				case "20201217" :
					tf.setText("오늘은 새벽 5시에 맨시티 VS 웨스트브롬, 리버풀 VS 토트넘 경기가 있습니다.");break;
				case "20201220" :
		            tf.setText("오늘은 새벽 1시에 사우샘프턴 VS 맨시티, 레스터 VS 토트넘, 웨스트브롬 VS 아스톤빌라, 번리 VS 울버햄튼, 첼시 VS 웨스트햄, 펠리스 VS 리버풀, 맨유 VS 리즈, 뉴캐슬 VS 풀럼, 에버턴 VS 아스널, 브라이튼 VS 셰필드 경기가 있습니다.");break;
				case  "20201227" :
		            {tf.setText("오늘은 새벽 1시에 아스널 VS 첼시, 풀럼 VS 사우샘프턴, 리버풀 VS 웨스트브롬, 아스톤 빌라 VS 펠리스, 리즈 VS 번리, 맨시티 VS 뉴캐슬, 셰필드 VS 에버턴, 울버햄튼 VS 토트넘, 레스터 VS 맨유, 웨스트햄 VS 브라이튼 경기가 있습니다.");break;}
				case "20201229" :
		            {tf.setText("오늘은 새벽 1시에 웨스트브롬 VS 리즈, 풀럼 VS 토트넘, 사우샘프턴 VS 웨스트햄, 맨유 VS 울버햄튼, 뉴캐슬 VS 리버풀, 에버턴 VS 맨시티, 브라이튼 VS 아스널, 번리 VS 셰필드, 팰리스 VS 레스터, 첼시 VS 아스톤 빌라 경기가 있습니다.");break;}
				case "20210103" :
		            {tf.setText("오늘은 새벽 12시에 팰리스 VS 셰필드, 새벽 2시 30분에 브라이튼 VS 울버햄튼, 새벽 5시에 웨스트브론 VS 아스널 오후 11시 15분에 뉴캐슬 VS 레스터 경기가 있습니다.");break;}
				case"20210104" :
		            {tf.setText("오늘은 새벽 1시 30분에 첼시 VS 맨시티 경기가 있습니다.");break;}
				case"20210105" :
		            {tf.setText("오늘은 새벽 5시에 사우샘프턴 VS 리버풀 경기가 있습니다.");break;}
				case "20210113" : 
		            {tf.setText("오늘은 새벽 3시에 셰필드 VS 뉴캐슬, 새벽 5시 15분에 울버햄튼 VS 에버턴,번리 VS 맨유 ");break;}
				case "20210114" :
					tf.setText("오늘은 새벽 5시에 리버풀 VS 번리, 맨시티 VS 브라이튼 경기가 있습니다."); break;		            
				case  "20210115" : 
			            {tf.setText("오늘은 새벽 5시에 아스널 VS 팰리스 경기가 있습니다.");break;}
				case "20210116" :
			            {tf.setText("오늘은 새벽 3시에 울버햄튼 VS 웨스트브롬 경기가 있습니다.");break;}
				case "20210117" :
			            {tf.setText("오늘은 새벽 12시에 리즈 VS 브라이튼, 웨스트햄 VS 번리, 새벽 2시30분에 풀럼 VS 첼시 새벽 5시에 레스터 VS 사우샘프턴 오후 11시에 셰필드 VS 토트넘");break;}
				case "20210118" : 
			            {tf.setText("오늘은 새벽 1시 30분에 리버풀 VS 맨유 새벽 4시 15분에 맨시티 VS 팰리스 ");break;}
				case  "20210119" :
			            {tf.setText("오늘은 새벽 5시에 아스널 VS 뉴캐슬 경기가 있습니다.");break;}
				case "20210120" :
			            {tf.setText("오늘은 새벽 3시에 웨스트햄 VS 웨스트브롬,새벽 5시 15분에 레스터 VS 첼시 경기가 있습니다.");break;}
				case  "20210121" :
			            {tf.setText("오늘은 새벽 3시에 맨시티 VS 아스톤 빌라, 새벽 5시 15분에 풀럼 VS 맨유 경기가 있습니다.");break;}
				case "20210123" :
			            {tf.setText("오늘은 새벽 5시에 리버풀 VS 번리 경기가 있습니다.");break;}
				case "20210124" : 
			            {tf.setText("오늘은 새벽 5시에 아스톤 빌라VS 뉴캐슬 경기가 있습니다.");break;}
				case  "20210127" :
			            {tf.setText("오늘은 새벽 3시에 뉴캐슬 VS 리즈, 팰리스 VS 웨스트햄 새벽 5시에 웨스트브롬 VS 맨시티, 사우샘프턴 VS 아스널 경기가 있습니다.");break;}
				case "20210128" :
			            {tf.setText("오늘은 새벽 3시에 첼시 VS 울버햄튼, 번리 VS 아스톤 빌라 새벽 4시 30분에 브라이튼 VS 풀럽 새벽 5시 15분에 맨유 VS 셰필드, 에버턴 VS 레스터 경기가 있습니다.");break;}
				case "20210129 ": 
			            {tf.setText("오늘은 새벽 5시에 토트넘 VS 리버풀 경기가 있습니다.");break;}
			      case "20210130" :
			            {tf.setText("오늘은 오후 11시에 에버턴 VS 뉴캐슬 경기가 있습니다.");break;}
			           case"20210131":
			            {tf.setText("오늘은 새벽 12시에 웨스트브롬 VS 풀럼, 맨시티 VS 셰필드, 팰리스 VS 울버햄튼 새벽 2시 30분에 아스널 VS 맨유, 새벽 5시에 사우샘프턴 VS 아스톤 빌라, 오후 9시에 첼시 VS 번리 오후 11시에 레스터 VS 리즈 경기가 있습니다.");break;}
			            case "20210201":
			            {tf.setText("오늘은 새벽 1시 30분에 웨스트햄 VS 리버풀, 새벽 4시 15분에 브라이튼 VS 토트넘 경기가 있습니다.");break;}
			            case "20210203": 
			            {tf.setText("오늘은 새벽 3시에 셰필드 VS 웨스트브롬, 울버햄튼 VS 아스널 새벽 5시 15분에 맨유 VS 사우샘프턴, 뉴캐슬 VS 팰리스 경기가 있습니다.");break;}
			            case "20210204": 
			            {tf.setText("오늘은 새벽 3시에 풀럼 VS 레스터, 번리 VS 맨시티 새벽 4시30분에 리즈 VS 에버턴 새벽 5시 15분에 리버풀 VS 브라이튼, 아스톤 빌라 VS 웨스트햄 경기가 있습니다.");break;}
			            case "20210205":
			            {tf.setText("오늘은 새벽 5시에 토트넘 VS 첼시 경기가 있습니다.");break;}
			            case "20210206": 
			            {tf.setText("오늘은 오후 9시30분에 아스톤 빌라 VS 아스널 경기가 있습니다.");break;}
			            case "20210207": 
			            {tf.setText("오늘은 새벽 12시에 번리 VS 브라이튼, 뉴캐슬 VS 사우샘프턴 새벽 2시 30분에 풀럼 VS 웨스트햄 새벽 5시에 맨유 VS 에버턴 오후 9시에 토트넘 VS 웨스트브롬 오후 11시에 울버햄튼 VS 레스터 경기가 있습니다.");break;}
			            case "20210208": 
			            {tf.setText("오늘은 새벽 1시 30분에 리버풀 VS 맨시티 새벽 4시 15분에 셰필드 VS 첼시 경기가 있습니다.");break;}
			            case "20210209": 
			            {tf.setText("오늘은 새벽 5시에 리즈 VS 팰리스 경기가 있습니다.");break;}
			            case "20210213":
			            {tf.setText("오늘은 오후 9시 30분에 레스터 VS 리버풀 경기가 있습니다.");break;}
			            case "20210214":
			            {tf.setText("오늘은 새벽 12시에 팰리스 VS 번리 새벽 2시 30분에 맨시티 VS 토트넘 새벽 5시에    바르셀로나 VS 알라베스 오후 9시에 사우샘프턴 VS 울버햄튼 오후 11시에 웨스트브롬 VS 맨유 경기가 있습니다.");break;}
			            case "20210215":
			            {tf.setText("오늘은 새벽 1시 30분에 아스널 VS 리즈 새벽 4시에 에버턴 VS 풀럼 경기가 있습니다.");break;}
			            case "20210216":
			            {tf.setText("오늘은 새벽 3시에 웨스트햄 VS 셰필드 새벽 5시에 첼시 VS 뉴캐슬 경기가 있습니다.");break;}
			            case "20210218":
			            {tf.setText("오늘은 새벽 3시에 번리 VS 풀럼 새벽 5시 15분에 에버턴 VS 맨시티 경기가 있습니다.");break;}
			            case "20210220":
			            {tf.setText("오늘은 새벽 5시에 울버햄튼 VS 리즈 오후 9시 30분에 사우샘프턴 VS 첼시 경기가 있습니다.");break;}
			            case "20210221":
			            {tf.setText("오늘은 새벽 12시에 번리 VS 웨스트브롬 새벽 2시 30분에 리버풀 VS 에버턴 새벽 5시에 풀럼 VS 셰필드 오후 9시에 웨스트햄 VS 토트넘 오후 11시 05분에 아스톤빌라 VS 레스터 경기가 있습니다.");break;}
			            case "20210222":
			            {tf.setText("오늘은 새벽 1시 30분에 아스널 VS 맨시티 새벽 4시에 맨유 VS 뉴캐슬 경기가 있습니다.");break;}
			            case "20210223": 
			            {tf.setText("오늘은 새벽 5시에 브라이튼 VS 팰리스 경기가 있습니다.");break;}
			            case "20210224": 
			            {tf.setText("오늘은 새벽 3시에 리즈 VS 사우샘프턴 경기가 있습니다.");break;}
			            case "20210227":
			            {tf.setText("오늘은 오후 9시 30분에 맨시티 VS 웨스트햄 경기가 있습니다.");break;}
			            case"20210228":
			            {tf.setText("오늘은 새벽 웨스트브롬 VS 브라이튼 새벽 2시 30분에 리즈 VS 아스톤빌라 새벽 5시에 뉴캐슬 VS 울버햄튼 오후 9시에 팰리스 VS 풀럼 레스터 VS 아스널 오후 11시에 토트넘 VS 번리 경기가 있습니다.");break;}
			            case "20210301": 
			            {tf.setText("오늘은 새벽 1시 30분에 첼시 VS 맨유 새벽 4시 15분에 셰필드 VS 리버풀 경기가 있습니다.");break;}
			            case "20210302": 
			            {tf.setText("오늘은 새벽 5시에 에버턴 VS 사우샘프턴 경기가 있습니다.");break;}
			            case"20210303": 
			            {tf.setText("오늘은 새벽 5시에 맨시티 VS 울버햄튼 경기가 있습니다.");break;}
			            case "20210304": 
			            {tf.setText("오늘은 새벽 3시에 번리 VS 레스터 셰필드 VS 아스톤빌라 새벽 5시 15분에 팰리스 VS 맨유 경기가 있습니다.");break;}
			            case "20210305":
			            {tf.setText("오늘은 새벽 3시에 웨스트브롬 VS 에버턴 풀럼 VS 토트넘 새벽 5시 15분에 리버풀 VS 첼시 경기가 있습니다.");break;}
			            case "20210306": 
			            {tf.setText("오늘은 오후 9시 30분에 번리 VS 아스널 경기가 있습니다.");break;}
			            case "20210307": 
			            {tf.setText("오늘은 새벽 12시에 셰필드 VS 사우샘프턴 새벽 2시 30분에 아스톤빌라 VS 울버햄튼 새벽 5시에 브라이튼 VS 레스터 오후 9시에 웨스터브롬 VS 뉴캐슬 오후 11시에 리버풀 VS 풀럼 경기가 있습니다.");break;}
			            case"20210308":
			            {tf.setText("오늘은 새벽 1시 30분에 맨시티 VS 맨유 새벽 4시 15분에 토트넘 VS 팰리스 경기가 있습니다.");break;}
			            case "20210309":
			            {tf.setText("오늘은 새벽 3시에 첼시 VS 에버턴 새벽 5시에 웨스트햄 VS 리즈 경기가 있습니다.");break;}
			            case "20210311":
			            {tf.setText("오늘은 새벽 3시에 맨시티 VS 사우샘프턴 경기가 있습니다.");break;}
			            case "20210313":
			            {tf.setText("오늘은 새벽 5시에 뉴캐슬 VS 아스톤빌라 오후 9시 30분에 리즈 VS 첼시 경기가 있습니다.");break;}
			            case "20210314":
			            {tf.setText("오늘은 새벽 12시에 팰리스 VS 웨스트브롬 새벽 2시 30분에 에버턴 VS 번리 새벽 5시에 풀럼 VS 맨시티 오후 9시에 사우샘프턴 VS 브라이튼 오후 11시에 레스터 VS 셰필드 경기가 있습니다.");break;}
			           case "20210315": 
			            {tf.setText("오늘은 새벽 1시 30분에 아스널 VS 토트넘 새벽 4시 15분에 맨유 VS 웨스트햄 경기가 있습니다.");break;}
			            case "20210316":
			            {tf.setText("오늘은 새벽 5시에 울버햄튼 VS 리버풀 경기가 있습니다.");break;}
			            case "20210320": 
			            {tf.setText("오늘은 새벽 5시에 풀럼 VS 리즈 경기가 있습니다.");break;}
			            case "20210321":
			            {tf.setText("오늘은 새벽 5시에 브라이튼 VS 뉴캐슬 경기가 있습니다.");break;}
			            case "20210322":
			            {tf.setText("오늘은 새벽 12시에 웨스트햄 VS 아스널 새벽 4시 30분에 아스톤빌라 VS 토트넘 경기가 있습니다.");break;}
			            case "20210403":
			            {tf.setText("오늘은 오후 8시 30분에 첼시 VS 웨스트브롬 오후 11시에 리즈 VS 셰필드 경기가 있습니다.");break;}
			            case "20210404":
			            {tf.setText("오늘은 새벽 1시 30분에 레스터 VS 맨시티 새벽 4시에 아스널 VS 리버풀 오후 8시에 사우샘프턴 VS 번리 오후 10시 05분에 뉴캐슬 VS 토트넘 경기가 있습니다.");break;}
			            case "20210405":
			            {tf.setText("오늘은 새벽 12시 30분에 아스톤빌라 VS 풀럼 새벽 3시 30분에 맨유 VS 브라이튼 경기가 있습니다.");break;}
			            case "20210406":
			            {tf.setText("오늘은 새벽 2시에 에버턴 VS 팰리스 새벽 4시 15분에 울버햄튼 VS 웨스트햄 경기가 있습니다.");break;}
			            case "20210410":
			            {tf.setText("오늘은 새벽 4시에 풀럼 VS 울버햄튼 오후 8시 30분에 맨시티 VS 리즈 오후 11시에 리버풀 VS 아스톤빌라 경기가 있습니다.");break;}
			            case "20210411":
			            {tf.setText("오늘은 새벽 1시 30분에 팰리스 VS 첼시 오후 8시에 번리 VS 뉴캐슬 오후 10시 05분에 웨스트햄 VS 레스터 경기가 있습니다.");break;}
			           case "20210412":
			            {tf.setText("오늘은 새벽 12시 30분에 토트넘 VS 맨유 새벽 3시에 셰필드 VS 아스널 경기가 있습니다.");break;}
			            case "20210413":
			            {tf.setText("오늘은 새벽 2시에 웨스트브롬 VS 사우샘프턴 새벽 4시 15분에 브라이튼 VS 에버턴 경기가 있습니다.");break;}
			            case "20210417":
			            {tf.setText("오늘은 새벽 4시에 에버턴 VS 토트넘 오후 8시 30분에 뉴캐슬 VS 웨스트햄 경기가 있습니다.");break;}
			            case "20210418":
			            {tf.setText("오늘은 새벽 4시 15분에 울버햄튼 VS 셰필드 오후 9시 30분에 아스널 VS 풀럼 경기가 있습니다.");break;}
			            case "20210419":
			            {tf.setText("오늘은 새벽 12시에 맨유 VS 번리 경기가 있습니다.");break;}
			            case "20210420":
			            {tf.setText("오늘은 새벽 4시에 리즈 VS 리버풀 경기가 있습니다.");break;}
			            case "20210421":
			            {tf.setText("오늘은 새벽 4시에 첼시 VS 브라이튼 경기가 있습니다.");break;}
			            case "20210422":
			            {tf.setText("오늘은 새벽 2시에 토트넘 VS 사우샘프턴 새벽 4시 15분에 아스톤빌라 VS 맨시티 경기가 있습니다.");break;}
			            case "20210423":
			            {tf.setText("오늘은 새벽 4시에 레스터 VS 웨스트브롬 경기가 있습니다.");break;}
			            case"20210424":
			            {tf.setText("오늘은 새벽 4시에 아스널 VS 에버턴 오후 8시 30분에 리버풀 VS 뉴캐슬 경기가 있습니다.");break;}
			            case "20210425": 
			            {tf.setText("오늘은 새벽 1시 30분에 웨스트햄 VS 첼시 새벽 4시에 셰필드 VS 브라이튼 오후 8시에 울버햄튼 VS 번리 오후 10시에 리즈 VS 맨유 경기가 있습니다.");break;}
			            case"20210426":
			            {tf.setText("오늘은 새벽 3시에 아스톤빌라 VS 웨스트브롬 경기가 있습니다.");break;}
			            case "20210427":
			            {tf.setText("오늘은 새벽 4시에 레스터 VS 팰리스 경기가 있습니다.");break;}
			            case "20210501":
			            {tf.setText("오늘은 새벽 4시에 사우샘프턴 VS 레스터 오후 8시 30분에 팰리스 VS 맨시티 오후 11시에 브라이튼 VS 리즈 경기가 있습니다.");break;}
			            case "20210502":
			            {tf.setText("오늘은 새벽 1시 30분에 첼시 VS 풀럼 새벽 4시에 에버턴 VS 아스톤빌라 오후 10시에 뉴캐슬 VS 아스널 경기가 있습니다.");break;}
			            case "20210503":
			            {tf.setText("오늘은 새벽 3시 15분에 토트넘 VS 셰필드 경기가 있습니다.");break;}
			            case "20210504": 
			            {tf.setText("오늘은 새벽 2시에 웨스트브롬 VS 울버햄튼 새벽 4시 15분에 번리 VS 웨스트햄 경기가 있습니다.");break;}
			            case "20210508":
			            {tf.setText("오늘은 새벽 4시에 레스터 VS 뉴캐슬 오후 8시 30분에 리즈 VS 토트넘 오후 11시에 셰필드 VS 팰리스 경기가 있습니다.");break;}
			            case "20210509":
			            {tf.setText("오늘은 새벽 1시 30분에 맨시티 VS 첼시 새벽 4시 15분에 리버풀 VS 사우샘프턴 오후 8시에 울버햄튼 VS 브라이튼 오후 10시 05분에 아스톤빌라 VS 맨유경기가 있습니다.");break;}
			            case"20210510":
			            {tf.setText("오늘은 새벽 12시 30분에 웨스트햄 VS 에버턴 새벽 3시에 아스널 VS 웨스트브롬 경기가 있습니다.");break;}
			            case"20210511":
			            {tf.setText("오늘은 새벽 4시에 풀럼 VS 번리 경기가 있습니다.");break;}
			            case "20210512":
			            {tf.setText("오늘은 새벽 2시에 맨유 VS 레스터 새벽 4시 15분에 사우샘프턴 VS 팰리스 경기가 있습니다.");break;}
			            case "20210513":
			            {tf.setText("오늘은 새벽 4시 15분에 첼시 VS 아스널 경기가 있습니다.");break;}
			            case "20210514": 
			            {tf.setText("오늘은 새벽 2시에 아스톤빌라 VS 에버턴 새벽 4시 15분에 맨유 VS 리버풀 경기가 있습니다.");break;}
			            case "20210515":
			            {tf.setText("오늘은 새벽 4시에 뉴캐슬 VS 맨시티 오후 8시 30분에 번리 VS 리즈 오후 11시에 사우샘프턴 VS 풀럼 경기가 있습니다.");break;}
			            case "20210516":
			            {tf.setText("오늘은 새벽 4시에 브라이튼 VS 웨스트햄 오후 8시에 팰리스 VS 아스톤빌라 오후 10시 05분에 토트넘 VS 울버햄튼 경기가 있습니다.");break;}
			            case "20210517": 
			            {tf.setText("오늘은 새벽 12시 30분에 웨스트브롬 VS 리버풀 새벽 3시에 에버턴 VS 셰필드 경기가 있습니다.");break;}
			            case "20210519":
			            {tf.setText("오늘은 새벽 2시에 맨유 VS 풀럼 사우샘프턴 VS 리즈 새벽 3시에 브라이튼 VS 맨시티 새벽 4시 15분에 첼시 VS 레스터 경기가 있습니다.");break;}
			            case "20210520":
			            {tf.setText("오늘은 새벽 2시에 에버턴 VS 울버햄튼 뉴캐슬 VS 셰필드 토트넘 VS 아스톤빌라 새벽 3시에 팰리스 VS 아스널 새벽 4시 15분에 번리 VS 리버풀 웨스트브롬 VS 웨스트햄 경기가 있습니다.");break;}
			            case "20210524":
			            {tf.setText("오늘은 새벽 12시에 울버햄튼 VS 맨유, 웨스트햄 VS 사우샘프턴, 셰필드 VS 번리, 리버풀 VS 팰리스, 레스터 VS 토트넘, 아스톤빌라 VS 첼시, 맨시티 VS 에버턴, 리즈 VS 웨스트브롬, 풀럼 VS 뉴캐슬, 아스널 VS 브라이튼 경기가 있습니다.");break;}

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
	        setTitle("역대 구단");
	   
	        
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
		private JButton ti = new JButton("영국 시간 가져오기");
	    newWindow2() {
	        setTitle("영국시간");
	        	       
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
		String[] itemTitle = {"HOME","spotv","순위표","Exit"};
		String[] itemTitle2 = {"HOME","구단","역대전적"};
		String[] itemTitle3 = {"영국시간"};
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
				case "순위표" :
					try { Desktop.getDesktop().browse(new URI("https://www.premierleague.com/tables")); 
					} catch (IOException a) { 
						a.printStackTrace();
					}catch (URISyntaxException a) {
						a.printStackTrace(); }  break;
				case "Exit" :
					System.exit(0); break;
				case "구단" :
					imgLabel.setIcon(new ImageIcon(imageURL));  break;	
				case "역대전적" :
					new newWindow(); break;
				case "영국시간" :
					new newWindow2(); break;
			}
		}
	}
	public static void main(String[] args) {
		new Project();
	}
}