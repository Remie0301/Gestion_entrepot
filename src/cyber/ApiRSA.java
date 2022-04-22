package cyber;

import java.nio.charset.Charset;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.util.Base64;




public class ApiRSA {

	/**
	 * @param args
	 */
	

	private final static Charset UTF8 = Charset.forName("UTF-8"); // encodage caract�re
	
	/**
	 * G�n�re une paire de cl�s (PK, SK) de 1024 bits pour l'algorithme RSA
	 * son appel dans une autre classe se fait par ApiRSA.generateKeyPair()
	 * @return : la paire de cl� publique et priv�
	 * @throws Exception: si tamtam
	 */
	
	public static KeyPair generateKeyPair() throws Exception {
	    
		KeyPairGenerator generator = KeyPairGenerator.getInstance("RSA"); 
	    
		generator.initialize(1024, new SecureRandom());
	    
		KeyPair rsaKey = generator.generateKeyPair(); // la pair de cl� (PK, SK) est g�n�ree

	    return rsaKey;
	}
	
	/**
	 * Cette m�thode effectue un hash sur une chaine et la signe avec une cl� priv�e SK
	 * son appel dans une autre classe se fait par ApiRSA.sign(..)
	 * @param texteClair : le texte � signer
	 * @param priveSK  : la cl� priv�e SK qui doit au pr�alable �tre g�n�r�
	 * @return : retourne la signature sous forme de chaine
	 * @throws Exception: si tamtam
	 */
	
	public static String sign(String texteClair, PrivateKey priveSK) throws Exception {
		
		// utilise le hash SHA256 et signe en m�me temps
	    Signature privateSignature = Signature.getInstance("SHA256withRSA");
	    
	    privateSignature.initSign(priveSK); // initialise la cl� priv�e SK
	    
	    privateSignature.update(texteClair.getBytes(UTF8));

	    byte[] signature = privateSignature.sign(); // r�cup�re la signature sous forme d'octets

	    return Base64.getEncoder().encodeToString(signature); //retourne la signature au format chaine
	}
	
	
	/**
	 * Cette m�thode v�rifie qu'un text clair n'a pas �t� modifi� apr�s avoir �t� sign�
	 * son appel dans une autre classe se fait par ApiRSA.verify(..)
	 * @param texteClair: le texte � v�rifier
	 * @param signature : la signature du tecte calcul� pr�c�demment
	 * @param publicPK  : la cl� publique PK de l'auteur
	 * @return			: retourn vrai si c'est bon
	 * @throws Exception: si tamtam
	 */
		
	public static boolean verify(String texteClair, String signature, PublicKey publicPK) throws Exception {
		
	    Signature publicSignature = Signature.getInstance("SHA256withRSA"); // re-hash le text clair
	    
	    publicSignature.initVerify(publicPK);
	    
	    publicSignature.update(texteClair.getBytes(UTF8)); // re-signe pour obtenir la signature candidate

	    byte[] signatureOctets = Base64.getDecoder().decode(signature); //encode en octet la signature candidate

	    return publicSignature.verify(signatureOctets);  // v�rifie les 2 signatures et retourne vrai si ok
	}
	
}
