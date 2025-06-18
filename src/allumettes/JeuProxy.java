package allumettes;

public class JeuProxy implements Jeu {
    /** Le jeu r�el. */
    private Jeu jeu;
    
    /** Le joueur qui utilise ce proxy. */
    private Joueur joueur;
    
    /** Constructeur du proxy.
     * @param jeu le jeu r�el
     * @param joueur le joueur qui utilise ce proxy
     */
    public JeuProxy(Jeu jeu, Joueur joueur) {
        this.jeu = jeu;
        this.joueur = joueur;
    }
    
    @Override
    public int getNombreAllumettes() {
        return this.jeu.getNombreAllumettes();
    }
    
    @Override
    public void retirer(int prise) throws CoupInvalideException {
        throw new OperationInterditeException(
            "Triche : " + this.joueur.getNom() + " a tent� de tricher !");
    }
    
    @Override
    public String toString() {
        return this.jeu.toString();
    }
}
