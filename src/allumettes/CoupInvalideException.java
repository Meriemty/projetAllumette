package allumettes;

/** Exception qui indique qu'un coup invalide est jou�.
 * @author	Meriem El Air
 * @version	1
 */
public class CoupInvalideException extends Exception {

	/** Num�ro de version pour la s�rialisation. */
	private static final long serialVersionUID = 1L;

	/** Le coup jou�. */
	private int coup;

	/** Probl�me identifi�. */
	private String probleme;

	/** Initialiser CoupInvalideException � partir du coup jou�
	 * et du probl�me identifi�.  Par exemple, on peut avoir coup
	 * qui vaut 0 et le probl�me "< 1".
	 * @param coup le coup jou�
	 * @param probleme le probl�me identifi�
	 */
	public CoupInvalideException(int coup, String probleme) {
		super("Coup invalide car " + probleme + " : " + coup);
		this.coup = coup;
		this.probleme = probleme;
	}

	/** Retourner le coup.
	  * @return le coup */
	public int getCoup() {
		return this.coup;
	}

	/** Indiquer le probl�me.
	  * @return le probl�me */
	public String getProbleme() {
		return this.probleme;
	}

}
