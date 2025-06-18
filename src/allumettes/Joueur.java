package allumettes;

public class Joueur {
	/** Le nom du joueur. */
	private String nom;
	
	/** La strat�gie du joueur. */
	private Strategie strategie;
	
	/** Constructeur d'un joueur.
	 * @param nom le nom du joueur
	 * @param strategie la strat�gie du joueur
	 */
	public Joueur(String nom, Strategie strategie) {
		this.nom = nom;
		this.strategie = strategie;
	}
	
	/** Obtenir le nom du joueur.
	 * @return le nom du joueur
	 */
	public String getNom() {
		return this.nom;
	}
	
	/** Obtenir le nombre d'allumettes que le joueur veut prendre.
	 * @param jeu le jeu en cours
	 * @return le nombre d'allumettes à prendre
	 */
	public int getPrise(Jeu jeu) {
		return this.strategie.getPrise(jeu);
	}
	
	/** Obtenir la strat�gie du joueur.
	 * @return la strat�gie du joueur
	 */
	public Strategie getStrategie() {
		return this.strategie;
	}
}
