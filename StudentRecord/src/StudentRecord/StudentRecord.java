package StudentRecord;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JScrollBar;
import javax.swing.JComboBox;
import javax.swing.JToggleButton;
import javax.swing.DefaultComboBoxModel;

public class StudentRecord {

	private JFrame frame;
	private JTextField jtxtStudentID;
	private JTextField jtxtEng;
	private JTextField jtxtBio;
	private JTextField jtxtCom;
	private JTextField jtxtChem;
	private JTextField jtxtPhy;
	private JTextField jtxtAddM;
	private JTextField jtxtBus;
	private JTextField jtxtTotalScore;
	private JTextField jtxtAverage;
	private JTextField jtxtRanking;
	private JTextField jtxtMaths;
	private JTextField jtxtFirstname;
	private JTextField jtxtSurname;
	private JTextField jtxtExamNo;
	private JTextField jtxtDOB;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentRecord window = new StudentRecord();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StudentRecord() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1450, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(176, 224, 230));
		panel.setBorder(new LineBorder(new Color(95, 158, 160), 12));
		panel.setBounds(10, 11, 930, 441);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		jtxtStudentID = new JTextField();
		jtxtStudentID.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		jtxtStudentID.setBounds(151, 21, 240, 35);
		panel.add(jtxtStudentID);
		jtxtStudentID.setColumns(10);
		
		jtxtEng = new JTextField();
		jtxtEng.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		jtxtEng.setColumns(10);
		jtxtEng.setBounds(612, 57, 240, 35);
		panel.add(jtxtEng);
		
		JLabel lblMaths = new JLabel("Maths:");
		lblMaths.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblMaths.setBounds(481, 32, 109, 28);
		panel.add(lblMaths);
		
		jtxtBio = new JTextField();
		jtxtBio.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		jtxtBio.setColumns(10);
		jtxtBio.setBounds(612, 92, 240, 35);
		panel.add(jtxtBio);
		
		jtxtCom = new JTextField();
		jtxtCom.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		jtxtCom.setColumns(10);
		jtxtCom.setBounds(612, 127, 240, 35);
		panel.add(jtxtCom);
		
		jtxtChem = new JTextField();
		jtxtChem.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		jtxtChem.setColumns(10);
		jtxtChem.setBounds(612, 164, 240, 35);
		panel.add(jtxtChem);
		
		jtxtPhy = new JTextField();
		jtxtPhy.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		jtxtPhy.setColumns(10);
		jtxtPhy.setBounds(612, 201, 240, 35);
		panel.add(jtxtPhy);
		
		jtxtAddM = new JTextField();
		jtxtAddM.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		jtxtAddM.setColumns(10);
		jtxtAddM.setBounds(612, 238, 240, 35);
		panel.add(jtxtAddM);
		
		jtxtBus = new JTextField();
		jtxtBus.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		jtxtBus.setColumns(10);
		jtxtBus.setBounds(612, 274, 240, 35);
		panel.add(jtxtBus);
		
		jtxtTotalScore = new JTextField();
		jtxtTotalScore.setEnabled(false);
		jtxtTotalScore.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		jtxtTotalScore.setColumns(10);
		jtxtTotalScore.setBounds(612, 311, 240, 35);
		panel.add(jtxtTotalScore);
		
		jtxtAverage = new JTextField();
		jtxtAverage.setEnabled(false);
		jtxtAverage.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		jtxtAverage.setColumns(10);
		jtxtAverage.setBounds(612, 348, 240, 35);
		panel.add(jtxtAverage);
		
		jtxtRanking = new JTextField();
		jtxtRanking.setEnabled(false);
		jtxtRanking.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		jtxtRanking.setColumns(10);
		jtxtRanking.setBounds(612, 384, 240, 35);
		panel.add(jtxtRanking);
		
		jtxtMaths = new JTextField();
		jtxtMaths.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		jtxtMaths.setColumns(10);
		jtxtMaths.setBounds(612, 21, 240, 35);
		panel.add(jtxtMaths);
		
		jtxtFirstname = new JTextField();
		jtxtFirstname.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		jtxtFirstname.setColumns(10);
		jtxtFirstname.setBounds(151, 57, 240, 35);
		panel.add(jtxtFirstname);
		
		jtxtSurname = new JTextField();
		jtxtSurname.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		jtxtSurname.setColumns(10);
		jtxtSurname.setBounds(151, 92, 240, 35);
		panel.add(jtxtSurname);
		
		JLabel lblEnglish = new JLabel("English:");
		lblEnglish.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblEnglish.setBounds(481, 64, 109, 28);
		panel.add(lblEnglish);
		
		JLabel lblBiology = new JLabel("Biology:");
		lblBiology.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblBiology.setBounds(481, 99, 109, 28);
		panel.add(lblBiology);
		
		JLabel lblComputing = new JLabel("Computing:");
		lblComputing.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblComputing.setBounds(481, 137, 109, 28);
		panel.add(lblComputing);
		
		JLabel lblChemistry = new JLabel("Chemistry:");
		lblChemistry.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblChemistry.setBounds(481, 174, 109, 28);
		panel.add(lblChemistry);
		
		JLabel lblPhysics = new JLabel("Physics:");
		lblPhysics.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblPhysics.setBounds(481, 208, 109, 28);
		panel.add(lblPhysics);
		
		JLabel lblAddMaths = new JLabel("Add Maths:");
		lblAddMaths.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblAddMaths.setBounds(481, 248, 109, 28);
		panel.add(lblAddMaths);
		
		JLabel lblBusiness = new JLabel("Business:");
		lblBusiness.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblBusiness.setBounds(481, 284, 109, 28);
		panel.add(lblBusiness);
		
		JLabel lblTotalScore = new JLabel("Total Score:");
		lblTotalScore.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblTotalScore.setBounds(481, 321, 109, 28);
		panel.add(lblTotalScore);
		
		JLabel lblAverage = new JLabel("Average:");
		lblAverage.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblAverage.setBounds(481, 358, 109, 28);
		panel.add(lblAverage);
		
		JLabel lblRanking = new JLabel("Ranking");
		lblRanking.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblRanking.setBounds(481, 394, 109, 28);
		panel.add(lblRanking);
		
		JLabel lblStudentId = new JLabel("Student ID:");
		lblStudentId.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblStudentId.setBounds(32, 32, 109, 28);
		panel.add(lblStudentId);
		
		JLabel lblFirstname = new JLabel("Firstname:");
		lblFirstname.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblFirstname.setBounds(32, 64, 109, 28);
		panel.add(lblFirstname);
		
		jtxtExamNo = new JTextField();
		jtxtExamNo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		jtxtExamNo.setColumns(10);
		jtxtExamNo.setBounds(151, 164, 240, 35);
		panel.add(jtxtExamNo);
		
		jtxtDOB = new JTextField();
		jtxtDOB.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		jtxtDOB.setColumns(10);
		jtxtDOB.setBounds(151, 238, 240, 35);
		panel.add(jtxtDOB);
		
		JLabel lblSurname = new JLabel("Surname:");
		lblSurname.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblSurname.setBounds(32, 99, 109, 28);
		panel.add(lblSurname);
		
		JLabel lblCourseCode = new JLabel("Course Code:");
		lblCourseCode.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblCourseCode.setBounds(21, 137, 120, 28);
		panel.add(lblCourseCode);
		
		JLabel lblExamNo = new JLabel("Exam No:");
		lblExamNo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblExamNo.setBounds(32, 174, 109, 28);
		panel.add(lblExamNo);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblGender.setBounds(32, 211, 109, 28);
		panel.add(lblGender);
		
		JLabel lblDob = new JLabel("D.O.B");
		lblDob.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblDob.setBounds(32, 248, 109, 28);
		panel.add(lblDob);
		
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblAddress.setBounds(32, 284, 109, 28);
		panel.add(lblAddress);
		
		JTextArea jtxtAddress = new JTextArea();
		jtxtAddress.setFont(new Font("Monospaced", Font.BOLD, 18));
		jtxtAddress.setBounds(151, 279, 240, 140);
		panel.add(jtxtAddress);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "04845", "14845", "24845", "34845"}));
		comboBox.setBounds(151, 127, 238, 35);
		panel.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"", "Female", "Male"}));
		comboBox_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		comboBox_1.setBounds(151, 201, 238, 35);
		panel.add(comboBox_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(95, 158, 160), 12));
		panel_1.setBackground(new Color(176, 224, 230));
		panel_1.setBounds(950, 11, 410, 441);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JTextArea jtxtTranscript = new JTextArea();
		jtxtTranscript.setFont(new Font("Monospaced", Font.PLAIN, 16));
		jtxtTranscript.setBounds(21, 17, 367, 402);
		panel_1.add(jtxtTranscript);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(95, 158, 160), 12));
		panel_2.setBackground(new Color(176, 224, 230));
		panel_2.setBounds(10, 463, 1350, 87);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnResult = new JButton("Result");
		btnResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double[] R = new double[14];
				R[0] = Double.parseDouble(jtxtMaths.getText());
				R[1] = Double.parseDouble(jtxtEng.getText());
				R[2] = Double.parseDouble(jtxtBio.getText());
				R[3] = Double.parseDouble(jtxtCom.getText());
				R[4] = Double.parseDouble(jtxtChem.getText());
				R[5] = Double.parseDouble(jtxtPhy.getText());
				R[6] = Double.parseDouble(jtxtAddM.getText());
				R[7] = Double.parseDouble(jtxtBus.getText());
				
				R[8] = (R[0] + R[1] + R[2]+ R[3]+ R[4]+ R[5]+ R[6]+ R[7])/8;
				R[9] = (R[0] + R[1] + R[2]+ R[3]+ R[4]+ R[5]+ R[6]+ R[7]);
				
				String Average = String.format("%.0f", R[8]);
				jtxtAverage.setText(Average);
				
				String TotalScore = String.format("%.0f", R[9]);
				jtxtTotalScore.setText(TotalScore); 
				
				//===================Ranking===========================
				
				if (R[9] >=700) 
				{
				jtxtRanking.setText("1st Class");		
				}
				
				else if (R[9] >=600) 
				{
				jtxtRanking.setText("2nd class upper");		
				}
				
				else if (R[9] >=500) 
				{
				jtxtRanking.setText("2nd Class lower");		
				}
				
				else if (R[9] >=400) 
				{
				jtxtRanking.setText("3rd Class upper");		
				}
				
				else if (R[9] >=300) 
				{
				jtxtRanking.setText("3rd class lower");		
				}
				
				else if (R[9] >=200) 
				{
				jtxtRanking.setText("Fail");		
				}
				
				//===================Less than 100===========================
				
				if (R[0] > 100)
				{
					jtxtMaths.setText("");
					jtxtMaths.requestFocus();
					jtxtAverage.setText("");
					jtxtTotalScore.setText("");
					jtxtRanking.setText("");
					
				}
				
				if (R[1] > 100)
				{
					jtxtEng.setText("");
					jtxtEng.requestFocus();
					jtxtAverage.setText("");
					jtxtTotalScore.setText("");
					jtxtRanking.setText("");
					
				}
				
				if (R[2] > 100)
				{
					jtxtBio.setText("");
					jtxtBio.requestFocus();
					jtxtAverage.setText("");
					jtxtTotalScore.setText("");
					jtxtRanking.setText("");
					
				}
				
				if (R[3] > 100)
				{
					jtxtCom.setText("");
					jtxtCom.requestFocus();
					jtxtAverage.setText("");
					jtxtTotalScore.setText("");
					jtxtRanking.setText("");
					
				}
				
				if (R[4] > 100)
				{
					jtxtChem.setText("");
					jtxtChem.requestFocus();
					jtxtAverage.setText("");
					jtxtTotalScore.setText("");
					jtxtRanking.setText("");
					
				}
				
				if (R[5] > 100)
				{
					jtxtPhy.setText("");
					jtxtPhy.requestFocus();
					jtxtAverage.setText("");
					jtxtTotalScore.setText("");
					jtxtRanking.setText("");
					
				}
				
				if (R[6] > 100)
				{
					jtxtAddM.setText("");
					jtxtAddM.requestFocus();
					jtxtAverage.setText("");
					jtxtTotalScore.setText("");
					jtxtRanking.setText("");
					
				}
				
				if (R[7] > 100)
				{
					jtxtBus.setText("");
					jtxtBus.requestFocus();
					jtxtAverage.setText("");
					jtxtTotalScore.setText("");
					jtxtRanking.setText("");
					
				}
				
			}
		});
		btnResult.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		btnResult.setBounds(42, 22, 209, 43);
		panel_2.add(btnResult);
		
		JButton btnTranscript = new JButton("Transcript");
		btnTranscript.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				jtxtTranscript.setText("");
				jtxtTranscript.append("Student Result Recording System\n"
				+"===================================\n"
				+"Student ID:\t\t" + jtxtStudentID.getText()
				+"\nFirstname:\t\t" + jtxtFirstname.getText()
				+"\nSurname:\t\t" + jtxtSurname.getText()
				+"\nMaths:\t\t\t" + jtxtMaths.getText()
				+"\nEnglish:\t\t" + jtxtEng.getText()
				+"\nBiology:\t\t" + jtxtBio.getText()
				+"\nComputing:\t\t" + jtxtCom.getText()
				+"\nChemistry:\t\t" + jtxtChem.getText()
				+"\nPhysics:\t\t" + jtxtPhy.getText()
				+"\nAdd Maths:\t\t" + jtxtAddM.getText()
				+"\nBusiness:\t\t" + jtxtBus.getText()
				+"\n================================"
				+"\nTotal Score:\t\t" + jtxtTotalScore.getText()
				+"\nAverage:\t\t" + jtxtAverage.getText()
				+"\nRanking:\t\t" + jtxtRanking.getText()+"\n");
				
				
			}
		});
		btnTranscript.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		btnTranscript.setBounds(295, 22, 209, 43);
		panel_2.add(btnTranscript);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				MessageFormat header = new MessageFormat("Printing in progress");
				MessageFormat footer = new MessageFormat("Page {0, number,integer}");
				
				try
				{
					jtxtTranscript.print();
				}
				catch(java.awt.print.PrinterException ev) {
					System.err.format("No Printer found", ev.getMessage());
				}
				
				
			}
		});
		btnPrint.setBounds(558, 22, 209, 43);
		panel_2.add(btnPrint);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				frame = new JFrame("Exit");
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Student Result System",
					JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION) {
				System.exit(0);	
			}
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		btnExit.setBounds(1095, 22, 209, 43);
		panel_2.add(btnExit);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JTextField temp=null;
				   for(Component c:panel.getComponents()) {
					   if(c.getClass().toString().contains("javax.swing.JTextField")) {
						   temp=(JTextField)c;
						   temp.setText(null);
					   }
				   }
				   jtxtTranscript.setText(null);
				   jtxtAddress.setText(null);
				   
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		btnReset.setBounds(828, 22, 209, 43);
		panel_2.add(btnReset);
	}
}
