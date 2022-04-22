package cyber;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class authentification extends JFrame {
	
	private JFrame frame;

	private JPanel contentPane;
	private JTextField textField_login;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					authentification frame = new authentification();
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
	public authentification() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 594, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Authentification");
		lblNewLabel.setBounds(242, 29, 131, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Veuillez entrer votre login:");
		lblNewLabel_1.setBounds(46, 135, 137, 13);
		contentPane.add(lblNewLabel_1);
		
		JButton btn_Authen = new JButton("Authentifier");
		btn_Authen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//frame.dispose();
				//uploadFichier upFiche = new uploadFichier();
				//upFiche.setVisible(true);
				
				
				
				String login = textField_login.getText();
				String password = passwordField.getText();
				
				
				
				
				if (textField_login.getText().isEmpty()){
					JOptionPane.showMessageDialog(null,"le login ne doit pas etre vide","Erreur ", JOptionPane.WARNING_MESSAGE); // Empeche les zone de saisie d'etre vide
				

					if (passwordField.getText().isEmpty()){
						JOptionPane.showMessageDialog(null,"la password ne doit pas etre vide","Erreur", JOptionPane.WARNING_MESSAGE); // Empeche les zone de saisie d'etre vide
						
						
						
					}


				
				}
				
				
				
				
				
				
				
				
				
///////////////////////////////////////////////////////  login   ////////////////////////////////////////////////////////
		        
if (true) {
int count = 0;

// checking small letters
for (int i = 65; i <= 90; i++) {

// type casting
char c = (char)i;
String str1 = Character.toString(c);

if (login.contains(str1)) {
count = 1;

JOptionPane.showMessageDialog(null,"Le login doit contenir seulment des lettres minuscule ","Alert",JOptionPane.WARNING_MESSAGE);
}
}

}
				
				
				 // for checking if password length
		        // is between 8 and 15
		        if (!((password.length() >= 12))) {
		        	
		        	JOptionPane.showMessageDialog(null,"Le mot de passe doit contenir plus de 12 caracthere","Alert",JOptionPane.WARNING_MESSAGE);
		          //  throw new InvalidPasswordException(1);
		        }
		  
		        // to check space
		        if (password.contains(" ")) {
		            // throw new InvalidPasswordException(2);
		        	
		        	JOptionPane.showMessageDialog(null,"Le mot de passe doit pas contenir d'espace","Alert",JOptionPane.WARNING_MESSAGE);

		            
		        }
		        if (true) {
		            int count = 0;
		  
		            // check digits from 0 to 9
		            for (int i = 0; i <= 9; i++) {
		  
		                // to convert int to string
		                String str1 = Integer.toString(i);
		  
		                if (password.contains(str1)) {
		                    count = 1;
		                }
		            }
		            if (count == 0) {
		              //  throw new InvalidPasswordException(3);
		            	
			        	JOptionPane.showMessageDialog(null,"Le mot de passe doit un chiffre","Alert",JOptionPane.WARNING_MESSAGE);

		            }
		        }
		  
		        // for special characters
		        if (!(password.contains("@") || password.contains("#")
		              || password.contains("!") || password.contains("~")
		              || password.contains("$") || password.contains("%")
		              || password.contains("^") || password.contains("&")
		              || password.contains("*") || password.contains("(")
		              || password.contains(")") || password.contains("-")
		              || password.contains("+") || password.contains("/")
		              || password.contains(":") || password.contains(".")
		              || password.contains(", ") || password.contains("<")
		              || password.contains(">") || password.contains("?")
		              || password.contains("|"))) {
		            // throw new InvalidPasswordException(4);
		        	
		        	JOptionPane.showMessageDialog(null,"Le mot de passe doit contenir un caracthere special","Alert",JOptionPane.WARNING_MESSAGE);

		        }
		  
		        if (true) {
		            int count = 0;
		  
		            // checking capital letters
		            for (int i = 65; i <= 90; i++) {
		  
		                // type casting
		                char c = (char)i;
		  
		                String str1 = Character.toString(c);
		                if (password.contains(str1)) {
		                    count = 1;
		                }
		            }
		            if (count == 0) {
		              //  throw new InvalidPasswordException(5);
		            	
			        	JOptionPane.showMessageDialog(null,"Le mot de passe doit contenir une lettre Capital","Alert",JOptionPane.WARNING_MESSAGE);

		            }
		        }
		  
		        if (true) {
		            int count = 0;
		  
		            // checking small letters
		            for (int i = 90; i <= 122; i++) {
		  
		                // type casting
		                char c = (char)i;
		                String str1 = Character.toString(c);
		  
		                if (password.contains(str1)) {
		                    count = 1;
		                }
		            }
		            if (count == 0) {
		              //  throw new InvalidPasswordException(6);
		            	
			        	JOptionPane.showMessageDialog(null,"Le mot de passe doit contenir une lettre minuscule ","Alert",JOptionPane.WARNING_MESSAGE);

		            }
		        }
		        
		        
		        boolean check = false;
				if(check){
		  
		        // The password is valid
				
		    	String prenom = null;
				String fonction = null;
				String nom = null;
				
				User util = new User(nom,prenom,fonction,login,password);          //(nom,prenom,fonction,login,password);     // HelloWorld123%
				
				try {
					Data.CheckUser(util);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					
					JOptionPane.showMessageDialog(null,"Reussie", "L'utilisateur s'est authentifié.", JOptionPane.WARNING_MESSAGE);
					
				}
		        
		        
		      //  frame.dispose();
				uploadFichier upFiche = new uploadFichier();    // erreur since if password incorrect changes pages // reivew
				upFiche.setVisible(true);
			
		  
				
		        } else {
            JOptionPane.showMessageDialog(null,"Echec", "Erreur dans le mot de passe ou login", JOptionPane.WARNING_MESSAGE);
					
				}
			
				
				
				
	}
		});
		btn_Authen.setBounds(447, 309, 85, 21);
		contentPane.add(btn_Authen);
		
		textField_login = new JTextField();
		textField_login.setBounds(231, 132, 96, 19);
		contentPane.add(textField_login);
		textField_login.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Veuillez entrer votre mot de passe:");
		lblNewLabel_2.setBounds(46, 206, 178, 13);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton_1 = new JButton("Quitter");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame = new JFrame("Quitter");
				if(JOptionPane.showConfirmDialog(frame, "Voulez-vous sortir de l'application?","Crytosoft",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION); // affiche un message de sorti
				{
					System.exit(0);
				}	
			}
		});
		btnNewButton_1.setBounds(447, 351, 85, 21);
		contentPane.add(btnNewButton_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(229, 206, 98, 19);
		contentPane.add(passwordField);
	}
}
