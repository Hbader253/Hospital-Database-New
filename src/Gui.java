import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Map;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;

public class Gui {

	private JFrame frame;
	private JTextField txtFirstName;
	private JTextField txtMiddleName;
	private JTextField txtLastName;
	private JTextField txtBloodType;
	private JTextField txtPatientID;
	private JTextField txtInsurance;
	private JTextField txtAllergies;
	private JTextField txtDOA;
	private JTextField txtPhys;
	private JTextField txtConditions;
	private JCheckBox chckbxFemale;
	private JCheckBox chckbxMale;
	private JTextField txtFname;
	private JTextField txtLname;
	private JTextField txtMname;
	private JTextField txtS;
	private JTextField txtdoa;
	private JTextField txtNumber;
	private JTextField txtBlood;
	private JTextField txtA;
	private JTextField txtI;
	private JTextField txtP;
	private JTextField txtc;

	//PatientRegister x = new PatientRegister(null);
	//HospitalDatabaseCSVFile y = new HospitalDatabaseCSVFile();

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
				
				String name = txtFirstName.getText();
				

				//	Map<Integer, Patient> register = x.getRegister();

				if(name.equals("Jeremy")) {
					txtFname.setText(txtFirstName.getText());
					txtLname.setText(txtLastName.getText());
					txtMname.setText(txtMiddleName.getText());
					txtS.setText("Male");
					txtNumber.setText("647");
					txtdoa.setText("10/5/1980");
					txtBlood.setText("O-positive");
					txtI.setText("Aflac");
					txtP.setText("Dr. Tucker Nipper");
					txtc.setText("Salmonella");
					
				} else if (name.equals("Ashley")) {
					txtFname.setText(txtFirstName.getText());
					txtLname.setText(txtLastName.getText());
					txtMname.setText(txtMiddleName.getText());
					txtS.setText("Female");
					txtNumber.setText("878");
					txtdoa.setText("1/23/2000");
					txtBlood.setText("A-positive");
					txtI.setText("MetLife");
					txtP.setText("Dr. Jasmin Krauser");
					txtc.setText("Diabetes");
					txtA.setText("Garlic");
				}

				

				clearText();
				//TODO bring up patient info from patientregister and display on the patient tab
			}
		});
		btnSearch.setBounds(198, 323, 117, 29);
		tbMain.add(btnSearch);

		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				txtc.setText("                                   New Patient Added");
				clearText();
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

		txtFname = new JTextField();
		txtFname.setEditable(false);
		txtFname.setBounds(31, 26, 130, 26);
		tbPatient.add(txtFname);
		txtFname.setColumns(10);

		txtLname = new JTextField();
		txtLname.setEditable(false);
		txtLname.setBounds(433, 26, 130, 26);
		tbPatient.add(txtLname);
		txtLname.setColumns(10);

		txtMname = new JTextField();
		txtMname.setEditable(false);
		txtMname.setBounds(230, 26, 130, 26);
		tbPatient.add(txtMname);
		txtMname.setColumns(10);

		txtS = new JTextField();
		txtS.setEditable(false);
		txtS.setBounds(31, 86, 130, 26);
		tbPatient.add(txtS);
		txtS.setColumns(10);

		txtdoa = new JTextField();
		txtdoa.setEditable(false);
		txtdoa.setBounds(230, 86, 130, 26);
		tbPatient.add(txtdoa);
		txtdoa.setColumns(10);

		txtNumber = new JTextField();
		txtNumber.setEditable(false);
		txtNumber.setBounds(433, 86, 130, 26);
		tbPatient.add(txtNumber);
		txtNumber.setColumns(10);

		txtBlood = new JTextField();
		txtBlood.setEditable(false);
		txtBlood.setBounds(88, 158, 130, 26);
		tbPatient.add(txtBlood);
		txtBlood.setColumns(10);

		txtA = new JTextField();
		txtA.setEditable(false);
		txtA.setBounds(355, 158, 130, 26);
		tbPatient.add(txtA);
		txtA.setColumns(10);

		txtI = new JTextField();
		txtI.setEditable(false);
		txtI.setBounds(88, 218, 130, 26);
		tbPatient.add(txtI);
		txtI.setColumns(10);

		txtP = new JTextField();
		txtP.setEditable(false);
		txtP.setBounds(355, 218, 130, 26);
		tbPatient.add(txtP);
		txtP.setColumns(10);

		txtc = new JTextField();
		txtc.setEditable(false);
		txtc.setBounds(88, 283, 397, 26);
		tbPatient.add(txtc);
		txtc.setColumns(10);
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
