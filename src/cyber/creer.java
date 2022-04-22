package cyber;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

//import Ges.DButil;
//import Ges.Student;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class creer extends JFrame {
	
	private JFrame frame;

	private JPanel contentPane;
	private JTextField textField_nom;
	private JTextField textField_prenom;
	private JTextField textField_fonction;
	private JTextField textField_login;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					creer frame = new creer();
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
	public creer() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 490);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("nom:");
		lblNewLabel.setBounds(31, 69, 81, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("prenom:");
		lblNewLabel_1.setBounds(31, 115, 45, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("fonction:");
		lblNewLabel_2.setBounds(31, 174, 45, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("login:");
		lblNewLabel_3.setBounds(31, 222, 45, 13);
		contentPane.add(lblNewLabel_3);
		
		textField_nom = new JTextField();
		textField_nom.setBounds(172, 66, 96, 19);
		contentPane.add(textField_nom);
		textField_nom.setColumns(10);
		
		textField_prenom = new JTextField();
		textField_prenom.setBounds(172, 112, 96, 19);
		contentPane.add(textField_prenom);
		textField_prenom.setColumns(10);
		
		textField_fonction = new JTextField();
		textField_fonction.setBounds(172, 171, 96, 19);
		contentPane.add(textField_fonction);
		textField_fonction.setColumns(10);
		
		textField_login = new JTextField();
		textField_login.setBounds(172, 219, 96, 19);
		contentPane.add(textField_login);
		textField_login.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("password:");
		lblNewLabel_4.setBounds(31, 268, 66, 13);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Creation de compte utilisateur");
		lblNewLabel_5.setBounds(277, 21, 138, 13);
		contentPane.add(lblNewLabel_5);
		
		JButton btn_creer = new JButton("Creer");
		btn_creer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nom = textField_nom.getText();
				String prenom = textField_prenom.getText();
				String fonction = textField_fonction.getText();
				String login = textField_login.getText();
				String password = passwordField.getText();
				String password1 = passwordField_1.getText();
				
				
				
				if (textField_nom.getText().isEmpty()){ 
					JOptionPane.showMessageDialog(null,"le nom ne doit pas etre vide","Erreur ", JOptionPane.WARNING_MESSAGE); // Empeche les zone de saisie d'etre vide
					
					
					if (textField_prenom.getText().isEmpty()){
						JOptionPane.showMessageDialog(null,"le prenom ne doit pas etre vide","Erreur ", JOptionPane.WARNING_MESSAGE); // Empeche les zone de saisie d'etre vide
						
						
						if (textField_fonction.getText().isEmpty()){
							JOptionPane.showMessageDialog(null,"la fonction ne doit pas etre vide","Erreur", JOptionPane.WARNING_MESSAGE); // Empeche les zone de saisie d'etre vide
							
							if (textField_login.getText().isEmpty()){
								JOptionPane.showMessageDialog(null,"le login ne doit pas etre vide","Erreur ", JOptionPane.WARNING_MESSAGE); // Empeche les zone de saisie d'etre vide
							

								if (passwordField.getText().isEmpty()){
									JOptionPane.showMessageDialog(null,"la password ne doit pas etre vide","Erreur", JOptionPane.WARNING_MESSAGE); // Empeche les zone de saisie d'etre vide
									
									if (passwordField_1.getText().isEmpty()){
										JOptionPane.showMessageDialog(null,"le password ne doit pas etre vide","Erreur ", JOptionPane.WARNING_MESSAGE); // Empeche les zone de saisie d'etre vide
									
							
				
				
									
									}
									
								}
		
		
							
							}
							
						}
					
					}
		}	
				
				
				
				
				
				
				
				
				
				
				
                // First field 
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

// The password is valid
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		

                                                   // second password field
// for checking if password length
// is between 8 and 15
if (!((password1.length() >= 12))) {

JOptionPane.showMessageDialog(null,"Le mot de passe doit contenir plus de 12 caracthere","Alert",JOptionPane.WARNING_MESSAGE);
//  throw new InvalidPasswordException(1);
}

// to check space
if (password1.contains(" ")) {
// throw new InvalidPasswordException(2);

JOptionPane.showMessageDialog(null,"Le mot de passe doit pas contenir d'espace","Alert",JOptionPane.WARNING_MESSAGE);


}

if (true) {
int count = 0;

// check digits from 0 to 9
for (int i = 0; i <= 9; i++) {

// to convert int to string
String str2 = Integer.toString(i);

if (password.contains(str2)) {
count = 1;
}
}
if (count == 0) {
//  throw new InvalidPasswordException(3);

JOptionPane.showMessageDialog(null,"Le mot de passe doit un chiffre","Alert",JOptionPane.WARNING_MESSAGE);

}
}

// for special characters
if (!(password1.contains("@") || password1.contains("#")
|| password1.contains("!") || password1.contains("~")
|| password1.contains("$") || password1.contains("%")
|| password1.contains("^") || password1.contains("&")
|| password1.contains("*") || password1.contains("(")
|| password1.contains(")") || password1.contains("-")
|| password1.contains("+") || password1.contains("/")
|| password1.contains(":") || password1.contains(".")
|| password1.contains(", ") || password1.contains("<")
|| password1.contains(">") || password1.contains("?")
|| password1.contains("|"))) {
// throw new InvalidPasswordException(4);

JOptionPane.showMessageDialog(null,"Le mot de passe doit contenir un caracthere special","Alert",JOptionPane.WARNING_MESSAGE);

}

if (true) {
int count = 0;

// checking capital letters
for (int i = 65; i <= 90; i++) {

// type casting
char c = (char)i;

String str2 = Character.toString(c);
if (password1.contains(str2)) {
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
String str2 = Character.toString(c);

if (password1.contains(str2)) {
count = 1;
}
}
if (count == 0) {
//  throw new InvalidPasswordException(6);

JOptionPane.showMessageDialog(null,"Le mot de passe doit contenir une lettre minuscule ","Alert",JOptionPane.WARNING_MESSAGE);

}
}

// The password is valid

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



{   //****
	
	
 
	if (password == password1)	
{     		                                                      // test password = Totobtssio2022!    // passwordField.getText() == passwordField_1.getText()
JOptionPane.showMessageDialog(null,"Les mots de passe sont indentiques ","Alert",JOptionPane.WARNING_MESSAGE);

authentification authen = new authentification();                                     // Comparé les 2 mot de passe mais il y a une erreur 
authen.setVisible(true);

}

   
	else{

JOptionPane.showMessageDialog(null,"Les mots de passe ne sont pas identiques ","Erreur",JOptionPane.WARNING_MESSAGE);
}
}     //*****







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
  
        
       ///// control pour nom ////////
        
        if (true) {
        	int count = 0;

        	// checking capital letters
        	for (int i = 65; i <= 90; i++) {

        	// type casting
        	char c = (char)i;

        	String str2 = Character.toString(c);
        	if (nom.contains(str2.substring(0,1))) {
        	count = 1;
        	}
        	}
        	if (count == 0) {
        	//  throw new InvalidPasswordException(5);
        		
        		JOptionPane.showMessageDialog(null,"Le nom doit avoir une majuscule a la premier lettre ","Alert",JOptionPane.WARNING_MESSAGE);

        	}
        	}

        
        
        if ((nom.contains("@") || nom.contains("#")
	              || nom.contains("!") || nom.contains("~")
	              || nom.contains("$") || nom.contains("%")
	              || nom.contains("^") || nom.contains("&")
	              || nom.contains("*") || nom.contains("(")
	              || nom.contains(")") || nom.contains("-")
	              || nom.contains("+") || nom.contains("/")
	              || nom.contains(":") || nom.contains(".")
	              || nom.contains(", ") || nom.contains("<")
	              || nom.contains(">") || nom.contains("?")
	              || nom.contains("|"))) {
	            // throw new InvalidPasswordException(4);
	        	
	        	JOptionPane.showMessageDialog(null,"Le nom ne doit pas contenir de caracthere speciaux","Alert",JOptionPane.WARNING_MESSAGE);

	        }     
        
        
        
        if ((nom.contains("1") || nom.contains("2")
	              || nom.contains("3") || nom.contains("4")
	              || nom.contains("5") || nom.contains("6")
	              || nom.contains("7") || nom.contains("8")
	              || nom.contains("9") || nom.contains("0"))) {
	            // throw new InvalidPasswordException(4);
	        	
	        	JOptionPane.showMessageDialog(null,"Le nom ne doit pas contenir des chiffre","Alert",JOptionPane.WARNING_MESSAGE);

	        }     
        
        
        
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        
        
        
        
        
      ////////////////////////////////////// control pour prenom //////////////////////////////////////////////
        
        
        
        

        if (true) {
        	int count = 0;

        	// checking capital letters
        	for (int i = 65; i <= 90; i++) {

        	// type casting
        	char c = (char)i;

        	String str2 = Character.toString(c);
        	if (prenom.contains(str2.substring(0,1))) {
        	count = 1;
        	}
        	}
        	if (count == 0) {
        	//  throw new InvalidPasswordException(5);
        		
        		JOptionPane.showMessageDialog(null,"Le prenom doit avoir une majuscule a la premier lettre ","Alert",JOptionPane.WARNING_MESSAGE);

        	}
        	}
        
        
        if ((prenom.contains("@") || prenom.contains("#")
	              || prenom.contains("!") || prenom.contains("~")
	              || prenom.contains("$") || prenom.contains("%")
	              || prenom.contains("^") || prenom.contains("&")
	              || prenom.contains("*") || prenom.contains("(")
	              || prenom.contains(")") || prenom.contains("-")
	              || prenom.contains("+") || prenom.contains("/")
	              || prenom.contains(":") || prenom.contains(".")
	              || prenom.contains(", ") || prenom.contains("<")
	              || prenom.contains(">") || prenom.contains("?")
	              || prenom.contains("|"))) {
	            // throw new InvalidPasswordException(4);
	        	
	        	JOptionPane.showMessageDialog(null,"Le prenom ne doit pas contenir de caracthere speciaux","Alert",JOptionPane.WARNING_MESSAGE);

	        }     
        
        
        
        if ((prenom.contains("1") || prenom.contains("2")
	              || prenom.contains("3") || prenom.contains("4")
	              || prenom.contains("5") || prenom.contains("6")
	              || prenom.contains("7") || prenom.contains("8")
	              || prenom.contains("9") || prenom.contains("0"))) {
	            // throw new InvalidPasswordException(4);
	        	
	        	JOptionPane.showMessageDialog(null,"Le prenom ne doit pas contenir des chiffre","Alert",JOptionPane.WARNING_MESSAGE);

	        }     
        
        
        

		JOptionPane.showMessageDialog(null,"Les données sont entrés dans la base de donné MySQL.", "Reussie", JOptionPane.WARNING_MESSAGE);
		
	
		
		User util = new User(nom,prenom,fonction,login,password);
		
		try {
			Data.addUser(util);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			
			JOptionPane.showMessageDialog(null,"Reussie", "Les données sont entrés dans la base de donné MySQL.", JOptionPane.WARNING_MESSAGE);
			
		}
	
  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////      
        
        
        
        
        
        
        	
				
			}
		});
		btn_creer.setBounds(529, 380, 85, 21);
		contentPane.add(btn_creer);
		
		JButton btn_quitter = new JButton("Quitter");
		btn_quitter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame = new JFrame("Quitter");
				if(JOptionPane.showConfirmDialog(frame, "Voulez-vous sortir de l'application?","Crytosoft",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION); // affiche un message de sorti
				{
					System.exit(0);
				}	
			}
		});
		btn_quitter.setBounds(529, 422, 85, 21);
		contentPane.add(btn_quitter);
		
		JLabel lblNewLabel_6 = new JLabel("ressaisir password:");
		lblNewLabel_6.setBounds(31, 315, 96, 13);
		contentPane.add(lblNewLabel_6);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(172, 265, 96, 19);
		contentPane.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(172, 312, 96, 19);
		contentPane.add(passwordField_1);
		
		JLabel lblNewLabel_7 = new JLabel("cl\u00E9 publik (pk):");
		lblNewLabel_7.setBounds(31, 360, 81, 13);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setBounds(171, 360, 97, 13);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("cl\u00E9 secrete (sk):");
		lblNewLabel_9.setBounds(31, 384, 81, 13);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("New label");
		lblNewLabel_10.setBounds(165, 384, 119, 13);
		contentPane.add(lblNewLabel_10);
	}

}
