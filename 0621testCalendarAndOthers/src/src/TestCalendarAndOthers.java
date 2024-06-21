package src;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JDayChooser;
import com.toedter.calendar.JMonthChooser;
import com.toedter.calendar.JYearChooser;
import com.toedter.components.JLocaleChooser;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class TestCalendarAndOthers extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestCalendarAndOthers frame = new TestCalendarAndOthers();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TestCalendarAndOthers() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		//開始蓋樂高...蓋一堆Jlabel...//實際上先蓋什麼元件沒差//只是強迫症才把Jlabel整理放一起的///
		JLabel lblJdaychooser = new JLabel("JDayChooser");
		lblJdaychooser.setOpaque(true);
		lblJdaychooser.setHorizontalAlignment(SwingConstants.CENTER);
		lblJdaychooser.setFont(new Font("微软雅黑", Font.BOLD, 16));
		lblJdaychooser.setBounds(241, 23, 201, 48);
		contentPane.add(lblJdaychooser);
		
		JLabel lblJmonthchooser = new JLabel("JMonthChooser");
		lblJmonthchooser.setOpaque(true);
		lblJmonthchooser.setHorizontalAlignment(SwingConstants.CENTER);
		lblJmonthchooser.setFont(new Font("微软雅黑", Font.BOLD, 16));
		lblJmonthchooser.setBounds(30, 23, 175, 48);
		contentPane.add(lblJmonthchooser);
		
		JLabel lblJlocalchooser = new JLabel("JLocalChooser");
		lblJlocalchooser.setOpaque(true);
		lblJlocalchooser.setHorizontalAlignment(SwingConstants.CENTER);
		lblJlocalchooser.setFont(new Font("微软雅黑", Font.BOLD, 16));
		lblJlocalchooser.setBounds(30, 551, 181, 32);
		contentPane.add(lblJlocalchooser);
		
		JLabel lblJdatechooser = new JLabel("JDateChooser");
		lblJdatechooser.setOpaque(true);
		lblJdatechooser.setHorizontalAlignment(SwingConstants.CENTER);
		lblJdatechooser.setFont(new Font("微软雅黑", Font.BOLD, 16));
		lblJdatechooser.setBounds(30, 200, 201, 48);
		contentPane.add(lblJdatechooser);
		
		JLabel lblJcalender = new JLabel("JCalender");
		lblJcalender.setOpaque(true);
		lblJcalender.setHorizontalAlignment(SwingConstants.CENTER);
		lblJcalender.setFont(new Font("微软雅黑", Font.BOLD, 16));
		lblJcalender.setBounds(672, 23, 201, 48);
		contentPane.add(lblJcalender);

		JLabel lblJyearchooser = new JLabel("JYearChooser");
		lblJyearchooser.setOpaque(true);
		lblJyearchooser.setHorizontalAlignment(SwingConstants.CENTER);
		lblJyearchooser.setFont(new Font("微软雅黑", Font.BOLD, 16));
		lblJyearchooser.setBounds(30, 378, 201, 48);
		contentPane.add(lblJyearchooser);
		
		JLabel lblComboBox = new JLabel("ComboBox");
		lblComboBox.setOpaque(true);
		lblComboBox.setHorizontalAlignment(SwingConstants.CENTER);
		lblComboBox.setFont(new Font("微软雅黑", Font.BOLD, 16));
		lblComboBox.setBounds(252, 551, 181, 32);
		contentPane.add(lblComboBox);
		//這裡是一個放有GIF的Jlabel//////////////////////////////////////////////////////////////////
		JLabel lblGIF = new JLabel("a GIF");
		lblGIF.setIcon(new ImageIcon(TestCalendarAndOthers.class.getResource("/src/sticker_10.gif")));
		lblGIF.setOpaque(true);
		lblGIF.setHorizontalAlignment(SwingConstants.CENTER);
		lblGIF.setFont(new Font("微软雅黑", Font.BOLD, 16));
		lblGIF.setBounds(512, 362, 374, 301);
		contentPane.add(lblGIF);
		//蓋些txtArea,按鈕,ComboBox...,等等的常見的內建樂高元件///////////////////////////////////
		JTextArea txtAreaShow = new JTextArea();
		txtAreaShow.setBounds(241, 307, 324, 230);
		contentPane.add(txtAreaShow);
		txtAreaShow.setText("測試:先隨便寫點字");
		
		JButton btnNewButton = new JButton("這是彈窗按鈕");
		btnNewButton.setFont(new Font("微软雅黑", Font.BOLD, 16));
		btnNewButton.setBounds(452, 23, 194, 48);
		contentPane.add(btnNewButton);
		
		JComboBox myComboBox = new JComboBox();
		myComboBox.setBounds(268, 593, 145, 55);
		contentPane.add(myComboBox);
		//老師的月曆相關樂高元件,需要外掛jar/////////////////////////////////////////////////////////
		JDateChooser myDateChooser = new JDateChooser();
		myDateChooser.setBounds(30, 258, 201, 108);
		contentPane.add(myDateChooser);
		
		JDayChooser myDayChooser = new JDayChooser();
		myDayChooser.setBounds(241, 76, 270, 221);
		contentPane.add(myDayChooser);
		
		JMonthChooser myMonthChooser = new JMonthChooser();
		myMonthChooser.setBounds(41, 76, 161, 107);
		contentPane.add(myMonthChooser);
		
		JLocaleChooser mylocaleChooser = new JLocaleChooser();
		mylocaleChooser.setBounds(27, 593, 194, 55);
		contentPane.add(mylocaleChooser);
		
		JCalendar myCalendar = new JCalendar();
		myCalendar.setBounds(575, 81, 298, 216);
		contentPane.add(myCalendar);
		
		JYearChooser myYearChooser = new JYearChooser();
		myYearChooser.setBounds(41, 436, 181, 101);
		contentPane.add(myYearChooser);
		//上面在蓋樂高,相對不重要(就是把按鈕等元件放上Panel時就會跑出來的東西)///////////////////
		
		//Event區塊,先蓋完你的版面,確定元件都有出現後再用Event比較安全,總之Event放下面比較不會有紅字
		//Button/event/參考語法用/測試optionPane(彈窗)////////////////////////////////////////
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//optionPane(彈窗),參考網站1:https://peimei0808.pixnet.net/blog/post/326253717
				//optionPane(彈窗),參考網站2:https://peimei0808.pixnet.net/blog/post/328142970
				//上面參考網站功能太多,大多情況我只想用最簡單的用法
				JOptionPane.showMessageDialog(null,"這是彈窗訊息\n可換行\t可Tab");
				txtAreaShow.setText("你按了:\t按鈕");
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});	
		btnNewButton.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
			}
		});
		///ComboBox/event//////////////////////////////////
		//ComboBox(下拉選單),參考網站:https://tw-hkt.blogspot.com/2019/06/java-jcombobox.html
		myComboBox.addItem("請選擇");
        myComboBox.addItem("男");
        myComboBox.addItem("女");
        myComboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mySelect = (String) myComboBox.getSelectedItem();//get the selected item
				if(mySelect.equals("請選擇")) {
					JOptionPane.showMessageDialog(null,"你選了:\t請選擇");
					txtAreaShow.setText("你選了:\t請選擇");
				}else if(mySelect.equals("男")) {
					JOptionPane.showMessageDialog(null,"你選了:\t男");
					txtAreaShow.setText("你選了:\t男");
				}else {
					JOptionPane.showMessageDialog(null,"你選了:\t女");
					txtAreaShow.setText("你選了:\t女");
				}
			}
		});
		/////dayChooser/event///////////////////////////////////////////////
		myDayChooser.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
				txtAreaShow.setText("DayChooser:"+myDayChooser.getDay()
									+"\nCalendar:"+myCalendar.getDate()
									+"\nDateChooser:"+myDateChooser.getDate() );
			}
		});
		//////calendar/event///////////////////////////////////////////
		myCalendar.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
				txtAreaShow.setText("DayChooser:"+myDayChooser.getDay()
									+"\nCalendar:"+myCalendar.getDate()
									+"\nMonthChooser:"+myMonthChooser.getMonth()
									+"\nDateChooser:"+myDateChooser.getDate());
			}
		});
		///////dateChooser/event//////////////////////////////////////////////////
		myDateChooser.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
				txtAreaShow.setText("DayChooser:"+myDayChooser.getDay()
									+"\nCalendar:"+myCalendar.getDate()
									+"\nDateChooser:"+myDateChooser.getDate());
			}
		});
		///monthChooser/event//////////////////////////////////
		myMonthChooser.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
				txtAreaShow.setText("DayChooser:"+myDayChooser.getDay()
									+"\nCalendar:"+myCalendar.getDate()
									+"\nMonthChooser: "+myMonthChooser.getMonth()
									+"\nMonthChooser一月=0,12月=11...要程式碼主動+1"
									+"\n主動+1的MonthChooser: "+(myMonthChooser.getMonth()+1)
									+"\nDateChooser:"+myDateChooser.getDate());
			}
		});
		//程式碼到這裡結束////////////
	}

}
