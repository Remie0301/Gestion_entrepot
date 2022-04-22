package cyber;

public class QueryStatement {
	public final static String ADD_CAR_QUERY = "INSERT INTO voiture (Marque,Modèle,Couleur,Année_de_production,Transmission,Type_de_carburant,Pays_de_provenance,Prix,Entrepôt) VALUES(?,?,?,?,?,?,?,?,?)";
	public final static String UPDATE_CAR_QUERY = "UPDATE voiture SET (Marque=?,Modèle=?,Couleur=?,Année_de_production=?,Transmission=?,Type_de_carburant=?,Pays_de_provenance=?,Prix=?,Entrepôt=? where id_voiture =?";
	public final static String CHECK_QUERY = "Select * From voiture";
	public final static String DELETE_CAR_QUERY = "Delete from voiture WHERE id_voiture=?";
	
}
