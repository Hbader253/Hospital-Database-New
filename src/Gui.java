import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;
import javax.swing.JCheckBox;

public class Gui {

	private JFrame frame;
	private JTextField txtFirstName;
	private JTextField txtMiddleName;
	private JTextField txtLastName;
	private JTextField txtBloodType;
	private JTextField txtPatientID;
	private JFormattedTextField txtPatientInfo;
	private JTextField txtInsurance;
	private JTextField txtAllergies;
	private JTextField txtDOA;
	private JTextField txtPhys;
	private JTextField txtConditions;
	private JCheckBox chckbxFemale;
	private JCheckBox chckbxMale;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui window = new Gui();
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
	public Gui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 640, 440);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 635, 420);
		frame.getContentPane().add(tabbedPane);
		
		JPanel tbMain = new JPanel();
		tbMain.setBackground(Color.WHITE);
		tabbedPane.addTab("Main", null, tbMain, null);
		tbMain.setLayout(null);
		
		JLabel lblFirstName = new JLabel("First Name: ");
		lblFirstName.setBounds(6, 20, 76, 16);
		tbMain.add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name: ");
		lblLastName.setBounds(416, 20, 78, 16);
		tbMain.add(lblLastName);
		
		JLabel lblMiddleName = new JLabel("Middle Name: ");
		lblMiddleName.setBounds(197, 20, 90, 16);
		tbMain.add(lblMiddleName);
		
		txtFirstName = new JTextField();
		txtFirstName.setBounds(79, 15, 111, 26);
		tbMain.add(txtFirstName);
		txtFirstName.setColumns(10);
		
		txtMiddleName = new JTextField();
		txtMiddleName.setColumns(10);
		txtMiddleName.setBounds(284, 15, 120, 26);
		tbMain.add(txtMiddleName);
		
		txtLastName = new JTextField();
		txtLastName.setColumns(10);
		txtLastName.setBounds(488, 15, 120, 26);
		tbMain.add(txtLastName);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = txtFirstName.getText();
				String b = txtMiddleName.getText();
				String c = txtLastName.getText();
				
				clearText();
			
				txtPatientInfo.setText("Patient : " + a + " " +  b +  " "  + c);
				
				//TODO bring up patient info from patientregister and display on the patient tab
			}
		});
		btnSearch.setBounds(198, 323, 117, 29);
		tbMain.add(btnSearch);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				clearText();
				txtPatientInfo.setText("added patient");
				//TODO add new patient to patientregister and display info on patient tab
			}
		});
		btnAdd.setBounds(307, 323, 117, 29);
		tbMain.add(btnAdd);
		
		JLabel lblBloodType = new JLabel("Blood Type: ");
		lblBloodType.setBounds(36, 127, 78, 16);
		tbMain.add(lblBloodType);
		
		JLabel lblPatientId = new JLabel("Patient ID: ");
		lblPatientId.setBounds(416, 73, 78, 16);
		tbMain.add(lblPatientId);
		
		txtBloodType = new JTextField();
		txtBloodType.setBounds(110, 122, 130, 26);
		tbMain.add(txtBloodType);
		txtBloodType.setColumns(10);
		
		txtPatientID = new JTextField();
		txtPatientID.setBounds(488, 68, 120, 26);
		tbMain.add(txtPatientID);
		txtPatientID.setColumns(10);
		
		JLabel lblInsurance = new JLabel("Insurance:");
		lblInsurance.setBounds(36, 195, 78, 16);
		tbMain.add(lblInsurance);
		
		txtInsurance = new JTextField();
		txtInsurance.setBounds(110, 190, 130, 26);
		tbMain.add(txtInsurance);
		txtInsurance.setColumns(10);
		
		JLabel lblAllergies = new JLabel("Allergies: ");
		lblAllergies.setBounds(303, 127, 75, 16);
		tbMain.add(lblAllergies);
		
		txtAllergies = new JTextField();
		txtAllergies.setBounds(378, 122, 137, 26);
		tbMain.add(txtAllergies);
		txtAllergies.setColumns(10);
		
		JLabel lblSex = new JLabel("Sex: ");
		lblSex.setBounds(6, 73, 61, 16);
		tbMain.add(lblSex);
		
		JLabel lblDoa = new JLabel("DOA: ");
		lblDoa.setBounds(197, 73, 43, 16);
		tbMain.add(lblDoa);
		
		JLabel lblPhys = new JLabel("Physician: ");
		lblPhys.setBounds(303, 195, 67, 16);
		tbMain.add(lblPhys);
		
		JLabel lblConditions = new JLabel("Conditions: ");
		lblConditions.setBounds(36, 250, 78, 16);
		tbMain.add(lblConditions);
		
		chckbxMale = new JCheckBox("Male");
		chckbxMale.setBounds(30, 69, 67, 23);
		tbMain.add(chckbxMale);
		
		chckbxFemale = new JCheckBox("Female");
		chckbxFemale.setBounds(90, 69, 76, 23);
		tbMain.add(chckbxFemale);
		
		txtDOA = new JTextField();
		txtDOA.setBounds(284, 68, 120, 26);
		tbMain.add(txtDOA);
		txtDOA.setColumns(10);
		
		txtPhys = new JTextField();
		txtPhys.setBounds(378, 190, 137, 26);
		tbMain.add(txtPhys);
		txtPhys.setColumns(10);
		
		txtConditions = new JTextField();
		txtConditions.setBounds(110, 245, 405, 26);
		tbMain.add(txtConditions);
		txtConditions.setColumns(10);
		tabbedPane.setEnabledAt(0, true);
		
		JPanel tbPatient = new JPanel();
		tbPatient.setBackground(Color.WHITE);
		tabbedPane.addTab("Patient", null, tbPatient, null);
		tbPatient.setLayout(null);
		
		txtPatientInfo = new JFormattedTextField();
		txtPatientInfo.setEditable(false);
		txtPatientInfo.setBounds(6, 16, 586, 338);
		tbPatient.add(txtPatientInfo);
		tabbedPane.setEnabledAt(1, true);
	}
	
	private void clearText() {
		txtFirstName.setText("");
		txtMiddleName.setText("");
		txtLastName.setText("");
		txtBloodType.setText("");
		txtPatientID.setText("");
		txtInsurance.setText("");
		txtAllergies.setText("");
		txtInsurance.setText("");
		txtConditions.setText("");
		txtPhys.setText("");
		txtDOA.setText("");
		chckbxMale.setSelected(false);
		chckbxFemale.setSelected(false);
	}
}
