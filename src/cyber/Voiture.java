package cyber;

public class Voiture {
	private String id_voiture;
	private String Marque;
	private String Mod�le;
	private String Couleur;
	private String Ann�e_de_production;
	private String Transmission;
	private String Type_de_carburant;
	private String Pays_de_provenance;
	private String Prix;
	private String Entrep�t;
	
	
	
	public Voiture() {
	}
	
	public Voiture(String Marque,String Mod�le, String Couleur,String Ann�e_de_production,String Transmission, String Type_de_carburant, String Pays_de_provenance, String Prix, String Entrep�t){
		this.Marque = Marque;
		this.Mod�le = Mod�le;
		this.Couleur = Couleur;
		this.Ann�e_de_production = Ann�e_de_production;
		this.Transmission = Transmission;
		this.Type_de_carburant = Type_de_carburant;
		this.Pays_de_provenance = Pays_de_provenance;
		this.Prix = Prix;
		this.Entrep�t = Entrep�t;
	}
	
	public String getid_voiture() {
		return id_voiture;
	}
	public void setid_voiture(String id_voiture) {
		this.id_voiture = id_voiture;
	}
	public String getMarque() {
		return Marque;
	}
	public void setMarque(String Marque) {
		this.Marque = Marque;
	}
	public String getMod�le() {
		return Mod�le;
	}
	public void setMod�le(String Mod�le) {
		this.Mod�le = Mod�le;
	}
	public String getCouleur() {
		return Couleur;
	}
	public void setCouleur(String Couleur) {
		this.Couleur = Couleur;
	}
	public String getAnn�e_de_production() {
		return Ann�e_de_production;
	}
	public void setAnn�e_de_production(String Ann�e_de_production) {
		this.Ann�e_de_production = Ann�e_de_production;
	}
	public String getTransmission() {
		return Transmission;
	}
	public void setTransmission(String Transmission) {
		this.Transmission = Transmission;
	}
	public String getType_de_carburant() {
		return Type_de_carburant;
	}
	public void setType_de_carburant(String Type_de_carburant) {
		this.Type_de_carburant = Type_de_carburant;
	}
	public String getPays_de_provenance() {
		return Pays_de_provenance;
	}
	public void setPays_de_provenance(String Pays_de_provenance) {
		this.Pays_de_provenance = Pays_de_provenance;
	}
	public String getPrix() {
		return Prix;
	}
	public void setPrix(String Prix) {
		this.Prix = Prix;
	}
	public String getEntrep�t() {
		return Entrep�t;
	}
	public void setEntrep�t(String Entrep�t) {
		this.Entrep�t = Entrep�t;
	}
	
	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
			sb.append("Student[");
			sb.append("Id voiture:"+this.id_voiture);
			sb.append(",Marque:"+this.Marque);
			sb.append(",Mod�le:"+this.Mod�le);
			sb.append(",Couleur:"+this.Couleur);
			sb.append(",Ann�e_de_production:"+this.Ann�e_de_production);
			sb.append(",Transmission:"+this.Transmission);
			sb.append(",Type_de_carburant:"+this.Type_de_carburant);
			sb.append(",Pays_de_provenance:"+this.Pays_de_provenance);
			sb.append(",Prix:"+this.Prix);
			sb.append(",Entrep�t:"+this.Entrep�t);
			sb.append("]");
		return sb.toString();
	}

}
