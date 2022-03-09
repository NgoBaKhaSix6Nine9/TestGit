	import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.awt.Panel;
import java.util.ArrayList;
import java.awt.FlowLayout;
import javax.swing.Box;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import java.awt.Component;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Model.QLSVmodel;
import Model.Tinh;

import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
public class Frema<groupButton> extends JFrame {

	QLSVmodel svModel=new QLSVmodel();
	private JPanel contentPane;
	private JTextField textField_masinhvien;
	private JTable table;
	private JTextField textField_masinhvien_2;
	private JTextField textField_hoten;
	private JTextField textField_ngaysinh;
	private JTextField textField_mon_1;
	private JTextField textField_mon_2;
	private JTextField textField_mon_3;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frema frame = new Frema();
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
	public Frema() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 606, 732);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 610, 22);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);
		
		JMenu Menu_Open = new JMenu("Open");
		mnNewMenu.add(Menu_Open);
		
		JMenu Menu_Close = new JMenu("Close");
		mnNewMenu.add(Menu_Close);
		
		JSeparator separator = new JSeparator();
		mnNewMenu.add(separator);
		
		JMenu Menu_Exits = new JMenu("Exits");
		mnNewMenu.add(Menu_Exits);
		
		JMenu mnNewMenu_1 = new JMenu("About");
		menuBar.add(mnNewMenu_1);
		
		JMenu Menu_Infor = new JMenu("Infor");
		mnNewMenu_1.add(Menu_Infor);
		
		JPanel panel_filter = new JPanel();
		panel_filter.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Sutdent Filter", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_filter.setBounds(0, 22, 590, 71);
		contentPane.add(panel_filter);
		panel_filter.setLayout(null);
		
		JLabel label_quequan = new JLabel("Qu\u00EA Qu\u00E1n");
		label_quequan.setBounds(10, 20, 84, 31);
		panel_filter.add(label_quequan);
		label_quequan.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		JComboBox comboBox_quequan_1 = new JComboBox();
		ArrayList<Tinh> dstinh= Tinh.getdsTinh();
		comboBox_quequan_1.addItem(" ");
		for (Tinh tinh : dstinh) {
			comboBox_quequan_1.addItem(tinh.getTenTinh());
		}
		
		comboBox_quequan_1.setBounds(104, 23, 135, 31);
		panel_filter.add(comboBox_quequan_1);
		
		JLabel label_masinhvien_1 = new JLabel("M\u00E3 Sinh Vi\u00EAn");
		label_masinhvien_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		label_masinhvien_1.setBounds(249, 20, 100, 31);
		panel_filter.add(label_masinhvien_1);
		
		textField_masinhvien = new JTextField();
		textField_masinhvien.setBounds(359, 23, 122, 31);
		panel_filter.add(textField_masinhvien);
		textField_masinhvien.setColumns(10);
		
		JButton bt_tim = new JButton("T\u00ECm");
		bt_tim.setFont(new Font("Tahoma", Font.PLAIN, 17));
		bt_tim.setBounds(491, 18, 89, 34);
		panel_filter.add(bt_tim);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setEnabled(false);
		scrollPane.setToolTipText("edfedf");
		scrollPane.setViewportBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		scrollPane.setBounds(0, 104, 590, 228);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 14));
		table.getTableHeader().setResizingAllowed(false);
		table.getTableHeader().setReorderingAllowed(false);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"STT", "ID", "T\u00EAn", "Qu\u00EA Qu\u00E1n", "Ng\u00E0y Sinh", "Gi\u1EDBi T\u00EDnh", "M\u00F4n 1", "M\u00F4n 2", "M\u00F4n 3"
			}
		));

		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel_1 = new JLabel("Th\u00F4ng Tin Sinh Vi\u00EAn");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 343, 131, 34);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("M\u00E3 Sinh Vi\u00EAn");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(10, 388, 82, 34);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("H\u1ECD V\u00E0 T\u00EAn");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_2.setBounds(10, 433, 72, 34);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Qu\u00EA Qu\u00E1n");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_3.setBounds(10, 482, 72, 34);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Ng\u00E0y Sinh");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_4.setBounds(10, 525, 72, 34);
		contentPane.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Gi\u1EDBi T\u00EDnh");
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_5.setBounds(279, 388, 56, 34);
		contentPane.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("M\u00F4n 1");
		lblNewLabel_1_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_6.setBounds(277, 433, 45, 34);
		contentPane.add(lblNewLabel_1_6);
		
		JLabel lblNewLabel_1_7 = new JLabel("M\u00F4n 2");
		lblNewLabel_1_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_7.setBounds(279, 482, 50, 34);
		contentPane.add(lblNewLabel_1_7);
		
		JLabel lblNewLabel_1_8 = new JLabel("M\u00F4n 3");
		lblNewLabel_1_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_8.setBounds(279, 525, 56, 34);
		contentPane.add(lblNewLabel_1_8);
		
		textField_masinhvien_2 = new JTextField();
		textField_masinhvien_2.setColumns(10);
		textField_masinhvien_2.setBounds(96, 388, 122, 31);
		contentPane.add(textField_masinhvien_2);
		
		textField_hoten = new JTextField();
		textField_hoten.setColumns(10);
		textField_hoten.setBounds(96, 433, 122, 31);
		contentPane.add(textField_hoten);
		
		textField_ngaysinh = new JTextField();
		textField_ngaysinh.setColumns(10);
		textField_ngaysinh.setBounds(96, 525, 122, 31);
		contentPane.add(textField_ngaysinh);
		
		textField_mon_1 = new JTextField();
		textField_mon_1.setColumns(10);
		textField_mon_1.setBounds(332, 433, 122, 31);
		contentPane.add(textField_mon_1);
		
		textField_mon_2 = new JTextField();
		textField_mon_2.setColumns(10);
		textField_mon_2.setBounds(332, 482, 122, 31);
		contentPane.add(textField_mon_2);
		
		textField_mon_3 = new JTextField();
		textField_mon_3.setColumns(10);
		textField_mon_3.setBounds(332, 525, 122, 31);
		contentPane.add(textField_mon_3);
		
		JComboBox comboBox_quequan_2 = new JComboBox();
		comboBox_quequan_2.addItem(" ");
		for (Tinh tinh : dstinh) {
			comboBox_quequan_2.addItem(tinh.getTenTinh());
		}
		comboBox_quequan_2.setBounds(96, 482, 122, 31);
		contentPane.add(comboBox_quequan_2);
		
		JRadioButton rdbt_nam = new JRadioButton("Nam");
		rdbt_nam.setHorizontalAlignment(SwingConstants.LEFT);
		rdbt_nam.setBounds(345, 396, 67, 23);
		contentPane.add(rdbt_nam);
		
		JRadioButton rdbtn_nu = new JRadioButton("Nữ");
		rdbtn_nu.setBounds(414, 396, 45, 23);
		contentPane.add(rdbtn_nu);
		
		ButtonGroup btn_gioitinh = new ButtonGroup();
		btn_gioitinh.add(rdbtn_nu);
		btn_gioitinh.add(rdbt_nam);
		
		
		JButton bt_themsv = new JButton("Th\u00EAm");
		bt_themsv.setFont(new Font("Tahoma", Font.PLAIN, 17));
		bt_themsv.setBounds(10, 584, 89, 34);
		contentPane.add(bt_themsv);
		
		JButton bt_xoasv = new JButton("X\u00F3a");
		bt_xoasv.setFont(new Font("Tahoma", Font.PLAIN, 17));
		bt_xoasv.setBounds(123, 584, 89, 34);
		contentPane.add(bt_xoasv);
		
		JButton bt_capnhatsv = new JButton("C\u1EADp Nh\u1EADt");
		bt_capnhatsv.setFont(new Font("Tahoma", Font.PLAIN, 17));
		bt_capnhatsv.setBounds(233, 584, 102, 34);
		contentPane.add(bt_capnhatsv);
		
		JButton bt_luusv = new JButton("L\u01B0u");
		bt_luusv.setFont(new Font("Tahoma", Font.PLAIN, 17));
		bt_luusv.setBounds(370, 584, 89, 34);
		contentPane.add(bt_luusv);
		
		JButton bt_huybo = new JButton("H\u1EE7y B\u1ECF");
		bt_huybo.setFont(new Font("Tahoma", Font.PLAIN, 17));
		bt_huybo.setBounds(491, 584, 89, 34);
		contentPane.add(bt_huybo);
	}
}
