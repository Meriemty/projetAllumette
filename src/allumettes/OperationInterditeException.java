package allumettes;

/** Exception lev�e quand une op�ration est interdite.
 * @author Meriem El Air
 * @version 1
 */
public class OperationInterditeException extends RuntimeException {
    /** Num�ro de version pour la s�rialisation. */
    private static final long serialVersionUID = 1L;
    
    /** Constructeur de l'exception.
     * @param message le message d'erreur
     */
    public OperationInterditeException(String message) {
        super(message);
    }
} 