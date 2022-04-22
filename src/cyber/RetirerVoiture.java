package cyber;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Ges.DButil;
import Ges.Student;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class RetirerVoiture extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldId;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RetirerVoiture frame = new RetirerVoiture();
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
	public RetirerVoiture() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 638, 441);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Retirer voiture");
		lblNewLabel.setBounds(228, 20, 139, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Veuillez entrer l'id de la voiture:");
		lblNewLabel_1.setBounds(52, 102, 174, 13);
		contentPane.add(lblNewLabel_1);
		
		textFieldId = new JTextField();
		textFieldId.setBounds(271, 99, 96, 19);
		contentPane.add(textFieldId);
		textFieldId.setColumns(10);
		
		JButton btnNewButton = new JButton("Valider");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
	String Id = textFieldId.getText();
				
				Student etudiant = new Student();
				
				 etudiant.setIncid(Incid);
				 
				 JOptionPane.showMessageDialog(null,"Les données sont supprimés de la base de donné MySQL.", "Reussie", JOptionPane.WARNING_MESSAGE);
			
				 
				 

				 
				
				 
				 try {
						DButil.deleteStudent(etudiant);
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				
				
				
			}
		});
		btnNewButton.setBounds(457, 285, 85, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Retour");
		btnNewButton_1.setBounds(457, 332, 85, 21);
		contentPane.add(btnNewButton_1);
	}

}
